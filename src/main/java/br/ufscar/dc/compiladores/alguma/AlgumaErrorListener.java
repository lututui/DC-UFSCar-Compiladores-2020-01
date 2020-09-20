package br.ufscar.dc.compiladores.alguma;

import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.Token;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.Interval;

public class AlgumaErrorListener extends BaseErrorListener {
    public static final AlgumaErrorListener INSTANCE = new AlgumaErrorListener();

    public FileWriter fileWriter;
    public boolean hasError = false;

    @Override
    public void syntaxError(
            Recognizer<?, ?> recognizer, Object oSP, int line, int charPositionInLine, String msg,
            RecognitionException e
    ) {
        if (hasError) {
            return;
        }

        if (e instanceof LexerNoViableAltException) {
            final LexerNoViableAltException exception = (LexerNoViableAltException) e;
            final CharStream inputStream = exception.getInputStream();

            try {
                fileWriter.write("Linha " +
                        line + ": " +
                        inputStream.getText(Interval.of(exception.getStartIndex(), inputStream.index())) +
                        " - simbolo nao identificado" + "\n");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }


            hasError = true;
        } else if (oSP instanceof CommonToken) {
            final CommonToken offendingSymbolParser = (CommonToken) oSP;

            try {
                if (offendingSymbolParser.getType() == Token.EOF) {
                    fileWriter.write("Linha " + line + ": erro sintatico proximo a EOF\n");
                } else {
                    fileWriter.write("Linha " +
                            line + ": erro sintatico proximo a " +
                            offendingSymbolParser.getText() + "\n");
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            hasError = true;
        }
    }
}
