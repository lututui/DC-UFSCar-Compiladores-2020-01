package br.ufscar.dc.compiladores.alguma.lexico;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.Interval;

public class AlgumaLexerErrorListener extends BaseErrorListener {
    public static final AlgumaLexerErrorListener INSTANCE = new AlgumaLexerErrorListener();

    public int errorLine;
    public String errorToken;
    public boolean hasError = false;

    @Override
    public void syntaxError(
            Recognizer<?, ?> recognizer, Object offendingSymbolParser, int line, int charPositionInLine, String msg,
            RecognitionException e
    ) {
        final LexerNoViableAltException exception = (LexerNoViableAltException) e;
        final int tokenIdx = exception.getStartIndex();

        errorToken = exception.getInputStream().getText(Interval.of(tokenIdx, tokenIdx));
        errorLine = line;
        hasError = true;
    }
}
