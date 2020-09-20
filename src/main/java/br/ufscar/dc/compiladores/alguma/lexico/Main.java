package br.ufscar.dc.compiladores.alguma.lexico;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;

public class Main {
    public static void main(String[] args) {
        try {
            final CharStream charStream = CharStreams.fromFileName(args[0]);
            final FileWriter outputWriter = new FileWriter(new File(args[1]));
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

            AlgumaErrorListener.INSTANCE.fileWriter = outputWriter;

            parser.removeErrorListeners();
            parser.addErrorListener(AlgumaErrorListener.INSTANCE);

            parser.programa();

            outputWriter.write("Fim da compilacao\n");

            outputWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void errorWriter(FileWriter fileWriter, int linha, String msg) throws IOException {
        fileWriter.write("Linha " + linha + ": " + msg + "\n");
    }
}
