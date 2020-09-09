package br.ufscar.dc.compiladores.alguma.lexico;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class Main {
    public static void main(String[] args) {
        try {
            final CharStream charStream = CharStreams.fromFileName(args[0]);
            final FileWriter outputWriter = new FileWriter(new File(args[1]));
            final AlgumaLexer lexer = new AlgumaLexer(charStream);

            lexer.removeErrorListeners();
            lexer.addErrorListener(AlgumaLexerErrorListener.INSTANCE);

            while (true) {
                final Token t = lexer.nextToken();

                if (t.getType() == Token.EOF) {
                    break;
                } else if (t.getType() == AlgumaLexer.COMENTARIO_NAO_FECHADO) {
                    errorWriter(outputWriter, t.getLine(), "comentario nao fechado");
                    break;
                } else if (t.getType() == AlgumaLexer.CADEIA_NAO_FECHADA) {
                    errorWriter(outputWriter, t.getLine(), "cadeia literal nao fechada");
                    break;
                } else if (AlgumaLexerErrorListener.INSTANCE.hasError) {
                    errorWriter(
                            outputWriter,
                            AlgumaLexerErrorListener.INSTANCE.errorLine,
                            AlgumaLexerErrorListener.INSTANCE.errorToken + " - simbolo nao identificado"
                    );
                    break;
                }

                outputWriter.write("<'" + t.getText() + "'," + AlgumaLexer.VOCABULARY.getDisplayName(t.getType()) + ">\n");
            }

            outputWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void errorWriter(FileWriter fileWriter, int linha, String msg) throws IOException {
        fileWriter.write("Linha " + linha + ": " + msg + "\n");
    }
}
