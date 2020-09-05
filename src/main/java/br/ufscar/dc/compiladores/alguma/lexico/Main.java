package br.ufscar.dc.compiladores.alguma.lexico;

import java.io.IOException;

import org.antlr.runtime.Token;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class Main {
    public static void main(String[] args) {
        try {
            final CharStream charStream = CharStreams.fromFileName(args[0]);
            final AlgumaLexer lexer = new AlgumaLexer(charStream);

            while (lexer.nextToken().getType() != Token.EOF) {
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
