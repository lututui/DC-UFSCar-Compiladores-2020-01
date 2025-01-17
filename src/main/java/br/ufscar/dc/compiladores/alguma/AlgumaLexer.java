// Generated from C:/Users/74434/Documents/GitHub/analisador-lexico-la-antlr/src/main/java/br/ufscar/dc/compiladores/alguma\Alguma.g4 by ANTLR 4.8
package br.ufscar.dc.compiladores.alguma;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgumaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PR_ALGORITMO=1, PR_DECLARE=2, PR_LEIA=3, PR_ESCREVA=4, PR_CASO=5, PR_SEJA=6, 
		PR_SENAO=7, PR_PARA=8, PR_ATE=9, PR_FACA=10, PR_ENQUANTO=11, PR_SE=12, 
		PR_E=13, PR_ENTAO=14, PR_REGISTRO=15, PR_TIPO=16, PR_PROCEDIMENTO=17, 
		PR_VAR=18, PR_FUNCAO=19, PR_RETORNE=20, PR_CONSTANTE=21, PR_VERDADEIRO=22, 
		PR_FALSO=23, PR_NAO=24, PR_OU=25, PR_FIM_ALGORITMO=26, PR_FIM_CASO=27, 
		PR_FIM_PARA=28, PR_FIM_ENQUANTO=29, PR_FIM_SE=30, PR_FIM_REGISTRO=31, 
		PR_FIM_PROCEDIMENTO=32, PR_FIM_FUNCAO=33, PR_TIPO_LITERAL=34, PR_TIPO_INTEIRO=35, 
		PR_TIPO_REAL=36, PR_TIPO_LOGICO=37, DELIMITADOR_DOIS_PONTOS=38, DELIMITADOR_ABRE_PARENTESES=39, 
		DELIMITADOR_FECHA_PARENTESES=40, DELIMITADOR_VIRGULA=41, DELIMITADOR_ABRE_COLCHETES=42, 
		DELIMITADOR_FECHA_COLCHETES=43, OPERADOR_RANGE=44, OPERADOR_SOMA=45, OPERADOR_SUBTRACAO=46, 
		OPERADOR_MULTIPLICACAO=47, OPERADOR_DIVISAO=48, OPERADOR_MOD=49, OPERADOR_MENOR=50, 
		OPERADOR_MAIOR=51, OPERADOR_DIFERENTE=52, OPERADOR_MAIOR_IGUAL=53, OPERADOR_MENOR_IGUAL=54, 
		OPERADOR_IGUAL=55, OPERADOR_ENDERECO=56, OPERADOR_REGISTRO=57, OPERADOR_ATRIBUICAO=58, 
		TIPO_ENDERECO=59, CADEIA=60, NUM_INT=61, NUM_REAL=62, COMENTARIO=63, ESPACO_EM_BRANCO=64, 
		COMENTARIO_NAO_FECHADO=65, CADEIA_NAO_FECHADA=66, IDENT=67;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PR_ALGORITMO", "PR_DECLARE", "PR_LEIA", "PR_ESCREVA", "PR_CASO", "PR_SEJA", 
			"PR_SENAO", "PR_PARA", "PR_ATE", "PR_FACA", "PR_ENQUANTO", "PR_SE", "PR_E", 
			"PR_ENTAO", "PR_REGISTRO", "PR_TIPO", "PR_PROCEDIMENTO", "PR_VAR", "PR_FUNCAO", 
			"PR_RETORNE", "PR_CONSTANTE", "PR_VERDADEIRO", "PR_FALSO", "PR_NAO", 
			"PR_OU", "PR_FIM_ALGORITMO", "PR_FIM_CASO", "PR_FIM_PARA", "PR_FIM_ENQUANTO", 
			"PR_FIM_SE", "PR_FIM_REGISTRO", "PR_FIM_PROCEDIMENTO", "PR_FIM_FUNCAO", 
			"PR_TIPO_LITERAL", "PR_TIPO_INTEIRO", "PR_TIPO_REAL", "PR_TIPO_LOGICO", 
			"DELIMITADOR_DOIS_PONTOS", "DELIMITADOR_ABRE_PARENTESES", "DELIMITADOR_FECHA_PARENTESES", 
			"DELIMITADOR_VIRGULA", "DELIMITADOR_ABRE_COLCHETES", "DELIMITADOR_FECHA_COLCHETES", 
			"OPERADOR_RANGE", "OPERADOR_SOMA", "OPERADOR_SUBTRACAO", "OPERADOR_MULTIPLICACAO", 
			"OPERADOR_DIVISAO", "OPERADOR_MOD", "OPERADOR_MENOR", "OPERADOR_MAIOR", 
			"OPERADOR_DIFERENTE", "OPERADOR_MAIOR_IGUAL", "OPERADOR_MENOR_IGUAL", 
			"OPERADOR_IGUAL", "OPERADOR_ENDERECO", "OPERADOR_REGISTRO", "OPERADOR_ATRIBUICAO", 
			"TIPO_ENDERECO", "CADEIA", "LETRA", "NUM_INT", "NUM_REAL", "COMENTARIO", 
			"ESPACO_EM_BRANCO", "COMENTARIO_NAO_FECHADO", "CADEIA_NAO_FECHADA", "IDENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'declare'", "'leia'", "'escreva'", "'caso'", "'seja'", 
			"'senao'", "'para'", "'ate'", "'faca'", "'enquanto'", "'se'", "'e'", 
			"'entao'", "'registro'", "'tipo'", "'procedimento'", "'var'", "'funcao'", 
			"'retorne'", "'constante'", "'verdadeiro'", "'falso'", "'nao'", "'ou'", 
			"'fim_algoritmo'", "'fim_caso'", "'fim_para'", "'fim_enquanto'", "'fim_se'", 
			"'fim_registro'", "'fim_procedimento'", "'fim_funcao'", "'literal'", 
			"'inteiro'", "'real'", "'logico'", "':'", "'('", "')'", "','", "'['", 
			"']'", "'..'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<>'", 
			"'>='", "'<='", "'='", "'&'", "'.'", "'<-'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PR_ALGORITMO", "PR_DECLARE", "PR_LEIA", "PR_ESCREVA", "PR_CASO", 
			"PR_SEJA", "PR_SENAO", "PR_PARA", "PR_ATE", "PR_FACA", "PR_ENQUANTO", 
			"PR_SE", "PR_E", "PR_ENTAO", "PR_REGISTRO", "PR_TIPO", "PR_PROCEDIMENTO", 
			"PR_VAR", "PR_FUNCAO", "PR_RETORNE", "PR_CONSTANTE", "PR_VERDADEIRO", 
			"PR_FALSO", "PR_NAO", "PR_OU", "PR_FIM_ALGORITMO", "PR_FIM_CASO", "PR_FIM_PARA", 
			"PR_FIM_ENQUANTO", "PR_FIM_SE", "PR_FIM_REGISTRO", "PR_FIM_PROCEDIMENTO", 
			"PR_FIM_FUNCAO", "PR_TIPO_LITERAL", "PR_TIPO_INTEIRO", "PR_TIPO_REAL", 
			"PR_TIPO_LOGICO", "DELIMITADOR_DOIS_PONTOS", "DELIMITADOR_ABRE_PARENTESES", 
			"DELIMITADOR_FECHA_PARENTESES", "DELIMITADOR_VIRGULA", "DELIMITADOR_ABRE_COLCHETES", 
			"DELIMITADOR_FECHA_COLCHETES", "OPERADOR_RANGE", "OPERADOR_SOMA", "OPERADOR_SUBTRACAO", 
			"OPERADOR_MULTIPLICACAO", "OPERADOR_DIVISAO", "OPERADOR_MOD", "OPERADOR_MENOR", 
			"OPERADOR_MAIOR", "OPERADOR_DIFERENTE", "OPERADOR_MAIOR_IGUAL", "OPERADOR_MENOR_IGUAL", 
			"OPERADOR_IGUAL", "OPERADOR_ENDERECO", "OPERADOR_REGISTRO", "OPERADOR_ATRIBUICAO", 
			"TIPO_ENDERECO", "CADEIA", "NUM_INT", "NUM_REAL", "COMENTARIO", "ESPACO_EM_BRANCO", 
			"COMENTARIO_NAO_FECHADO", "CADEIA_NAO_FECHADA", "IDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public AlgumaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Alguma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u0220\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3<\3<\3=\3=\7=\u01d9\n"+
		"=\f=\16=\u01dc\13=\3=\3=\3>\3>\3?\6?\u01e3\n?\r?\16?\u01e4\3@\3@\3@\3"+
		"@\3A\3A\7A\u01ed\nA\fA\16A\u01f0\13A\3A\3A\3A\3A\3B\6B\u01f7\nB\rB\16"+
		"B\u01f8\3B\3B\3C\3C\7C\u01ff\nC\fC\16C\u0202\13C\3C\6C\u0205\nC\rC\16"+
		"C\u0206\3D\3D\7D\u020b\nD\fD\16D\u020e\13D\3D\6D\u0211\nD\rD\16D\u0212"+
		"\3E\3E\5E\u0217\nE\3E\3E\3E\7E\u021c\nE\fE\16E\u021f\13E\6\u01da\u01ee"+
		"\u0206\u0212\2F\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{\2}?\177@\u0081A\u0083B\u0085C\u0087D\u0089"+
		"E\3\2\7\4\2\f\f\17\17\4\2C\\c|\5\2\13\f\17\17\"\"\3\2\177\177\3\2$$\2"+
		"\u022a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\3\u008b\3\2\2\2\5\u0095\3\2\2"+
		"\2\7\u009d\3\2\2\2\t\u00a2\3\2\2\2\13\u00aa\3\2\2\2\r\u00af\3\2\2\2\17"+
		"\u00b4\3\2\2\2\21\u00ba\3\2\2\2\23\u00bf\3\2\2\2\25\u00c3\3\2\2\2\27\u00c8"+
		"\3\2\2\2\31\u00d1\3\2\2\2\33\u00d4\3\2\2\2\35\u00d6\3\2\2\2\37\u00dc\3"+
		"\2\2\2!\u00e5\3\2\2\2#\u00ea\3\2\2\2%\u00f7\3\2\2\2\'\u00fb\3\2\2\2)\u0102"+
		"\3\2\2\2+\u010a\3\2\2\2-\u0114\3\2\2\2/\u011f\3\2\2\2\61\u0125\3\2\2\2"+
		"\63\u0129\3\2\2\2\65\u012c\3\2\2\2\67\u013a\3\2\2\29\u0143\3\2\2\2;\u014c"+
		"\3\2\2\2=\u0159\3\2\2\2?\u0160\3\2\2\2A\u016d\3\2\2\2C\u017e\3\2\2\2E"+
		"\u0189\3\2\2\2G\u0191\3\2\2\2I\u0199\3\2\2\2K\u019e\3\2\2\2M\u01a5\3\2"+
		"\2\2O\u01a7\3\2\2\2Q\u01a9\3\2\2\2S\u01ab\3\2\2\2U\u01ad\3\2\2\2W\u01af"+
		"\3\2\2\2Y\u01b1\3\2\2\2[\u01b4\3\2\2\2]\u01b6\3\2\2\2_\u01b8\3\2\2\2a"+
		"\u01ba\3\2\2\2c\u01bc\3\2\2\2e\u01be\3\2\2\2g\u01c0\3\2\2\2i\u01c2\3\2"+
		"\2\2k\u01c5\3\2\2\2m\u01c8\3\2\2\2o\u01cb\3\2\2\2q\u01cd\3\2\2\2s\u01cf"+
		"\3\2\2\2u\u01d1\3\2\2\2w\u01d4\3\2\2\2y\u01d6\3\2\2\2{\u01df\3\2\2\2}"+
		"\u01e2\3\2\2\2\177\u01e6\3\2\2\2\u0081\u01ea\3\2\2\2\u0083\u01f6\3\2\2"+
		"\2\u0085\u01fc\3\2\2\2\u0087\u0208\3\2\2\2\u0089\u0216\3\2\2\2\u008b\u008c"+
		"\7c\2\2\u008c\u008d\7n\2\2\u008d\u008e\7i\2\2\u008e\u008f\7q\2\2\u008f"+
		"\u0090\7t\2\2\u0090\u0091\7k\2\2\u0091\u0092\7v\2\2\u0092\u0093\7o\2\2"+
		"\u0093\u0094\7q\2\2\u0094\4\3\2\2\2\u0095\u0096\7f\2\2\u0096\u0097\7g"+
		"\2\2\u0097\u0098\7e\2\2\u0098\u0099\7n\2\2\u0099\u009a\7c\2\2\u009a\u009b"+
		"\7t\2\2\u009b\u009c\7g\2\2\u009c\6\3\2\2\2\u009d\u009e\7n\2\2\u009e\u009f"+
		"\7g\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7c\2\2\u00a1\b\3\2\2\2\u00a2\u00a3"+
		"\7g\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7t\2\2\u00a6"+
		"\u00a7\7g\2\2\u00a7\u00a8\7x\2\2\u00a8\u00a9\7c\2\2\u00a9\n\3\2\2\2\u00aa"+
		"\u00ab\7e\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7q\2\2"+
		"\u00ae\f\3\2\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7l"+
		"\2\2\u00b2\u00b3\7c\2\2\u00b3\16\3\2\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6"+
		"\7g\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7q\2\2\u00b9"+
		"\20\3\2\2\2\u00ba\u00bb\7r\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7t\2\2\u00bd"+
		"\u00be\7c\2\2\u00be\22\3\2\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7v\2\2\u00c1"+
		"\u00c2\7g\2\2\u00c2\24\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7c\2\2\u00c5"+
		"\u00c6\7e\2\2\u00c6\u00c7\7c\2\2\u00c7\26\3\2\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"\u00ca\7p\2\2\u00ca\u00cb\7s\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7c\2\2"+
		"\u00cd\u00ce\7p\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7q\2\2\u00d0\30\3\2"+
		"\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7g\2\2\u00d3\32\3\2\2\2\u00d4\u00d5"+
		"\7g\2\2\u00d5\34\3\2\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9"+
		"\7v\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7q\2\2\u00db\36\3\2\2\2\u00dc\u00dd"+
		"\7t\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7i\2\2\u00df\u00e0\7k\2\2\u00e0"+
		"\u00e1\7u\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7q\2\2"+
		"\u00e4 \3\2\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7r\2"+
		"\2\u00e8\u00e9\7q\2\2\u00e9\"\3\2\2\2\u00ea\u00eb\7r\2\2\u00eb\u00ec\7"+
		"t\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0"+
		"\7f\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7o\2\2\u00f2\u00f3\7g\2\2\u00f3"+
		"\u00f4\7p\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7q\2\2\u00f6$\3\2\2\2\u00f7"+
		"\u00f8\7x\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7t\2\2\u00fa&\3\2\2\2\u00fb"+
		"\u00fc\7h\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7e\2\2"+
		"\u00ff\u0100\7c\2\2\u0100\u0101\7q\2\2\u0101(\3\2\2\2\u0102\u0103\7t\2"+
		"\2\u0103\u0104\7g\2\2\u0104\u0105\7v\2\2\u0105\u0106\7q\2\2\u0106\u0107"+
		"\7t\2\2\u0107\u0108\7p\2\2\u0108\u0109\7g\2\2\u0109*\3\2\2\2\u010a\u010b"+
		"\7e\2\2\u010b\u010c\7q\2\2\u010c\u010d\7p\2\2\u010d\u010e\7u\2\2\u010e"+
		"\u010f\7v\2\2\u010f\u0110\7c\2\2\u0110\u0111\7p\2\2\u0111\u0112\7v\2\2"+
		"\u0112\u0113\7g\2\2\u0113,\3\2\2\2\u0114\u0115\7x\2\2\u0115\u0116\7g\2"+
		"\2\u0116\u0117\7t\2\2\u0117\u0118\7f\2\2\u0118\u0119\7c\2\2\u0119\u011a"+
		"\7f\2\2\u011a\u011b\7g\2\2\u011b\u011c\7k\2\2\u011c\u011d\7t\2\2\u011d"+
		"\u011e\7q\2\2\u011e.\3\2\2\2\u011f\u0120\7h\2\2\u0120\u0121\7c\2\2\u0121"+
		"\u0122\7n\2\2\u0122\u0123\7u\2\2\u0123\u0124\7q\2\2\u0124\60\3\2\2\2\u0125"+
		"\u0126\7p\2\2\u0126\u0127\7c\2\2\u0127\u0128\7q\2\2\u0128\62\3\2\2\2\u0129"+
		"\u012a\7q\2\2\u012a\u012b\7w\2\2\u012b\64\3\2\2\2\u012c\u012d\7h\2\2\u012d"+
		"\u012e\7k\2\2\u012e\u012f\7o\2\2\u012f\u0130\7a\2\2\u0130\u0131\7c\2\2"+
		"\u0131\u0132\7n\2\2\u0132\u0133\7i\2\2\u0133\u0134\7q\2\2\u0134\u0135"+
		"\7t\2\2\u0135\u0136\7k\2\2\u0136\u0137\7v\2\2\u0137\u0138\7o\2\2\u0138"+
		"\u0139\7q\2\2\u0139\66\3\2\2\2\u013a\u013b\7h\2\2\u013b\u013c\7k\2\2\u013c"+
		"\u013d\7o\2\2\u013d\u013e\7a\2\2\u013e\u013f\7e\2\2\u013f\u0140\7c\2\2"+
		"\u0140\u0141\7u\2\2\u0141\u0142\7q\2\2\u01428\3\2\2\2\u0143\u0144\7h\2"+
		"\2\u0144\u0145\7k\2\2\u0145\u0146\7o\2\2\u0146\u0147\7a\2\2\u0147\u0148"+
		"\7r\2\2\u0148\u0149\7c\2\2\u0149\u014a\7t\2\2\u014a\u014b\7c\2\2\u014b"+
		":\3\2\2\2\u014c\u014d\7h\2\2\u014d\u014e\7k\2\2\u014e\u014f\7o\2\2\u014f"+
		"\u0150\7a\2\2\u0150\u0151\7g\2\2\u0151\u0152\7p\2\2\u0152\u0153\7s\2\2"+
		"\u0153\u0154\7w\2\2\u0154\u0155\7c\2\2\u0155\u0156\7p\2\2\u0156\u0157"+
		"\7v\2\2\u0157\u0158\7q\2\2\u0158<\3\2\2\2\u0159\u015a\7h\2\2\u015a\u015b"+
		"\7k\2\2\u015b\u015c\7o\2\2\u015c\u015d\7a\2\2\u015d\u015e\7u\2\2\u015e"+
		"\u015f\7g\2\2\u015f>\3\2\2\2\u0160\u0161\7h\2\2\u0161\u0162\7k\2\2\u0162"+
		"\u0163\7o\2\2\u0163\u0164\7a\2\2\u0164\u0165\7t\2\2\u0165\u0166\7g\2\2"+
		"\u0166\u0167\7i\2\2\u0167\u0168\7k\2\2\u0168\u0169\7u\2\2\u0169\u016a"+
		"\7v\2\2\u016a\u016b\7t\2\2\u016b\u016c\7q\2\2\u016c@\3\2\2\2\u016d\u016e"+
		"\7h\2\2\u016e\u016f\7k\2\2\u016f\u0170\7o\2\2\u0170\u0171\7a\2\2\u0171"+
		"\u0172\7r\2\2\u0172\u0173\7t\2\2\u0173\u0174\7q\2\2\u0174\u0175\7e\2\2"+
		"\u0175\u0176\7g\2\2\u0176\u0177\7f\2\2\u0177\u0178\7k\2\2\u0178\u0179"+
		"\7o\2\2\u0179\u017a\7g\2\2\u017a\u017b\7p\2\2\u017b\u017c\7v\2\2\u017c"+
		"\u017d\7q\2\2\u017dB\3\2\2\2\u017e\u017f\7h\2\2\u017f\u0180\7k\2\2\u0180"+
		"\u0181\7o\2\2\u0181\u0182\7a\2\2\u0182\u0183\7h\2\2\u0183\u0184\7w\2\2"+
		"\u0184\u0185\7p\2\2\u0185\u0186\7e\2\2\u0186\u0187\7c\2\2\u0187\u0188"+
		"\7q\2\2\u0188D\3\2\2\2\u0189\u018a\7n\2\2\u018a\u018b\7k\2\2\u018b\u018c"+
		"\7v\2\2\u018c\u018d\7g\2\2\u018d\u018e\7t\2\2\u018e\u018f\7c\2\2\u018f"+
		"\u0190\7n\2\2\u0190F\3\2\2\2\u0191\u0192\7k\2\2\u0192\u0193\7p\2\2\u0193"+
		"\u0194\7v\2\2\u0194\u0195\7g\2\2\u0195\u0196\7k\2\2\u0196\u0197\7t\2\2"+
		"\u0197\u0198\7q\2\2\u0198H\3\2\2\2\u0199\u019a\7t\2\2\u019a\u019b\7g\2"+
		"\2\u019b\u019c\7c\2\2\u019c\u019d\7n\2\2\u019dJ\3\2\2\2\u019e\u019f\7"+
		"n\2\2\u019f\u01a0\7q\2\2\u01a0\u01a1\7i\2\2\u01a1\u01a2\7k\2\2\u01a2\u01a3"+
		"\7e\2\2\u01a3\u01a4\7q\2\2\u01a4L\3\2\2\2\u01a5\u01a6\7<\2\2\u01a6N\3"+
		"\2\2\2\u01a7\u01a8\7*\2\2\u01a8P\3\2\2\2\u01a9\u01aa\7+\2\2\u01aaR\3\2"+
		"\2\2\u01ab\u01ac\7.\2\2\u01acT\3\2\2\2\u01ad\u01ae\7]\2\2\u01aeV\3\2\2"+
		"\2\u01af\u01b0\7_\2\2\u01b0X\3\2\2\2\u01b1\u01b2\7\60\2\2\u01b2\u01b3"+
		"\7\60\2\2\u01b3Z\3\2\2\2\u01b4\u01b5\7-\2\2\u01b5\\\3\2\2\2\u01b6\u01b7"+
		"\7/\2\2\u01b7^\3\2\2\2\u01b8\u01b9\7,\2\2\u01b9`\3\2\2\2\u01ba\u01bb\7"+
		"\61\2\2\u01bbb\3\2\2\2\u01bc\u01bd\7\'\2\2\u01bdd\3\2\2\2\u01be\u01bf"+
		"\7>\2\2\u01bff\3\2\2\2\u01c0\u01c1\7@\2\2\u01c1h\3\2\2\2\u01c2\u01c3\7"+
		">\2\2\u01c3\u01c4\7@\2\2\u01c4j\3\2\2\2\u01c5\u01c6\7@\2\2\u01c6\u01c7"+
		"\7?\2\2\u01c7l\3\2\2\2\u01c8\u01c9\7>\2\2\u01c9\u01ca\7?\2\2\u01can\3"+
		"\2\2\2\u01cb\u01cc\7?\2\2\u01ccp\3\2\2\2\u01cd\u01ce\7(\2\2\u01cer\3\2"+
		"\2\2\u01cf\u01d0\7\60\2\2\u01d0t\3\2\2\2\u01d1\u01d2\7>\2\2\u01d2\u01d3"+
		"\7/\2\2\u01d3v\3\2\2\2\u01d4\u01d5\7`\2\2\u01d5x\3\2\2\2\u01d6\u01da\7"+
		"$\2\2\u01d7\u01d9\n\2\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc\u01da\3\2"+
		"\2\2\u01dd\u01de\7$\2\2\u01dez\3\2\2\2\u01df\u01e0\t\3\2\2\u01e0|\3\2"+
		"\2\2\u01e1\u01e3\4\62;\2\u01e2\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5~\3\2\2\2\u01e6\u01e7\5}?\2\u01e7"+
		"\u01e8\7\60\2\2\u01e8\u01e9\5}?\2\u01e9\u0080\3\2\2\2\u01ea\u01ee\7}\2"+
		"\2\u01eb\u01ed\n\2\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ef"+
		"\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1"+
		"\u01f2\7\177\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\bA\2\2\u01f4\u0082\3"+
		"\2\2\2\u01f5\u01f7\t\4\2\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\bB"+
		"\2\2\u01fb\u0084\3\2\2\2\u01fc\u0200\7}\2\2\u01fd\u01ff\n\5\2\2\u01fe"+
		"\u01fd\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2"+
		"\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0205\t\2\2\2\u0204"+
		"\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0206\u0204\3\2"+
		"\2\2\u0207\u0086\3\2\2\2\u0208\u020c\7$\2\2\u0209\u020b\n\6\2\2\u020a"+
		"\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2"+
		"\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0211\t\2\2\2\u0210"+
		"\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0212\u0210\3\2"+
		"\2\2\u0213\u0088\3\2\2\2\u0214\u0217\5{>\2\u0215\u0217\7a\2\2\u0216\u0214"+
		"\3\2\2\2\u0216\u0215\3\2\2\2\u0217\u021d\3\2\2\2\u0218\u021c\5{>\2\u0219"+
		"\u021c\5}?\2\u021a\u021c\7a\2\2\u021b\u0218\3\2\2\2\u021b\u0219\3\2\2"+
		"\2\u021b\u021a\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e"+
		"\3\2\2\2\u021e\u008a\3\2\2\2\u021f\u021d\3\2\2\2\16\2\u01da\u01e4\u01ee"+
		"\u01f8\u0200\u0206\u020c\u0212\u0216\u021b\u021d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}