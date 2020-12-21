package br.ufscar.dc.compiladores.alguma;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import br.ufscar.dc.compiladores.alguma.semantico.ErroSemantico;
import br.ufscar.dc.compiladores.alguma.semantico.Visitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Main {
    public static void main(String[] args) {
        try {
            final CharStream charStream = CharStreams.fromFileName(args[0]);
            final FileWriter outputWriter = new FileWriter(new File(args[1]));

            AlgumaErrorListener.INSTANCE.fileWriter = outputWriter;

            final AlgumaLexer lexer = new AlgumaLexer(charStream) {
                @Override
                public Token nextToken() {
                    final Token t = super.nextToken();

                    try {
                        if (t.getType() == AlgumaLexer.COMENTARIO_NAO_FECHADO) {
                            outputWriter.write("Linha " + _tokenStartLine + ": comentario nao fechado\n");
                            AlgumaErrorListener.INSTANCE.hasError = true;
                        } else if (t.getType() == AlgumaLexer.CADEIA_NAO_FECHADA) {
                            outputWriter.write("Linha " + _tokenStartLine + ": cadeia literal nao fechada\n");
                            AlgumaErrorListener.INSTANCE.hasError = true;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    return t;
                }
            };

            lexer.removeErrorListeners();
            lexer.addErrorListener(AlgumaErrorListener.INSTANCE);

            final AlgumaParser parser = new AlgumaParser(new CommonTokenStream(lexer));

            parser.removeErrorListeners();
            parser.addErrorListener(AlgumaErrorListener.INSTANCE);

            final Visitor v = new Visitor();

            v.visit(parser.programa());

            for (ErroSemantico it : v.getErros()) {
                outputWriter.write(it.getMessage() + "\n");
            }

            outputWriter.write("Fim da compilacao\n");

            outputWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
