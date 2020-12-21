// Generated from C:/Users/74434/Documents/GitHub/analisador-lexico-la-antlr/src/main/java/br/ufscar/dc/compiladores/alguma\Alguma.g4 by ANTLR 4.8
package br.ufscar.dc.compiladores.alguma;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgumaParser extends Parser {
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
	public static final int
		RULE_programa = 0, RULE_declaracao = 1, RULE_corpo = 2, RULE_declaracaoGlobal = 3, 
		RULE_cmd = 4, RULE_cmdRetorne = 5, RULE_cmdChamada = 6, RULE_cmdAtribuicao = 7, 
		RULE_cmdFaca = 8, RULE_cmdEnquanto = 9, RULE_cmdPara = 10, RULE_cmdCaso = 11, 
		RULE_selecao = 12, RULE_intervaloNumerico = 13, RULE_inteiro = 14, RULE_cmdSe = 15, 
		RULE_cmdEscreva = 16, RULE_cmdLeia = 17, RULE_cmdSenao = 18, RULE_parametro = 19, 
		RULE_declaracaoLocal = 20, RULE_valorConstante = 21, RULE_variavel = 22, 
		RULE_tipo = 23, RULE_tipoEstendido = 24, RULE_tipoBasico = 25, RULE_registro = 26, 
		RULE_identificador = 27, RULE_dimensao = 28, RULE_expressaoAritmetica = 29, 
		RULE_operadorAritmetico1 = 30, RULE_termoAritmetico = 31, RULE_operadorAritmetico2 = 32, 
		RULE_fatorAritmetico = 33, RULE_parcelaAritmetica = 34, RULE_operadorUnario = 35, 
		RULE_parcelaNaoUnario = 36, RULE_parcelaUnario = 37, RULE_expressaoLogica = 38, 
		RULE_termoLogico = 39, RULE_fatorLogico = 40, RULE_expressaoRelacional = 41, 
		RULE_operadorRelacional = 42, RULE_identificadorEndereco = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracao", "corpo", "declaracaoGlobal", "cmd", "cmdRetorne", 
			"cmdChamada", "cmdAtribuicao", "cmdFaca", "cmdEnquanto", "cmdPara", "cmdCaso", 
			"selecao", "intervaloNumerico", "inteiro", "cmdSe", "cmdEscreva", "cmdLeia", 
			"cmdSenao", "parametro", "declaracaoLocal", "valorConstante", "variavel", 
			"tipo", "tipoEstendido", "tipoBasico", "registro", "identificador", "dimensao", 
			"expressaoAritmetica", "operadorAritmetico1", "termoAritmetico", "operadorAritmetico2", 
			"fatorAritmetico", "parcelaAritmetica", "operadorUnario", "parcelaNaoUnario", 
			"parcelaUnario", "expressaoLogica", "termoLogico", "fatorLogico", "expressaoRelacional", 
			"operadorRelacional", "identificadorEndereco"
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

	@Override
	public String getGrammarFileName() { return "Alguma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlgumaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PR_ALGORITMO() { return getToken(AlgumaParser.PR_ALGORITMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode PR_FIM_ALGORITMO() { return getToken(AlgumaParser.PR_FIM_ALGORITMO, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_DECLARE) | (1L << PR_TIPO) | (1L << PR_PROCEDIMENTO) | (1L << PR_FUNCAO) | (1L << PR_CONSTANTE))) != 0)) {
				{
				{
				setState(88);
				declaracao();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(PR_ALGORITMO);
			setState(95);
			corpo();
			setState(96);
			match(PR_FIM_ALGORITMO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaoLocalContext declaracaoLocal() {
			return getRuleContext(DeclaracaoLocalContext.class,0);
		}
		public DeclaracaoGlobalContext declaracaoGlobal() {
			return getRuleContext(DeclaracaoGlobalContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_DECLARE:
			case PR_TIPO:
			case PR_CONSTANTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				declaracaoLocal();
				}
				break;
			case PR_PROCEDIMENTO:
			case PR_FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				declaracaoGlobal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public List<DeclaracaoLocalContext> declaracaoLocal() {
			return getRuleContexts(DeclaracaoLocalContext.class);
		}
		public DeclaracaoLocalContext declaracaoLocal(int i) {
			return getRuleContext(DeclaracaoLocalContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_DECLARE) | (1L << PR_TIPO) | (1L << PR_CONSTANTE))) != 0)) {
				{
				{
				setState(102);
				declaracaoLocal();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
				{
				{
				setState(108);
				cmd();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoGlobalContext extends ParserRuleContext {
		public TerminalNode PR_PROCEDIMENTO() { return getToken(AlgumaParser.PR_PROCEDIMENTO, 0); }
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public TerminalNode DELIMITADOR_ABRE_PARENTESES() { return getToken(AlgumaParser.DELIMITADOR_ABRE_PARENTESES, 0); }
		public TerminalNode DELIMITADOR_FECHA_PARENTESES() { return getToken(AlgumaParser.DELIMITADOR_FECHA_PARENTESES, 0); }
		public TerminalNode PR_FIM_PROCEDIMENTO() { return getToken(AlgumaParser.PR_FIM_PROCEDIMENTO, 0); }
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<DeclaracaoLocalContext> declaracaoLocal() {
			return getRuleContexts(DeclaracaoLocalContext.class);
		}
		public DeclaracaoLocalContext declaracaoLocal(int i) {
			return getRuleContext(DeclaracaoLocalContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> DELIMITADOR_VIRGULA() { return getTokens(AlgumaParser.DELIMITADOR_VIRGULA); }
		public TerminalNode DELIMITADOR_VIRGULA(int i) {
			return getToken(AlgumaParser.DELIMITADOR_VIRGULA, i);
		}
		public TerminalNode PR_FUNCAO() { return getToken(AlgumaParser.PR_FUNCAO, 0); }
		public TerminalNode DELIMITADOR_DOIS_PONTOS() { return getToken(AlgumaParser.DELIMITADOR_DOIS_PONTOS, 0); }
		public TipoEstendidoContext tipoEstendido() {
			return getRuleContext(TipoEstendidoContext.class,0);
		}
		public TerminalNode PR_FIM_FUNCAO() { return getToken(AlgumaParser.PR_FIM_FUNCAO, 0); }
		public DeclaracaoGlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoGlobal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracaoGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracaoGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDeclaracaoGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoGlobalContext declaracaoGlobal() throws RecognitionException {
		DeclaracaoGlobalContext _localctx = new DeclaracaoGlobalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracaoGlobal);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(PR_PROCEDIMENTO);
				setState(115);
				match(IDENT);
				setState(116);
				match(DELIMITADOR_ABRE_PARENTESES);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PR_VAR || _la==IDENT) {
					{
					setState(117);
					parametro();
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DELIMITADOR_VIRGULA) {
						{
						{
						setState(118);
						match(DELIMITADOR_VIRGULA);
						setState(119);
						parametro();
						}
						}
						setState(124);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(127);
				match(DELIMITADOR_FECHA_PARENTESES);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_DECLARE) | (1L << PR_TIPO) | (1L << PR_CONSTANTE))) != 0)) {
					{
					{
					setState(128);
					declaracaoLocal();
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
					{
					{
					setState(134);
					cmd();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				match(PR_FIM_PROCEDIMENTO);
				}
				break;
			case PR_FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(PR_FUNCAO);
				setState(142);
				match(IDENT);
				setState(143);
				match(DELIMITADOR_ABRE_PARENTESES);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PR_VAR || _la==IDENT) {
					{
					setState(144);
					parametro();
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DELIMITADOR_VIRGULA) {
						{
						{
						setState(145);
						match(DELIMITADOR_VIRGULA);
						setState(146);
						parametro();
						}
						}
						setState(151);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(154);
				match(DELIMITADOR_FECHA_PARENTESES);
				setState(155);
				match(DELIMITADOR_DOIS_PONTOS);
				setState(156);
				tipoEstendido();
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_DECLARE) | (1L << PR_TIPO) | (1L << PR_CONSTANTE))) != 0)) {
					{
					{
					setState(157);
					declaracaoLocal();
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
					{
					{
					setState(163);
					cmd();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(PR_FIM_FUNCAO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdLeiaContext cmdLeia() {
			return getRuleContext(CmdLeiaContext.class,0);
		}
		public CmdEscrevaContext cmdEscreva() {
			return getRuleContext(CmdEscrevaContext.class,0);
		}
		public CmdSeContext cmdSe() {
			return getRuleContext(CmdSeContext.class,0);
		}
		public CmdCasoContext cmdCaso() {
			return getRuleContext(CmdCasoContext.class,0);
		}
		public CmdParaContext cmdPara() {
			return getRuleContext(CmdParaContext.class,0);
		}
		public CmdEnquantoContext cmdEnquanto() {
			return getRuleContext(CmdEnquantoContext.class,0);
		}
		public CmdFacaContext cmdFaca() {
			return getRuleContext(CmdFacaContext.class,0);
		}
		public CmdAtribuicaoContext cmdAtribuicao() {
			return getRuleContext(CmdAtribuicaoContext.class,0);
		}
		public CmdChamadaContext cmdChamada() {
			return getRuleContext(CmdChamadaContext.class,0);
		}
		public CmdRetorneContext cmdRetorne() {
			return getRuleContext(CmdRetorneContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmd);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				cmdLeia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				cmdEscreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				cmdSe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				cmdCaso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				cmdPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				cmdEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				cmdFaca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(180);
				cmdAtribuicao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(181);
				cmdChamada();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(182);
				cmdRetorne();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdRetorneContext extends ParserRuleContext {
		public TerminalNode PR_RETORNE() { return getToken(AlgumaParser.PR_RETORNE, 0); }
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public CmdRetorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRetorne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdRetorne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdRetorne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdRetorne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdRetorneContext cmdRetorne() throws RecognitionException {
		CmdRetorneContext _localctx = new CmdRetorneContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdRetorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(PR_RETORNE);
			setState(186);
			expressaoLogica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdChamadaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public TerminalNode DELIMITADOR_ABRE_PARENTESES() { return getToken(AlgumaParser.DELIMITADOR_ABRE_PARENTESES, 0); }
		public List<ExpressaoLogicaContext> expressaoLogica() {
			return getRuleContexts(ExpressaoLogicaContext.class);
		}
		public ExpressaoLogicaContext expressaoLogica(int i) {
			return getRuleContext(ExpressaoLogicaContext.class,i);
		}
		public TerminalNode DELIMITADOR_FECHA_PARENTESES() { return getToken(AlgumaParser.DELIMITADOR_FECHA_PARENTESES, 0); }
		public List<TerminalNode> DELIMITADOR_VIRGULA() { return getTokens(AlgumaParser.DELIMITADOR_VIRGULA); }
		public TerminalNode DELIMITADOR_VIRGULA(int i) {
			return getToken(AlgumaParser.DELIMITADOR_VIRGULA, i);
		}
		public CmdChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdChamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdChamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdChamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdChamadaContext cmdChamada() throws RecognitionException {
		CmdChamadaContext _localctx = new CmdChamadaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(IDENT);
			setState(189);
			match(DELIMITADOR_ABRE_PARENTESES);
			setState(190);
			expressaoLogica();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITADOR_VIRGULA) {
				{
				{
				setState(191);
				match(DELIMITADOR_VIRGULA);
				setState(192);
				expressaoLogica();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(DELIMITADOR_FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdAtribuicaoContext extends ParserRuleContext {
		public IdentificadorEnderecoContext identificadorEndereco() {
			return getRuleContext(IdentificadorEnderecoContext.class,0);
		}
		public TerminalNode OPERADOR_ATRIBUICAO() { return getToken(AlgumaParser.OPERADOR_ATRIBUICAO, 0); }
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public CmdAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdAtribuicaoContext cmdAtribuicao() throws RecognitionException {
		CmdAtribuicaoContext _localctx = new CmdAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			identificadorEndereco();
			setState(201);
			match(OPERADOR_ATRIBUICAO);
			setState(202);
			expressaoLogica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdFacaContext extends ParserRuleContext {
		public TerminalNode PR_FACA() { return getToken(AlgumaParser.PR_FACA, 0); }
		public TerminalNode PR_ATE() { return getToken(AlgumaParser.PR_ATE, 0); }
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdFacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFaca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdFaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdFaca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdFaca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdFacaContext cmdFaca() throws RecognitionException {
		CmdFacaContext _localctx = new CmdFacaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdFaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(PR_FACA);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
				{
				{
				setState(205);
				cmd();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(PR_ATE);
			setState(212);
			expressaoLogica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdEnquantoContext extends ParserRuleContext {
		public TerminalNode PR_ENQUANTO() { return getToken(AlgumaParser.PR_ENQUANTO, 0); }
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public TerminalNode PR_FACA() { return getToken(AlgumaParser.PR_FACA, 0); }
		public TerminalNode PR_FIM_ENQUANTO() { return getToken(AlgumaParser.PR_FIM_ENQUANTO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdEnquantoContext cmdEnquanto() throws RecognitionException {
		CmdEnquantoContext _localctx = new CmdEnquantoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(PR_ENQUANTO);
			setState(215);
			expressaoLogica();
			setState(216);
			match(PR_FACA);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
				{
				{
				setState(217);
				cmd();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(PR_FIM_ENQUANTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdParaContext extends ParserRuleContext {
		public TerminalNode PR_PARA() { return getToken(AlgumaParser.PR_PARA, 0); }
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public TerminalNode OPERADOR_ATRIBUICAO() { return getToken(AlgumaParser.OPERADOR_ATRIBUICAO, 0); }
		public List<ExpressaoAritmeticaContext> expressaoAritmetica() {
			return getRuleContexts(ExpressaoAritmeticaContext.class);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica(int i) {
			return getRuleContext(ExpressaoAritmeticaContext.class,i);
		}
		public TerminalNode PR_ATE() { return getToken(AlgumaParser.PR_ATE, 0); }
		public TerminalNode PR_FACA() { return getToken(AlgumaParser.PR_FACA, 0); }
		public TerminalNode PR_FIM_PARA() { return getToken(AlgumaParser.PR_FIM_PARA, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdParaContext cmdPara() throws RecognitionException {
		CmdParaContext _localctx = new CmdParaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(PR_PARA);
			setState(226);
			match(IDENT);
			setState(227);
			match(OPERADOR_ATRIBUICAO);
			setState(228);
			expressaoAritmetica();
			setState(229);
			match(PR_ATE);
			setState(230);
			expressaoAritmetica();
			setState(231);
			match(PR_FACA);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
				{
				{
				setState(232);
				cmd();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(PR_FIM_PARA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdCasoContext extends ParserRuleContext {
		public TerminalNode PR_CASO() { return getToken(AlgumaParser.PR_CASO, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode PR_SEJA() { return getToken(AlgumaParser.PR_SEJA, 0); }
		public TerminalNode PR_FIM_CASO() { return getToken(AlgumaParser.PR_FIM_CASO, 0); }
		public List<SelecaoContext> selecao() {
			return getRuleContexts(SelecaoContext.class);
		}
		public SelecaoContext selecao(int i) {
			return getRuleContext(SelecaoContext.class,i);
		}
		public CmdSenaoContext cmdSenao() {
			return getRuleContext(CmdSenaoContext.class,0);
		}
		public CmdCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdCasoContext cmdCaso() throws RecognitionException {
		CmdCasoContext _localctx = new CmdCasoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdCaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(PR_CASO);
			setState(241);
			expressaoAritmetica();
			setState(242);
			match(PR_SEJA);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERADOR_SUBTRACAO || _la==NUM_INT) {
				{
				{
				setState(243);
				selecao();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_SENAO) {
				{
				setState(249);
				cmdSenao();
				}
			}

			setState(252);
			match(PR_FIM_CASO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelecaoContext extends ParserRuleContext {
		public List<IntervaloNumericoContext> intervaloNumerico() {
			return getRuleContexts(IntervaloNumericoContext.class);
		}
		public IntervaloNumericoContext intervaloNumerico(int i) {
			return getRuleContext(IntervaloNumericoContext.class,i);
		}
		public TerminalNode DELIMITADOR_DOIS_PONTOS() { return getToken(AlgumaParser.DELIMITADOR_DOIS_PONTOS, 0); }
		public List<TerminalNode> DELIMITADOR_VIRGULA() { return getTokens(AlgumaParser.DELIMITADOR_VIRGULA); }
		public TerminalNode DELIMITADOR_VIRGULA(int i) {
			return getToken(AlgumaParser.DELIMITADOR_VIRGULA, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitSelecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			intervaloNumerico();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITADOR_VIRGULA) {
				{
				{
				setState(255);
				match(DELIMITADOR_VIRGULA);
				setState(256);
				intervaloNumerico();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(DELIMITADOR_DOIS_PONTOS);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
				{
				{
				setState(263);
				cmd();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervaloNumericoContext extends ParserRuleContext {
		public List<InteiroContext> inteiro() {
			return getRuleContexts(InteiroContext.class);
		}
		public InteiroContext inteiro(int i) {
			return getRuleContext(InteiroContext.class,i);
		}
		public TerminalNode OPERADOR_RANGE() { return getToken(AlgumaParser.OPERADOR_RANGE, 0); }
		public IntervaloNumericoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervaloNumerico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterIntervaloNumerico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitIntervaloNumerico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitIntervaloNumerico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervaloNumericoContext intervaloNumerico() throws RecognitionException {
		IntervaloNumericoContext _localctx = new IntervaloNumericoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_intervaloNumerico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			inteiro();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERADOR_RANGE) {
				{
				setState(270);
				match(OPERADOR_RANGE);
				setState(271);
				inteiro();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InteiroContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(AlgumaParser.NUM_INT, 0); }
		public OperadorUnarioContext operadorUnario() {
			return getRuleContext(OperadorUnarioContext.class,0);
		}
		public InteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitInteiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitInteiro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InteiroContext inteiro() throws RecognitionException {
		InteiroContext _localctx = new InteiroContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inteiro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERADOR_SUBTRACAO) {
				{
				setState(274);
				operadorUnario();
				}
			}

			setState(277);
			match(NUM_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdSeContext extends ParserRuleContext {
		public TerminalNode PR_SE() { return getToken(AlgumaParser.PR_SE, 0); }
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public TerminalNode PR_ENTAO() { return getToken(AlgumaParser.PR_ENTAO, 0); }
		public TerminalNode PR_FIM_SE() { return getToken(AlgumaParser.PR_FIM_SE, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdSenaoContext cmdSenao() {
			return getRuleContext(CmdSenaoContext.class,0);
		}
		public CmdSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdSeContext cmdSe() throws RecognitionException {
		CmdSeContext _localctx = new CmdSeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(PR_SE);
			setState(280);
			expressaoLogica();
			setState(281);
			match(PR_ENTAO);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
				{
				{
				setState(282);
				cmd();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_SENAO) {
				{
				setState(288);
				cmdSenao();
				}
			}

			setState(291);
			match(PR_FIM_SE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdEscrevaContext extends ParserRuleContext {
		public TerminalNode PR_ESCREVA() { return getToken(AlgumaParser.PR_ESCREVA, 0); }
		public TerminalNode DELIMITADOR_ABRE_PARENTESES() { return getToken(AlgumaParser.DELIMITADOR_ABRE_PARENTESES, 0); }
		public List<ExpressaoLogicaContext> expressaoLogica() {
			return getRuleContexts(ExpressaoLogicaContext.class);
		}
		public ExpressaoLogicaContext expressaoLogica(int i) {
			return getRuleContext(ExpressaoLogicaContext.class,i);
		}
		public TerminalNode DELIMITADOR_FECHA_PARENTESES() { return getToken(AlgumaParser.DELIMITADOR_FECHA_PARENTESES, 0); }
		public List<TerminalNode> DELIMITADOR_VIRGULA() { return getTokens(AlgumaParser.DELIMITADOR_VIRGULA); }
		public TerminalNode DELIMITADOR_VIRGULA(int i) {
			return getToken(AlgumaParser.DELIMITADOR_VIRGULA, i);
		}
		public CmdEscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdEscreva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdEscreva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdEscrevaContext cmdEscreva() throws RecognitionException {
		CmdEscrevaContext _localctx = new CmdEscrevaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cmdEscreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(PR_ESCREVA);
			setState(294);
			match(DELIMITADOR_ABRE_PARENTESES);
			setState(295);
			expressaoLogica();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITADOR_VIRGULA) {
				{
				{
				setState(296);
				match(DELIMITADOR_VIRGULA);
				setState(297);
				expressaoLogica();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(DELIMITADOR_FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdLeiaContext extends ParserRuleContext {
		public TerminalNode PR_LEIA() { return getToken(AlgumaParser.PR_LEIA, 0); }
		public TerminalNode DELIMITADOR_ABRE_PARENTESES() { return getToken(AlgumaParser.DELIMITADOR_ABRE_PARENTESES, 0); }
		public List<IdentificadorEnderecoContext> identificadorEndereco() {
			return getRuleContexts(IdentificadorEnderecoContext.class);
		}
		public IdentificadorEnderecoContext identificadorEndereco(int i) {
			return getRuleContext(IdentificadorEnderecoContext.class,i);
		}
		public TerminalNode DELIMITADOR_FECHA_PARENTESES() { return getToken(AlgumaParser.DELIMITADOR_FECHA_PARENTESES, 0); }
		public List<TerminalNode> DELIMITADOR_VIRGULA() { return getTokens(AlgumaParser.DELIMITADOR_VIRGULA); }
		public TerminalNode DELIMITADOR_VIRGULA(int i) {
			return getToken(AlgumaParser.DELIMITADOR_VIRGULA, i);
		}
		public CmdLeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdLeia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdLeia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdLeiaContext cmdLeia() throws RecognitionException {
		CmdLeiaContext _localctx = new CmdLeiaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdLeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(PR_LEIA);
			setState(306);
			match(DELIMITADOR_ABRE_PARENTESES);
			setState(307);
			identificadorEndereco();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITADOR_VIRGULA) {
				{
				{
				setState(308);
				match(DELIMITADOR_VIRGULA);
				setState(309);
				identificadorEndereco();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
			match(DELIMITADOR_FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdSenaoContext extends ParserRuleContext {
		public TerminalNode PR_SENAO() { return getToken(AlgumaParser.PR_SENAO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdSenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSenao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdSenao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdSenao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdSenaoContext cmdSenao() throws RecognitionException {
		CmdSenaoContext _localctx = new CmdSenaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdSenao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(PR_SENAO);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
				{
				{
				setState(318);
				cmd();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DELIMITADOR_DOIS_PONTOS() { return getToken(AlgumaParser.DELIMITADOR_DOIS_PONTOS, 0); }
		public TipoEstendidoContext tipoEstendido() {
			return getRuleContext(TipoEstendidoContext.class,0);
		}
		public TerminalNode PR_VAR() { return getToken(AlgumaParser.PR_VAR, 0); }
		public List<TerminalNode> DELIMITADOR_VIRGULA() { return getTokens(AlgumaParser.DELIMITADOR_VIRGULA); }
		public TerminalNode DELIMITADOR_VIRGULA(int i) {
			return getToken(AlgumaParser.DELIMITADOR_VIRGULA, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_VAR) {
				{
				setState(324);
				match(PR_VAR);
				}
			}

			setState(327);
			identificador();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITADOR_VIRGULA) {
				{
				{
				setState(328);
				match(DELIMITADOR_VIRGULA);
				setState(329);
				identificador();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			match(DELIMITADOR_DOIS_PONTOS);
			setState(336);
			tipoEstendido();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoLocalContext extends ParserRuleContext {
		public TerminalNode PR_DECLARE() { return getToken(AlgumaParser.PR_DECLARE, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode PR_CONSTANTE() { return getToken(AlgumaParser.PR_CONSTANTE, 0); }
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public TerminalNode DELIMITADOR_DOIS_PONTOS() { return getToken(AlgumaParser.DELIMITADOR_DOIS_PONTOS, 0); }
		public TipoBasicoContext tipoBasico() {
			return getRuleContext(TipoBasicoContext.class,0);
		}
		public TerminalNode OPERADOR_IGUAL() { return getToken(AlgumaParser.OPERADOR_IGUAL, 0); }
		public ValorConstanteContext valorConstante() {
			return getRuleContext(ValorConstanteContext.class,0);
		}
		public TerminalNode PR_TIPO() { return getToken(AlgumaParser.PR_TIPO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclaracaoLocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoLocal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracaoLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracaoLocal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDeclaracaoLocal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoLocalContext declaracaoLocal() throws RecognitionException {
		DeclaracaoLocalContext _localctx = new DeclaracaoLocalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaracaoLocal);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(338);
				match(PR_DECLARE);
				setState(339);
				variavel();
				}
				}
				break;
			case PR_CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(340);
				match(PR_CONSTANTE);
				setState(341);
				match(IDENT);
				setState(342);
				match(DELIMITADOR_DOIS_PONTOS);
				setState(343);
				tipoBasico();
				setState(344);
				match(OPERADOR_IGUAL);
				setState(345);
				valorConstante();
				}
				}
				break;
			case PR_TIPO:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(347);
				match(PR_TIPO);
				setState(348);
				match(IDENT);
				setState(349);
				match(DELIMITADOR_DOIS_PONTOS);
				setState(350);
				tipo();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorConstanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(AlgumaParser.CADEIA, 0); }
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}
		public TerminalNode NUM_REAL() { return getToken(AlgumaParser.NUM_REAL, 0); }
		public OperadorUnarioContext operadorUnario() {
			return getRuleContext(OperadorUnarioContext.class,0);
		}
		public TerminalNode PR_VERDADEIRO() { return getToken(AlgumaParser.PR_VERDADEIRO, 0); }
		public TerminalNode PR_FALSO() { return getToken(AlgumaParser.PR_FALSO, 0); }
		public ValorConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorConstante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterValorConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitValorConstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitValorConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorConstanteContext valorConstante() throws RecognitionException {
		ValorConstanteContext _localctx = new ValorConstanteContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_valorConstante);
		int _la;
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(CADEIA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				inteiro();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERADOR_SUBTRACAO) {
					{
					setState(355);
					operadorUnario();
					}
				}

				setState(358);
				match(NUM_REAL);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(359);
				match(PR_VERDADEIRO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(360);
				match(PR_FALSO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariavelContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DELIMITADOR_DOIS_PONTOS() { return getToken(AlgumaParser.DELIMITADOR_DOIS_PONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> DELIMITADOR_VIRGULA() { return getTokens(AlgumaParser.DELIMITADOR_VIRGULA); }
		public TerminalNode DELIMITADOR_VIRGULA(int i) {
			return getToken(AlgumaParser.DELIMITADOR_VIRGULA, i);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			identificador();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITADOR_VIRGULA) {
				{
				{
				setState(364);
				match(DELIMITADOR_VIRGULA);
				setState(365);
				identificador();
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371);
			match(DELIMITADOR_DOIS_PONTOS);
			setState(372);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public TipoEstendidoContext tipoEstendido() {
			return getRuleContext(TipoEstendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tipo);
		try {
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				registro();
				}
				break;
			case PR_TIPO_LITERAL:
			case PR_TIPO_INTEIRO:
			case PR_TIPO_REAL:
			case PR_TIPO_LOGICO:
			case TIPO_ENDERECO:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				tipoEstendido();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoEstendidoContext extends ParserRuleContext {
		public TipoBasicoContext tipoBasico() {
			return getRuleContext(TipoBasicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public TerminalNode TIPO_ENDERECO() { return getToken(AlgumaParser.TIPO_ENDERECO, 0); }
		public TipoEstendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoEstendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTipoEstendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTipoEstendido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTipoEstendido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoEstendidoContext tipoEstendido() throws RecognitionException {
		TipoEstendidoContext _localctx = new TipoEstendidoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tipoEstendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO_ENDERECO) {
				{
				setState(378);
				match(TIPO_ENDERECO);
				}
			}

			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_TIPO_LITERAL:
			case PR_TIPO_INTEIRO:
			case PR_TIPO_REAL:
			case PR_TIPO_LOGICO:
				{
				setState(381);
				tipoBasico();
				}
				break;
			case IDENT:
				{
				setState(382);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoBasicoContext extends ParserRuleContext {
		public TerminalNode PR_TIPO_LITERAL() { return getToken(AlgumaParser.PR_TIPO_LITERAL, 0); }
		public TerminalNode PR_TIPO_INTEIRO() { return getToken(AlgumaParser.PR_TIPO_INTEIRO, 0); }
		public TerminalNode PR_TIPO_REAL() { return getToken(AlgumaParser.PR_TIPO_REAL, 0); }
		public TerminalNode PR_TIPO_LOGICO() { return getToken(AlgumaParser.PR_TIPO_LOGICO, 0); }
		public TipoBasicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoBasico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTipoBasico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTipoBasico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTipoBasico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoBasicoContext tipoBasico() throws RecognitionException {
		TipoBasicoContext _localctx = new TipoBasicoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tipoBasico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_TIPO_LITERAL) | (1L << PR_TIPO_INTEIRO) | (1L << PR_TIPO_REAL) | (1L << PR_TIPO_LOGICO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode PR_REGISTRO() { return getToken(AlgumaParser.PR_REGISTRO, 0); }
		public TerminalNode PR_FIM_REGISTRO() { return getToken(AlgumaParser.PR_FIM_REGISTRO, 0); }
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(PR_REGISTRO);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(388);
				variavel();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			match(PR_FIM_REGISTRO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public TerminalNode OPERADOR_REGISTRO() { return getToken(AlgumaParser.OPERADOR_REGISTRO, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public List<DimensaoContext> dimensao() {
			return getRuleContexts(DimensaoContext.class);
		}
		public DimensaoContext dimensao(int i) {
			return getRuleContext(DimensaoContext.class,i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_identificador);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(IDENT);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERADOR_REGISTRO) {
				{
				setState(397);
				match(OPERADOR_REGISTRO);
				setState(398);
				identificador();
				}
			}

			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(401);
					dimensao();
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensaoContext extends ParserRuleContext {
		public TerminalNode DELIMITADOR_ABRE_COLCHETES() { return getToken(AlgumaParser.DELIMITADOR_ABRE_COLCHETES, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode DELIMITADOR_FECHA_COLCHETES() { return getToken(AlgumaParser.DELIMITADOR_FECHA_COLCHETES, 0); }
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDimensao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDimensao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_dimensao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(DELIMITADOR_ABRE_COLCHETES);
			setState(408);
			expressaoAritmetica();
			setState(409);
			match(DELIMITADOR_FECHA_COLCHETES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public List<TermoAritmeticoContext> termoAritmetico() {
			return getRuleContexts(TermoAritmeticoContext.class);
		}
		public TermoAritmeticoContext termoAritmetico(int i) {
			return getRuleContext(TermoAritmeticoContext.class,i);
		}
		public List<OperadorAritmetico1Context> operadorAritmetico1() {
			return getRuleContexts(OperadorAritmetico1Context.class);
		}
		public OperadorAritmetico1Context operadorAritmetico1(int i) {
			return getRuleContext(OperadorAritmetico1Context.class,i);
		}
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitExpressaoAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitExpressaoAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressaoAritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			termoAritmetico();
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(412);
					operadorAritmetico1();
					setState(413);
					termoAritmetico();
					}
					} 
				}
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorAritmetico1Context extends ParserRuleContext {
		public TerminalNode OPERADOR_SOMA() { return getToken(AlgumaParser.OPERADOR_SOMA, 0); }
		public TerminalNode OPERADOR_SUBTRACAO() { return getToken(AlgumaParser.OPERADOR_SUBTRACAO, 0); }
		public OperadorAritmetico1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorAritmetico1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOperadorAritmetico1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOperadorAritmetico1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOperadorAritmetico1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorAritmetico1Context operadorAritmetico1() throws RecognitionException {
		OperadorAritmetico1Context _localctx = new OperadorAritmetico1Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_operadorAritmetico1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_la = _input.LA(1);
			if ( !(_la==OPERADOR_SOMA || _la==OPERADOR_SUBTRACAO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoAritmeticoContext extends ParserRuleContext {
		public List<FatorAritmeticoContext> fatorAritmetico() {
			return getRuleContexts(FatorAritmeticoContext.class);
		}
		public FatorAritmeticoContext fatorAritmetico(int i) {
			return getRuleContext(FatorAritmeticoContext.class,i);
		}
		public List<OperadorAritmetico2Context> operadorAritmetico2() {
			return getRuleContexts(OperadorAritmetico2Context.class);
		}
		public OperadorAritmetico2Context operadorAritmetico2(int i) {
			return getRuleContext(OperadorAritmetico2Context.class,i);
		}
		public TermoAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTermoAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTermoAritmetico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTermoAritmetico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoAritmeticoContext termoAritmetico() throws RecognitionException {
		TermoAritmeticoContext _localctx = new TermoAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_termoAritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			fatorAritmetico();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERADOR_MULTIPLICACAO || _la==OPERADOR_DIVISAO) {
				{
				{
				setState(423);
				operadorAritmetico2();
				setState(424);
				fatorAritmetico();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorAritmetico2Context extends ParserRuleContext {
		public TerminalNode OPERADOR_MULTIPLICACAO() { return getToken(AlgumaParser.OPERADOR_MULTIPLICACAO, 0); }
		public TerminalNode OPERADOR_DIVISAO() { return getToken(AlgumaParser.OPERADOR_DIVISAO, 0); }
		public OperadorAritmetico2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorAritmetico2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOperadorAritmetico2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOperadorAritmetico2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOperadorAritmetico2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorAritmetico2Context operadorAritmetico2() throws RecognitionException {
		OperadorAritmetico2Context _localctx = new OperadorAritmetico2Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_operadorAritmetico2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_la = _input.LA(1);
			if ( !(_la==OPERADOR_MULTIPLICACAO || _la==OPERADOR_DIVISAO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorAritmeticoContext extends ParserRuleContext {
		public List<ParcelaAritmeticaContext> parcelaAritmetica() {
			return getRuleContexts(ParcelaAritmeticaContext.class);
		}
		public ParcelaAritmeticaContext parcelaAritmetica(int i) {
			return getRuleContext(ParcelaAritmeticaContext.class,i);
		}
		public List<TerminalNode> OPERADOR_MOD() { return getTokens(AlgumaParser.OPERADOR_MOD); }
		public TerminalNode OPERADOR_MOD(int i) {
			return getToken(AlgumaParser.OPERADOR_MOD, i);
		}
		public FatorAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fatorAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterFatorAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitFatorAritmetico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitFatorAritmetico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorAritmeticoContext fatorAritmetico() throws RecognitionException {
		FatorAritmeticoContext _localctx = new FatorAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fatorAritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			parcelaAritmetica();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERADOR_MOD) {
				{
				{
				setState(434);
				match(OPERADOR_MOD);
				setState(435);
				parcelaAritmetica();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParcelaAritmeticaContext extends ParserRuleContext {
		public ParcelaUnarioContext parcelaUnario() {
			return getRuleContext(ParcelaUnarioContext.class,0);
		}
		public ParcelaNaoUnarioContext parcelaNaoUnario() {
			return getRuleContext(ParcelaNaoUnarioContext.class,0);
		}
		public ParcelaAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcelaAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParcelaAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParcelaAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParcelaAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaAritmeticaContext parcelaAritmetica() throws RecognitionException {
		ParcelaAritmeticaContext _localctx = new ParcelaAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parcelaAritmetica);
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELIMITADOR_ABRE_PARENTESES:
			case OPERADOR_SUBTRACAO:
			case TIPO_ENDERECO:
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				parcelaUnario();
				}
				break;
			case OPERADOR_ENDERECO:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				parcelaNaoUnario();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorUnarioContext extends ParserRuleContext {
		public TerminalNode OPERADOR_SUBTRACAO() { return getToken(AlgumaParser.OPERADOR_SUBTRACAO, 0); }
		public OperadorUnarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorUnario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOperadorUnario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOperadorUnario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOperadorUnario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorUnarioContext operadorUnario() throws RecognitionException {
		OperadorUnarioContext _localctx = new OperadorUnarioContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_operadorUnario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(OPERADOR_SUBTRACAO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParcelaNaoUnarioContext extends ParserRuleContext {
		public TerminalNode OPERADOR_ENDERECO() { return getToken(AlgumaParser.OPERADOR_ENDERECO, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(AlgumaParser.CADEIA, 0); }
		public ParcelaNaoUnarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcelaNaoUnario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParcelaNaoUnario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParcelaNaoUnario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParcelaNaoUnario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaNaoUnarioContext parcelaNaoUnario() throws RecognitionException {
		ParcelaNaoUnarioContext _localctx = new ParcelaNaoUnarioContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parcelaNaoUnario);
		try {
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPERADOR_ENDERECO:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(447);
				match(OPERADOR_ENDERECO);
				setState(448);
				identificador();
				}
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(CADEIA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParcelaUnarioContext extends ParserRuleContext {
		public IdentificadorEnderecoContext identificadorEndereco() {
			return getRuleContext(IdentificadorEnderecoContext.class,0);
		}
		public CmdChamadaContext cmdChamada() {
			return getRuleContext(CmdChamadaContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(AlgumaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(AlgumaParser.NUM_REAL, 0); }
		public OperadorUnarioContext operadorUnario() {
			return getRuleContext(OperadorUnarioContext.class,0);
		}
		public TerminalNode DELIMITADOR_ABRE_PARENTESES() { return getToken(AlgumaParser.DELIMITADOR_ABRE_PARENTESES, 0); }
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public TerminalNode DELIMITADOR_FECHA_PARENTESES() { return getToken(AlgumaParser.DELIMITADOR_FECHA_PARENTESES, 0); }
		public ParcelaUnarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcelaUnario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParcelaUnario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParcelaUnario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParcelaUnario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaUnarioContext parcelaUnario() throws RecognitionException {
		ParcelaUnarioContext _localctx = new ParcelaUnarioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parcelaUnario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERADOR_SUBTRACAO) {
				{
				setState(452);
				operadorUnario();
				}
			}

			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(455);
				identificadorEndereco();
				}
				break;
			case 2:
				{
				setState(456);
				cmdChamada();
				}
				break;
			case 3:
				{
				setState(457);
				match(NUM_INT);
				}
				break;
			case 4:
				{
				setState(458);
				match(NUM_REAL);
				}
				break;
			case 5:
				{
				{
				setState(459);
				match(DELIMITADOR_ABRE_PARENTESES);
				setState(460);
				expressaoLogica();
				setState(461);
				match(DELIMITADOR_FECHA_PARENTESES);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoLogicaContext extends ParserRuleContext {
		public List<TermoLogicoContext> termoLogico() {
			return getRuleContexts(TermoLogicoContext.class);
		}
		public TermoLogicoContext termoLogico(int i) {
			return getRuleContext(TermoLogicoContext.class,i);
		}
		public List<TerminalNode> PR_OU() { return getTokens(AlgumaParser.PR_OU); }
		public TerminalNode PR_OU(int i) {
			return getToken(AlgumaParser.PR_OU, i);
		}
		public ExpressaoLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterExpressaoLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitExpressaoLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitExpressaoLogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoLogicaContext expressaoLogica() throws RecognitionException {
		ExpressaoLogicaContext _localctx = new ExpressaoLogicaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expressaoLogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			termoLogico();
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PR_OU) {
				{
				{
				setState(466);
				match(PR_OU);
				setState(467);
				termoLogico();
				}
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoLogicoContext extends ParserRuleContext {
		public List<FatorLogicoContext> fatorLogico() {
			return getRuleContexts(FatorLogicoContext.class);
		}
		public FatorLogicoContext fatorLogico(int i) {
			return getRuleContext(FatorLogicoContext.class,i);
		}
		public List<TerminalNode> PR_E() { return getTokens(AlgumaParser.PR_E); }
		public TerminalNode PR_E(int i) {
			return getToken(AlgumaParser.PR_E, i);
		}
		public TermoLogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoLogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTermoLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTermoLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTermoLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoLogicoContext termoLogico() throws RecognitionException {
		TermoLogicoContext _localctx = new TermoLogicoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_termoLogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			fatorLogico();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PR_E) {
				{
				{
				setState(474);
				match(PR_E);
				setState(475);
				fatorLogico();
				}
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorLogicoContext extends ParserRuleContext {
		public TerminalNode PR_VERDADEIRO() { return getToken(AlgumaParser.PR_VERDADEIRO, 0); }
		public TerminalNode PR_FALSO() { return getToken(AlgumaParser.PR_FALSO, 0); }
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public TerminalNode PR_NAO() { return getToken(AlgumaParser.PR_NAO, 0); }
		public FatorLogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fatorLogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterFatorLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitFatorLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitFatorLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorLogicoContext fatorLogico() throws RecognitionException {
		FatorLogicoContext _localctx = new FatorLogicoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fatorLogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_NAO) {
				{
				setState(481);
				match(PR_NAO);
				}
			}

			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_VERDADEIRO:
				{
				setState(484);
				match(PR_VERDADEIRO);
				}
				break;
			case PR_FALSO:
				{
				setState(485);
				match(PR_FALSO);
				}
				break;
			case DELIMITADOR_ABRE_PARENTESES:
			case OPERADOR_SUBTRACAO:
			case OPERADOR_ENDERECO:
			case TIPO_ENDERECO:
			case CADEIA:
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
				{
				setState(486);
				expressaoRelacional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public List<ExpressaoAritmeticaContext> expressaoAritmetica() {
			return getRuleContexts(ExpressaoAritmeticaContext.class);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica(int i) {
			return getRuleContext(ExpressaoAritmeticaContext.class,i);
		}
		public OperadorRelacionalContext operadorRelacional() {
			return getRuleContext(OperadorRelacionalContext.class,0);
		}
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitExpressaoRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitExpressaoRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressaoRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			expressaoAritmetica();
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERADOR_MENOR) | (1L << OPERADOR_MAIOR) | (1L << OPERADOR_DIFERENTE) | (1L << OPERADOR_MAIOR_IGUAL) | (1L << OPERADOR_MENOR_IGUAL) | (1L << OPERADOR_IGUAL))) != 0)) {
				{
				setState(490);
				operadorRelacional();
				setState(491);
				expressaoAritmetica();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorRelacionalContext extends ParserRuleContext {
		public TerminalNode OPERADOR_IGUAL() { return getToken(AlgumaParser.OPERADOR_IGUAL, 0); }
		public TerminalNode OPERADOR_DIFERENTE() { return getToken(AlgumaParser.OPERADOR_DIFERENTE, 0); }
		public TerminalNode OPERADOR_MAIOR_IGUAL() { return getToken(AlgumaParser.OPERADOR_MAIOR_IGUAL, 0); }
		public TerminalNode OPERADOR_MENOR_IGUAL() { return getToken(AlgumaParser.OPERADOR_MENOR_IGUAL, 0); }
		public TerminalNode OPERADOR_MAIOR() { return getToken(AlgumaParser.OPERADOR_MAIOR, 0); }
		public TerminalNode OPERADOR_MENOR() { return getToken(AlgumaParser.OPERADOR_MENOR, 0); }
		public OperadorRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOperadorRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOperadorRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOperadorRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorRelacionalContext operadorRelacional() throws RecognitionException {
		OperadorRelacionalContext _localctx = new OperadorRelacionalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_operadorRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERADOR_MENOR) | (1L << OPERADOR_MAIOR) | (1L << OPERADOR_DIFERENTE) | (1L << OPERADOR_MAIOR_IGUAL) | (1L << OPERADOR_MENOR_IGUAL) | (1L << OPERADOR_IGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorEnderecoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode TIPO_ENDERECO() { return getToken(AlgumaParser.TIPO_ENDERECO, 0); }
		public IdentificadorEnderecoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificadorEndereco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterIdentificadorEndereco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitIdentificadorEndereco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitIdentificadorEndereco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorEnderecoContext identificadorEndereco() throws RecognitionException {
		IdentificadorEnderecoContext _localctx = new IdentificadorEnderecoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_identificadorEndereco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO_ENDERECO) {
				{
				setState(497);
				match(TIPO_ENDERECO);
				}
			}

			setState(500);
			identificador();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u01f9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3g\n"+
		"\3\3\4\7\4j\n\4\f\4\16\4m\13\4\3\4\7\4p\n\4\f\4\16\4s\13\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5{\n\5\f\5\16\5~\13\5\5\5\u0080\n\5\3\5\3\5\7\5\u0084\n"+
		"\5\f\5\16\5\u0087\13\5\3\5\7\5\u008a\n\5\f\5\16\5\u008d\13\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5\u0096\n\5\f\5\16\5\u0099\13\5\5\5\u009b\n\5\3\5"+
		"\3\5\3\5\3\5\7\5\u00a1\n\5\f\5\16\5\u00a4\13\5\3\5\7\5\u00a7\n\5\f\5\16"+
		"\5\u00aa\13\5\3\5\3\5\5\5\u00ae\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u00ba\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u00c4\n\b\f\b"+
		"\16\b\u00c7\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\7\n\u00d1\n\n\f\n\16"+
		"\n\u00d4\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00dd\n\13\f\13\16"+
		"\13\u00e0\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ec\n"+
		"\f\f\f\16\f\u00ef\13\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u00f7\n\r\f\r\16\r"+
		"\u00fa\13\r\3\r\5\r\u00fd\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u0104\n\16\f"+
		"\16\16\16\u0107\13\16\3\16\3\16\7\16\u010b\n\16\f\16\16\16\u010e\13\16"+
		"\3\17\3\17\3\17\5\17\u0113\n\17\3\20\5\20\u0116\n\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\7\21\u011e\n\21\f\21\16\21\u0121\13\21\3\21\5\21\u0124\n"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u012d\n\22\f\22\16\22\u0130"+
		"\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u0139\n\23\f\23\16\23\u013c"+
		"\13\23\3\23\3\23\3\24\3\24\7\24\u0142\n\24\f\24\16\24\u0145\13\24\3\25"+
		"\5\25\u0148\n\25\3\25\3\25\3\25\7\25\u014d\n\25\f\25\16\25\u0150\13\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0162\n\26\3\27\3\27\3\27\5\27\u0167\n\27\3\27\3\27\3"+
		"\27\5\27\u016c\n\27\3\30\3\30\3\30\7\30\u0171\n\30\f\30\16\30\u0174\13"+
		"\30\3\30\3\30\3\30\3\31\3\31\5\31\u017b\n\31\3\32\5\32\u017e\n\32\3\32"+
		"\3\32\5\32\u0182\n\32\3\33\3\33\3\34\3\34\7\34\u0188\n\34\f\34\16\34\u018b"+
		"\13\34\3\34\3\34\3\35\3\35\3\35\5\35\u0192\n\35\3\35\7\35\u0195\n\35\f"+
		"\35\16\35\u0198\13\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u01a2"+
		"\n\37\f\37\16\37\u01a5\13\37\3 \3 \3!\3!\3!\3!\7!\u01ad\n!\f!\16!\u01b0"+
		"\13!\3\"\3\"\3#\3#\3#\7#\u01b7\n#\f#\16#\u01ba\13#\3$\3$\5$\u01be\n$\3"+
		"%\3%\3&\3&\3&\5&\u01c5\n&\3\'\5\'\u01c8\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\5\'\u01d2\n\'\3(\3(\3(\7(\u01d7\n(\f(\16(\u01da\13(\3)\3)\3)\7"+
		")\u01df\n)\f)\16)\u01e2\13)\3*\5*\u01e5\n*\3*\3*\3*\5*\u01ea\n*\3+\3+"+
		"\3+\3+\5+\u01f0\n+\3,\3,\3-\5-\u01f5\n-\3-\3-\3-\2\2.\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\6\3\2$\'"+
		"\3\2/\60\3\2\61\62\3\2\649\2\u0212\2]\3\2\2\2\4f\3\2\2\2\6k\3\2\2\2\b"+
		"\u00ad\3\2\2\2\n\u00b9\3\2\2\2\f\u00bb\3\2\2\2\16\u00be\3\2\2\2\20\u00ca"+
		"\3\2\2\2\22\u00ce\3\2\2\2\24\u00d8\3\2\2\2\26\u00e3\3\2\2\2\30\u00f2\3"+
		"\2\2\2\32\u0100\3\2\2\2\34\u010f\3\2\2\2\36\u0115\3\2\2\2 \u0119\3\2\2"+
		"\2\"\u0127\3\2\2\2$\u0133\3\2\2\2&\u013f\3\2\2\2(\u0147\3\2\2\2*\u0161"+
		"\3\2\2\2,\u016b\3\2\2\2.\u016d\3\2\2\2\60\u017a\3\2\2\2\62\u017d\3\2\2"+
		"\2\64\u0183\3\2\2\2\66\u0185\3\2\2\28\u018e\3\2\2\2:\u0199\3\2\2\2<\u019d"+
		"\3\2\2\2>\u01a6\3\2\2\2@\u01a8\3\2\2\2B\u01b1\3\2\2\2D\u01b3\3\2\2\2F"+
		"\u01bd\3\2\2\2H\u01bf\3\2\2\2J\u01c4\3\2\2\2L\u01c7\3\2\2\2N\u01d3\3\2"+
		"\2\2P\u01db\3\2\2\2R\u01e4\3\2\2\2T\u01eb\3\2\2\2V\u01f1\3\2\2\2X\u01f4"+
		"\3\2\2\2Z\\\5\4\3\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2"+
		"_]\3\2\2\2`a\7\3\2\2ab\5\6\4\2bc\7\34\2\2c\3\3\2\2\2dg\5*\26\2eg\5\b\5"+
		"\2fd\3\2\2\2fe\3\2\2\2g\5\3\2\2\2hj\5*\26\2ih\3\2\2\2jm\3\2\2\2ki\3\2"+
		"\2\2kl\3\2\2\2lq\3\2\2\2mk\3\2\2\2np\5\n\6\2on\3\2\2\2ps\3\2\2\2qo\3\2"+
		"\2\2qr\3\2\2\2r\7\3\2\2\2sq\3\2\2\2tu\7\23\2\2uv\7E\2\2v\177\7)\2\2w|"+
		"\5(\25\2xy\7+\2\2y{\5(\25\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2\177w\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\u0085\7*\2\2\u0082\u0084\5*\26\2\u0083\u0082\3\2\2\2\u0084\u0087"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008b\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008a\5\n\6\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u00ae\7\"\2\2\u008f\u0090\7\25\2\2\u0090\u0091\7"+
		"E\2\2\u0091\u009a\7)\2\2\u0092\u0097\5(\25\2\u0093\u0094\7+\2\2\u0094"+
		"\u0096\5(\25\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u0092\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7*"+
		"\2\2\u009d\u009e\7(\2\2\u009e\u00a2\5\62\32\2\u009f\u00a1\5*\26\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a8\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\5\n\6\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00adt\3\2\2\2\u00ad\u008f\3\2\2\2\u00ae\t\3\2\2\2\u00af"+
		"\u00ba\5$\23\2\u00b0\u00ba\5\"\22\2\u00b1\u00ba\5 \21\2\u00b2\u00ba\5"+
		"\30\r\2\u00b3\u00ba\5\26\f\2\u00b4\u00ba\5\24\13\2\u00b5\u00ba\5\22\n"+
		"\2\u00b6\u00ba\5\20\t\2\u00b7\u00ba\5\16\b\2\u00b8\u00ba\5\f\7\2\u00b9"+
		"\u00af\3\2\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b2\3\2"+
		"\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9"+
		"\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\13\3\2\2"+
		"\2\u00bb\u00bc\7\26\2\2\u00bc\u00bd\5N(\2\u00bd\r\3\2\2\2\u00be\u00bf"+
		"\7E\2\2\u00bf\u00c0\7)\2\2\u00c0\u00c5\5N(\2\u00c1\u00c2\7+\2\2\u00c2"+
		"\u00c4\5N(\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2"+
		"\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9"+
		"\7*\2\2\u00c9\17\3\2\2\2\u00ca\u00cb\5X-\2\u00cb\u00cc\7<\2\2\u00cc\u00cd"+
		"\5N(\2\u00cd\21\3\2\2\2\u00ce\u00d2\7\f\2\2\u00cf\u00d1\5\n\6\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\13\2\2\u00d6"+
		"\u00d7\5N(\2\u00d7\23\3\2\2\2\u00d8\u00d9\7\r\2\2\u00d9\u00da\5N(\2\u00da"+
		"\u00de\7\f\2\2\u00db\u00dd\5\n\6\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e2\7\37\2\2\u00e2\25\3\2\2\2\u00e3\u00e4\7\n\2"+
		"\2\u00e4\u00e5\7E\2\2\u00e5\u00e6\7<\2\2\u00e6\u00e7\5<\37\2\u00e7\u00e8"+
		"\7\13\2\2\u00e8\u00e9\5<\37\2\u00e9\u00ed\7\f\2\2\u00ea\u00ec\5\n\6\2"+
		"\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7\36\2\2"+
		"\u00f1\27\3\2\2\2\u00f2\u00f3\7\7\2\2\u00f3\u00f4\5<\37\2\u00f4\u00f8"+
		"\7\b\2\2\u00f5\u00f7\5\32\16\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2"+
		"\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fb\u00fd\5&\24\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00ff\7\35\2\2\u00ff\31\3\2\2\2\u0100\u0105\5\34"+
		"\17\2\u0101\u0102\7+\2\2\u0102\u0104\5\34\17\2\u0103\u0101\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0108\u010c\7(\2\2\u0109\u010b\5\n\6\2\u010a"+
		"\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\33\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0112\5\36\20\2\u0110"+
		"\u0111\7.\2\2\u0111\u0113\5\36\20\2\u0112\u0110\3\2\2\2\u0112\u0113\3"+
		"\2\2\2\u0113\35\3\2\2\2\u0114\u0116\5H%\2\u0115\u0114\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7?\2\2\u0118\37\3\2\2\2\u0119"+
		"\u011a\7\16\2\2\u011a\u011b\5N(\2\u011b\u011f\7\20\2\2\u011c\u011e\5\n"+
		"\6\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124\5&"+
		"\24\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0126\7 \2\2\u0126!\3\2\2\2\u0127\u0128\7\6\2\2\u0128\u0129\7)\2\2\u0129"+
		"\u012e\5N(\2\u012a\u012b\7+\2\2\u012b\u012d\5N(\2\u012c\u012a\3\2\2\2"+
		"\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7*\2\2\u0132#\3\2\2\2\u0133\u0134"+
		"\7\5\2\2\u0134\u0135\7)\2\2\u0135\u013a\5X-\2\u0136\u0137\7+\2\2\u0137"+
		"\u0139\5X-\2\u0138\u0136\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2"+
		"\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e"+
		"\7*\2\2\u013e%\3\2\2\2\u013f\u0143\7\t\2\2\u0140\u0142\5\n\6\2\u0141\u0140"+
		"\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\'\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0148\7\24\2\2\u0147\u0146\3\2\2"+
		"\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014e\58\35\2\u014a\u014b"+
		"\7+\2\2\u014b\u014d\58\35\2\u014c\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0151\u0152\7(\2\2\u0152\u0153\5\62\32\2\u0153)\3\2\2\2\u0154\u0155"+
		"\7\4\2\2\u0155\u0162\5.\30\2\u0156\u0157\7\27\2\2\u0157\u0158\7E\2\2\u0158"+
		"\u0159\7(\2\2\u0159\u015a\5\64\33\2\u015a\u015b\79\2\2\u015b\u015c\5,"+
		"\27\2\u015c\u0162\3\2\2\2\u015d\u015e\7\22\2\2\u015e\u015f\7E\2\2\u015f"+
		"\u0160\7(\2\2\u0160\u0162\5\60\31\2\u0161\u0154\3\2\2\2\u0161\u0156\3"+
		"\2\2\2\u0161\u015d\3\2\2\2\u0162+\3\2\2\2\u0163\u016c\7>\2\2\u0164\u016c"+
		"\5\36\20\2\u0165\u0167\5H%\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u016c\7@\2\2\u0169\u016c\7\30\2\2\u016a\u016c\7\31"+
		"\2\2\u016b\u0163\3\2\2\2\u016b\u0164\3\2\2\2\u016b\u0166\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c-\3\2\2\2\u016d\u0172\58\35\2"+
		"\u016e\u016f\7+\2\2\u016f\u0171\58\35\2\u0170\u016e\3\2\2\2\u0171\u0174"+
		"\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0175\u0176\7(\2\2\u0176\u0177\5\60\31\2\u0177/\3\2\2\2"+
		"\u0178\u017b\5\66\34\2\u0179\u017b\5\62\32\2\u017a\u0178\3\2\2\2\u017a"+
		"\u0179\3\2\2\2\u017b\61\3\2\2\2\u017c\u017e\7=\2\2\u017d\u017c\3\2\2\2"+
		"\u017d\u017e\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u0182\5\64\33\2\u0180\u0182"+
		"\7E\2\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182\63\3\2\2\2\u0183"+
		"\u0184\t\2\2\2\u0184\65\3\2\2\2\u0185\u0189\7\21\2\2\u0186\u0188\5.\30"+
		"\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7!\2\2\u018d"+
		"\67\3\2\2\2\u018e\u0191\7E\2\2\u018f\u0190\7;\2\2\u0190\u0192\58\35\2"+
		"\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0196\3\2\2\2\u0193\u0195"+
		"\5:\36\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u01979\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\7,\2\2\u019a"+
		"\u019b\5<\37\2\u019b\u019c\7-\2\2\u019c;\3\2\2\2\u019d\u01a3\5@!\2\u019e"+
		"\u019f\5> \2\u019f\u01a0\5@!\2\u01a0\u01a2\3\2\2\2\u01a1\u019e\3\2\2\2"+
		"\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4=\3"+
		"\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\t\3\2\2\u01a7?\3\2\2\2\u01a8\u01ae"+
		"\5D#\2\u01a9\u01aa\5B\"\2\u01aa\u01ab\5D#\2\u01ab\u01ad\3\2\2\2\u01ac"+
		"\u01a9\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01afA\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\t\4\2\2\u01b2C\3\2"+
		"\2\2\u01b3\u01b8\5F$\2\u01b4\u01b5\7\63\2\2\u01b5\u01b7\5F$\2\u01b6\u01b4"+
		"\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"E\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01be\5L\'\2\u01bc\u01be\5J&\2\u01bd"+
		"\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2\u01beG\3\2\2\2\u01bf\u01c0\7\60\2\2"+
		"\u01c0I\3\2\2\2\u01c1\u01c2\7:\2\2\u01c2\u01c5\58\35\2\u01c3\u01c5\7>"+
		"\2\2\u01c4\u01c1\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5K\3\2\2\2\u01c6\u01c8"+
		"\5H%\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01d1\3\2\2\2\u01c9"+
		"\u01d2\5X-\2\u01ca\u01d2\5\16\b\2\u01cb\u01d2\7?\2\2\u01cc\u01d2\7@\2"+
		"\2\u01cd\u01ce\7)\2\2\u01ce\u01cf\5N(\2\u01cf\u01d0\7*\2\2\u01d0\u01d2"+
		"\3\2\2\2\u01d1\u01c9\3\2\2\2\u01d1\u01ca\3\2\2\2\u01d1\u01cb\3\2\2\2\u01d1"+
		"\u01cc\3\2\2\2\u01d1\u01cd\3\2\2\2\u01d2M\3\2\2\2\u01d3\u01d8\5P)\2\u01d4"+
		"\u01d5\7\33\2\2\u01d5\u01d7\5P)\2\u01d6\u01d4\3\2\2\2\u01d7\u01da\3\2"+
		"\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9O\3\2\2\2\u01da\u01d8"+
		"\3\2\2\2\u01db\u01e0\5R*\2\u01dc\u01dd\7\17\2\2\u01dd\u01df\5R*\2\u01de"+
		"\u01dc\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e1Q\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e5\7\32\2\2\u01e4\u01e3"+
		"\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e9\3\2\2\2\u01e6\u01ea\7\30\2\2"+
		"\u01e7\u01ea\7\31\2\2\u01e8\u01ea\5T+\2\u01e9\u01e6\3\2\2\2\u01e9\u01e7"+
		"\3\2\2\2\u01e9\u01e8\3\2\2\2\u01eaS\3\2\2\2\u01eb\u01ef\5<\37\2\u01ec"+
		"\u01ed\5V,\2\u01ed\u01ee\5<\37\2\u01ee\u01f0\3\2\2\2\u01ef\u01ec\3\2\2"+
		"\2\u01ef\u01f0\3\2\2\2\u01f0U\3\2\2\2\u01f1\u01f2\t\5\2\2\u01f2W\3\2\2"+
		"\2\u01f3\u01f5\7=\2\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6\u01f7\58\35\2\u01f7Y\3\2\2\28]fkq|\177\u0085\u008b\u0097"+
		"\u009a\u00a2\u00a8\u00ad\u00b9\u00c5\u00d2\u00de\u00ed\u00f8\u00fc\u0105"+
		"\u010c\u0112\u0115\u011f\u0123\u012e\u013a\u0143\u0147\u014e\u0161\u0166"+
		"\u016b\u0172\u017a\u017d\u0181\u0189\u0191\u0196\u01a3\u01ae\u01b8\u01bd"+
		"\u01c4\u01c7\u01d1\u01d8\u01e0\u01e4\u01e9\u01ef\u01f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}