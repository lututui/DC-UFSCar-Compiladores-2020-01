// Generated from C:/Users/74434/Documents/GitHub/analisador-lexico-la-antlr/src/main/java/br/ufscar/dc/compiladores/alguma/lexico\Alguma.g4 by ANTLR 4.8
package br.ufscar.dc.compiladores.alguma.lexico;
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
		RULE_programa = 0, RULE_corpo = 1, RULE_declaracoes = 2, RULE_declaracao_global = 3, 
		RULE_cmd = 4, RULE_cmdRetorne = 5, RULE_cmdChamada = 6, RULE_cmdAtribuicao = 7, 
		RULE_cmdFaca = 8, RULE_cmdEnquanto = 9, RULE_cmdPara = 10, RULE_cmdCaso = 11, 
		RULE_selecao = 12, RULE_item_selecao = 13, RULE_constantes = 14, RULE_numero_intervalo = 15, 
		RULE_cmdSe = 16, RULE_cmdEscreva = 17, RULE_cmdLeia = 18, RULE_parametros = 19, 
		RULE_parametro = 20, RULE_declaracao_local = 21, RULE_valor_constante = 22, 
		RULE_variavel = 23, RULE_tipo = 24, RULE_tipo_estendido = 25, RULE_tipo_basico = 26, 
		RULE_registro = 27, RULE_identificador = 28, RULE_dimensao = 29, RULE_expressao_aritmetica = 30, 
		RULE_op1 = 31, RULE_termo = 32, RULE_op2 = 33, RULE_fator = 34, RULE_op3 = 35, 
		RULE_parcela = 36, RULE_parcela_nao_unario = 37, RULE_op_unario = 38, 
		RULE_parcela_unario = 39, RULE_expressao = 40, RULE_op1_logico = 41, RULE_termo_logico = 42, 
		RULE_op2_logico = 43, RULE_fator_logico = 44, RULE_parcela_logica = 45, 
		RULE_expressao_relacional = 46, RULE_op_relacional = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "corpo", "declaracoes", "declaracao_global", "cmd", "cmdRetorne", 
			"cmdChamada", "cmdAtribuicao", "cmdFaca", "cmdEnquanto", "cmdPara", "cmdCaso", 
			"selecao", "item_selecao", "constantes", "numero_intervalo", "cmdSe", 
			"cmdEscreva", "cmdLeia", "parametros", "parametro", "declaracao_local", 
			"valor_constante", "variavel", "tipo", "tipo_estendido", "tipo_basico", 
			"registro", "identificador", "dimensao", "expressao_aritmetica", "op1", 
			"termo", "op2", "fator", "op3", "parcela", "parcela_nao_unario", "op_unario", 
			"parcela_unario", "expressao", "op1_logico", "termo_logico", "op2_logico", 
			"fator_logico", "parcela_logica", "expressao_relacional", "op_relacional"
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
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode PR_ALGORITMO() { return getToken(AlgumaParser.PR_ALGORITMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode PR_FIM_ALGORITMO() { return getToken(AlgumaParser.PR_FIM_ALGORITMO, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			declaracoes();
			setState(97);
			match(PR_ALGORITMO);
			setState(98);
			corpo();
			setState(99);
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

	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
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
		enterRule(_localctx, 2, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_DECLARE) | (1L << PR_TIPO) | (1L << PR_CONSTANTE))) != 0)) {
				{
				{
				setState(101);
				declaracao_local();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
				{
				{
				setState(107);
				cmd();
				}
				}
				setState(112);
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<Declaracao_globalContext> declaracao_global() {
			return getRuleContexts(Declaracao_globalContext.class);
		}
		public Declaracao_globalContext declaracao_global(int i) {
			return getRuleContext(Declaracao_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_DECLARE) | (1L << PR_TIPO) | (1L << PR_PROCEDIMENTO) | (1L << PR_FUNCAO) | (1L << PR_CONSTANTE))) != 0)) {
				{
				setState(115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PR_DECLARE:
				case PR_TIPO:
				case PR_CONSTANTE:
					{
					setState(113);
					declaracao_local();
					}
					break;
				case PR_PROCEDIMENTO:
				case PR_FUNCAO:
					{
					setState(114);
					declaracao_global();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(119);
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

	public static class Declaracao_globalContext extends ParserRuleContext {
		public TerminalNode PR_PROCEDIMENTO() { return getToken(AlgumaParser.PR_PROCEDIMENTO, 0); }
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public TerminalNode DELIMITADOR_ABRE_PARENTESES() { return getToken(AlgumaParser.DELIMITADOR_ABRE_PARENTESES, 0); }
		public TerminalNode DELIMITADOR_FECHA_PARENTESES() { return getToken(AlgumaParser.DELIMITADOR_FECHA_PARENTESES, 0); }
		public TerminalNode PR_FIM_PROCEDIMENTO() { return getToken(AlgumaParser.PR_FIM_PROCEDIMENTO, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode PR_FUNCAO() { return getToken(AlgumaParser.PR_FUNCAO, 0); }
		public TerminalNode DELIMITADOR_DOIS_PONTOS() { return getToken(AlgumaParser.DELIMITADOR_DOIS_PONTOS, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode PR_FIM_FUNCAO() { return getToken(AlgumaParser.PR_FIM_FUNCAO, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracao_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDeclaracao_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_global);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(120);
				match(PR_PROCEDIMENTO);
				setState(121);
				match(IDENT);
				setState(122);
				match(DELIMITADOR_ABRE_PARENTESES);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PR_VAR || _la==IDENT) {
					{
					setState(123);
					parametros();
					}
				}

				setState(126);
				match(DELIMITADOR_FECHA_PARENTESES);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_DECLARE) | (1L << PR_TIPO) | (1L << PR_CONSTANTE))) != 0)) {
					{
					{
					setState(127);
					declaracao_local();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
					{
					{
					setState(133);
					cmd();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				match(PR_FIM_PROCEDIMENTO);
				}
				}
				break;
			case PR_FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(PR_FUNCAO);
				setState(141);
				match(IDENT);
				setState(142);
				match(DELIMITADOR_ABRE_PARENTESES);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PR_VAR || _la==IDENT) {
					{
					setState(143);
					parametros();
					}
				}

				setState(146);
				match(DELIMITADOR_FECHA_PARENTESES);
				setState(147);
				match(DELIMITADOR_DOIS_PONTOS);
				setState(148);
				tipo_estendido();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_DECLARE) | (1L << PR_TIPO) | (1L << PR_CONSTANTE))) != 0)) {
					{
					{
					setState(149);
					declaracao_local();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
					{
					{
					setState(155);
					cmd();
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				cmdLeia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				cmdEscreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				cmdSe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				cmdCaso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				cmdPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				cmdEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				cmdFaca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(172);
				cmdAtribuicao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(173);
				cmdChamada();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(174);
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
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
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
			setState(177);
			match(PR_RETORNE);
			setState(178);
			expressao();
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
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
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
			setState(180);
			match(IDENT);
			setState(181);
			match(DELIMITADOR_ABRE_PARENTESES);
			setState(182);
			expressao();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITADOR_VIRGULA) {
				{
				{
				setState(183);
				match(DELIMITADOR_VIRGULA);
				setState(184);
				expressao();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
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
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode OPERADOR_ATRIBUICAO() { return getToken(AlgumaParser.OPERADOR_ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode TIPO_ENDERECO() { return getToken(AlgumaParser.TIPO_ENDERECO, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO_ENDERECO) {
				{
				setState(192);
				match(TIPO_ENDERECO);
				}
			}

			setState(195);
			identificador();
			setState(196);
			match(OPERADOR_ATRIBUICAO);
			setState(197);
			expressao();
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
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
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
			setState(199);
			match(PR_FACA);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
				{
				{
				setState(200);
				cmd();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(PR_ATE);
			setState(207);
			expressao();
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
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
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
			setState(209);
			match(PR_ENQUANTO);
			setState(210);
			expressao();
			setState(211);
			match(PR_FACA);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
				{
				{
				setState(212);
				cmd();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
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
		public List<Expressao_aritmeticaContext> expressao_aritmetica() {
			return getRuleContexts(Expressao_aritmeticaContext.class);
		}
		public Expressao_aritmeticaContext expressao_aritmetica(int i) {
			return getRuleContext(Expressao_aritmeticaContext.class,i);
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
			setState(220);
			match(PR_PARA);
			setState(221);
			match(IDENT);
			setState(222);
			match(OPERADOR_ATRIBUICAO);
			setState(223);
			expressao_aritmetica();
			setState(224);
			match(PR_ATE);
			setState(225);
			expressao_aritmetica();
			setState(226);
			match(PR_FACA);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
				{
				{
				setState(227);
				cmd();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
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
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public TerminalNode PR_SEJA() { return getToken(AlgumaParser.PR_SEJA, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public TerminalNode PR_FIM_CASO() { return getToken(AlgumaParser.PR_FIM_CASO, 0); }
		public TerminalNode PR_SENAO() { return getToken(AlgumaParser.PR_SENAO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
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
			setState(235);
			match(PR_CASO);
			setState(236);
			expressao_aritmetica();
			setState(237);
			match(PR_SEJA);
			setState(238);
			selecao();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_SENAO) {
				{
				setState(239);
				match(PR_SENAO);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
					{
					{
					setState(240);
					cmd();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(248);
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
		public List<Item_selecaoContext> item_selecao() {
			return getRuleContexts(Item_selecaoContext.class);
		}
		public Item_selecaoContext item_selecao(int i) {
			return getRuleContext(Item_selecaoContext.class,i);
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
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERADOR_SUBTRACAO || _la==NUM_INT) {
				{
				{
				setState(250);
				item_selecao();
				}
				}
				setState(255);
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

	public static class Item_selecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode DELIMITADOR_DOIS_PONTOS() { return getToken(AlgumaParser.DELIMITADOR_DOIS_PONTOS, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Item_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterItem_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitItem_selecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitItem_selecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_selecaoContext item_selecao() throws RecognitionException {
		Item_selecaoContext _localctx = new Item_selecaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_item_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			constantes();
			setState(257);
			match(DELIMITADOR_DOIS_PONTOS);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
				{
				{
				setState(258);
				cmd();
				}
				}
				setState(263);
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

	public static class ConstantesContext extends ParserRuleContext {
		public List<Numero_intervaloContext> numero_intervalo() {
			return getRuleContexts(Numero_intervaloContext.class);
		}
		public Numero_intervaloContext numero_intervalo(int i) {
			return getRuleContext(Numero_intervaloContext.class,i);
		}
		public List<TerminalNode> DELIMITADOR_VIRGULA() { return getTokens(AlgumaParser.DELIMITADOR_VIRGULA); }
		public TerminalNode DELIMITADOR_VIRGULA(int i) {
			return getToken(AlgumaParser.DELIMITADOR_VIRGULA, i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			numero_intervalo();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITADOR_VIRGULA) {
				{
				{
				setState(265);
				match(DELIMITADOR_VIRGULA);
				setState(266);
				numero_intervalo();
				}
				}
				setState(271);
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

	public static class Numero_intervaloContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(AlgumaParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(AlgumaParser.NUM_INT, i);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
		}
		public TerminalNode OPERADOR_RANGE() { return getToken(AlgumaParser.OPERADOR_RANGE, 0); }
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitNumero_intervalo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitNumero_intervalo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERADOR_SUBTRACAO) {
				{
				setState(272);
				op_unario();
				}
			}

			setState(275);
			match(NUM_INT);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERADOR_RANGE) {
				{
				setState(276);
				match(OPERADOR_RANGE);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERADOR_SUBTRACAO) {
					{
					setState(277);
					op_unario();
					}
				}

				setState(280);
				match(NUM_INT);
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

	public static class CmdSeContext extends ParserRuleContext {
		public TerminalNode PR_SE() { return getToken(AlgumaParser.PR_SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PR_ENTAO() { return getToken(AlgumaParser.PR_ENTAO, 0); }
		public TerminalNode PR_FIM_SE() { return getToken(AlgumaParser.PR_FIM_SE, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode PR_SENAO() { return getToken(AlgumaParser.PR_SENAO, 0); }
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
		enterRule(_localctx, 32, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(PR_SE);
			setState(284);
			expressao();
			setState(285);
			match(PR_ENTAO);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
				{
				{
				setState(286);
				cmd();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_SENAO) {
				{
				setState(292);
				match(PR_SENAO);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_LEIA) | (1L << PR_ESCREVA) | (1L << PR_CASO) | (1L << PR_PARA) | (1L << PR_FACA) | (1L << PR_ENQUANTO) | (1L << PR_SE) | (1L << PR_RETORNE) | (1L << TIPO_ENDERECO))) != 0) || _la==IDENT) {
					{
					{
					setState(293);
					cmd();
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(301);
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
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
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
		enterRule(_localctx, 34, RULE_cmdEscreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(PR_ESCREVA);
			setState(304);
			match(DELIMITADOR_ABRE_PARENTESES);
			setState(305);
			expressao();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITADOR_VIRGULA) {
				{
				{
				setState(306);
				match(DELIMITADOR_VIRGULA);
				setState(307);
				expressao();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
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
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DELIMITADOR_FECHA_PARENTESES() { return getToken(AlgumaParser.DELIMITADOR_FECHA_PARENTESES, 0); }
		public List<TerminalNode> TIPO_ENDERECO() { return getTokens(AlgumaParser.TIPO_ENDERECO); }
		public TerminalNode TIPO_ENDERECO(int i) {
			return getToken(AlgumaParser.TIPO_ENDERECO, i);
		}
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
		enterRule(_localctx, 36, RULE_cmdLeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(PR_LEIA);
			setState(316);
			match(DELIMITADOR_ABRE_PARENTESES);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO_ENDERECO) {
				{
				setState(317);
				match(TIPO_ENDERECO);
				}
			}

			setState(320);
			identificador();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITADOR_VIRGULA) {
				{
				{
				setState(321);
				match(DELIMITADOR_VIRGULA);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TIPO_ENDERECO) {
					{
					setState(322);
					match(TIPO_ENDERECO);
					}
				}

				setState(325);
				identificador();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(331);
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

	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> DELIMITADOR_VIRGULA() { return getTokens(AlgumaParser.DELIMITADOR_VIRGULA); }
		public TerminalNode DELIMITADOR_VIRGULA(int i) {
			return getToken(AlgumaParser.DELIMITADOR_VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			parametro();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITADOR_VIRGULA) {
				{
				{
				setState(334);
				match(DELIMITADOR_VIRGULA);
				setState(335);
				parametro();
				}
				}
				setState(340);
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
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
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
		enterRule(_localctx, 40, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_VAR) {
				{
				setState(341);
				match(PR_VAR);
				}
			}

			setState(344);
			identificador();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITADOR_VIRGULA) {
				{
				{
				setState(345);
				match(DELIMITADOR_VIRGULA);
				setState(346);
				identificador();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			match(DELIMITADOR_DOIS_PONTOS);
			setState(353);
			tipo_estendido();
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

	public static class Declaracao_localContext extends ParserRuleContext {
		public TerminalNode PR_DECLARE() { return getToken(AlgumaParser.PR_DECLARE, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode PR_CONSTANTE() { return getToken(AlgumaParser.PR_CONSTANTE, 0); }
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public TerminalNode DELIMITADOR_DOIS_PONTOS() { return getToken(AlgumaParser.DELIMITADOR_DOIS_PONTOS, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode OPERADOR_IGUAL() { return getToken(AlgumaParser.OPERADOR_IGUAL, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode PR_TIPO() { return getToken(AlgumaParser.PR_TIPO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracao_local(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDeclaracao_local(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declaracao_local);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(355);
				match(PR_DECLARE);
				setState(356);
				variavel();
				}
				}
				break;
			case PR_CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(357);
				match(PR_CONSTANTE);
				setState(358);
				match(IDENT);
				setState(359);
				match(DELIMITADOR_DOIS_PONTOS);
				setState(360);
				tipo_basico();
				setState(361);
				match(OPERADOR_IGUAL);
				setState(362);
				valor_constante();
				}
				}
				break;
			case PR_TIPO:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(364);
				match(PR_TIPO);
				setState(365);
				match(IDENT);
				setState(366);
				match(DELIMITADOR_DOIS_PONTOS);
				setState(367);
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

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(AlgumaParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(AlgumaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(AlgumaParser.NUM_REAL, 0); }
		public TerminalNode PR_VERDADEIRO() { return getToken(AlgumaParser.PR_VERDADEIRO, 0); }
		public TerminalNode PR_FALSO() { return getToken(AlgumaParser.PR_FALSO, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitValor_constante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitValor_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_VERDADEIRO) | (1L << PR_FALSO) | (1L << CADEIA) | (1L << NUM_INT) | (1L << NUM_REAL))) != 0)) ) {
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
		enterRule(_localctx, 46, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			identificador();
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITADOR_VIRGULA) {
				{
				{
				setState(373);
				match(DELIMITADOR_VIRGULA);
				setState(374);
				identificador();
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
			match(DELIMITADOR_DOIS_PONTOS);
			setState(381);
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
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
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
		enterRule(_localctx, 48, RULE_tipo);
		try {
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
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
				setState(384);
				tipo_estendido();
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

	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public TerminalNode TIPO_ENDERECO() { return getToken(AlgumaParser.TIPO_ENDERECO, 0); }
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTipo_estendido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTipo_estendido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tipo_estendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO_ENDERECO) {
				{
				setState(387);
				match(TIPO_ENDERECO);
				}
			}

			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_TIPO_LITERAL:
			case PR_TIPO_INTEIRO:
			case PR_TIPO_REAL:
			case PR_TIPO_LOGICO:
				{
				setState(390);
				tipo_basico();
				}
				break;
			case IDENT:
				{
				setState(391);
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

	public static class Tipo_basicoContext extends ParserRuleContext {
		public TerminalNode PR_TIPO_LITERAL() { return getToken(AlgumaParser.PR_TIPO_LITERAL, 0); }
		public TerminalNode PR_TIPO_INTEIRO() { return getToken(AlgumaParser.PR_TIPO_INTEIRO, 0); }
		public TerminalNode PR_TIPO_REAL() { return getToken(AlgumaParser.PR_TIPO_REAL, 0); }
		public TerminalNode PR_TIPO_LOGICO() { return getToken(AlgumaParser.PR_TIPO_LOGICO, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTipo_basico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTipo_basico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
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
		enterRule(_localctx, 54, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(PR_REGISTRO);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(397);
				variavel();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403);
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
		public List<TerminalNode> IDENT() { return getTokens(AlgumaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(AlgumaParser.IDENT, i);
		}
		public List<TerminalNode> OPERADOR_REGISTRO() { return getTokens(AlgumaParser.OPERADOR_REGISTRO); }
		public TerminalNode OPERADOR_REGISTRO(int i) {
			return getToken(AlgumaParser.OPERADOR_REGISTRO, i);
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
		enterRule(_localctx, 56, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(IDENT);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERADOR_REGISTRO) {
				{
				{
				setState(406);
				match(OPERADOR_REGISTRO);
				setState(407);
				match(IDENT);
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITADOR_ABRE_COLCHETES) {
				{
				{
				setState(413);
				dimensao();
				}
				}
				setState(418);
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

	public static class DimensaoContext extends ParserRuleContext {
		public TerminalNode DELIMITADOR_ABRE_COLCHETES() { return getToken(AlgumaParser.DELIMITADOR_ABRE_COLCHETES, 0); }
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
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
		enterRule(_localctx, 58, RULE_dimensao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(DELIMITADOR_ABRE_COLCHETES);
			setState(420);
			expressao_aritmetica();
			setState(421);
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

	public static class Expressao_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op1Context> op1() {
			return getRuleContexts(Op1Context.class);
		}
		public Op1Context op1(int i) {
			return getRuleContext(Op1Context.class,i);
		}
		public Expressao_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterExpressao_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitExpressao_aritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitExpressao_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_aritmeticaContext expressao_aritmetica() throws RecognitionException {
		Expressao_aritmeticaContext _localctx = new Expressao_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expressao_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			termo();
			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(424);
					op1();
					setState(425);
					termo();
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class Op1Context extends ParserRuleContext {
		public TerminalNode OPERADOR_SOMA() { return getToken(AlgumaParser.OPERADOR_SOMA, 0); }
		public TerminalNode OPERADOR_SUBTRACAO() { return getToken(AlgumaParser.OPERADOR_SUBTRACAO, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
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

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<Op2Context> op2() {
			return getRuleContexts(Op2Context.class);
		}
		public Op2Context op2(int i) {
			return getRuleContext(Op2Context.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			fator();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERADOR_MULTIPLICACAO || _la==OPERADOR_DIVISAO) {
				{
				{
				setState(435);
				op2();
				setState(436);
				fator();
				}
				}
				setState(442);
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

	public static class Op2Context extends ParserRuleContext {
		public TerminalNode OPERADOR_MULTIPLICACAO() { return getToken(AlgumaParser.OPERADOR_MULTIPLICACAO, 0); }
		public TerminalNode OPERADOR_DIVISAO() { return getToken(AlgumaParser.OPERADOR_DIVISAO, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
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

	public static class FatorContext extends ParserRuleContext {
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<Op3Context> op3() {
			return getRuleContexts(Op3Context.class);
		}
		public Op3Context op3(int i) {
			return getRuleContext(Op3Context.class,i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			parcela();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERADOR_MOD) {
				{
				{
				setState(446);
				op3();
				setState(447);
				parcela();
				}
				}
				setState(453);
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

	public static class Op3Context extends ParserRuleContext {
		public TerminalNode OPERADOR_MOD() { return getToken(AlgumaParser.OPERADOR_MOD, 0); }
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(OPERADOR_MOD);
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

	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParcela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParcela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parcela);
		int _la;
		try {
			setState(461);
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
				{
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERADOR_SUBTRACAO) {
					{
					setState(456);
					op_unario();
					}
				}

				setState(459);
				parcela_unario();
				}
				}
				break;
			case OPERADOR_ENDERECO:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				parcela_nao_unario();
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

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public TerminalNode OPERADOR_ENDERECO() { return getToken(AlgumaParser.OPERADOR_ENDERECO, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(AlgumaParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParcela_nao_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParcela_nao_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parcela_nao_unario);
		try {
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPERADOR_ENDERECO:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(463);
				match(OPERADOR_ENDERECO);
				setState(464);
				identificador();
				}
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
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

	public static class Op_unarioContext extends ParserRuleContext {
		public TerminalNode OPERADOR_SUBTRACAO() { return getToken(AlgumaParser.OPERADOR_SUBTRACAO, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOp_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOp_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_op_unario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
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

	public static class Parcela_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode TIPO_ENDERECO() { return getToken(AlgumaParser.TIPO_ENDERECO, 0); }
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public TerminalNode DELIMITADOR_ABRE_PARENTESES() { return getToken(AlgumaParser.DELIMITADOR_ABRE_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode DELIMITADOR_FECHA_PARENTESES() { return getToken(AlgumaParser.DELIMITADOR_FECHA_PARENTESES, 0); }
		public List<TerminalNode> DELIMITADOR_VIRGULA() { return getTokens(AlgumaParser.DELIMITADOR_VIRGULA); }
		public TerminalNode DELIMITADOR_VIRGULA(int i) {
			return getToken(AlgumaParser.DELIMITADOR_VIRGULA, i);
		}
		public TerminalNode NUM_INT() { return getToken(AlgumaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(AlgumaParser.NUM_REAL, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParcela_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParcela_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parcela_unario);
		int _la;
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TIPO_ENDERECO) {
					{
					setState(470);
					match(TIPO_ENDERECO);
					}
				}

				setState(473);
				identificador();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(474);
				match(IDENT);
				setState(475);
				match(DELIMITADOR_ABRE_PARENTESES);
				setState(476);
				expressao();
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DELIMITADOR_VIRGULA) {
					{
					{
					setState(477);
					match(DELIMITADOR_VIRGULA);
					setState(478);
					expressao();
					}
					}
					setState(483);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(484);
				match(DELIMITADOR_FECHA_PARENTESES);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				match(NUM_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(488);
				match(DELIMITADOR_ABRE_PARENTESES);
				setState(489);
				expressao();
				setState(490);
				match(DELIMITADOR_FECHA_PARENTESES);
				}
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

	public static class ExpressaoContext extends ParserRuleContext {
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Op1_logicoContext> op1_logico() {
			return getRuleContexts(Op1_logicoContext.class);
		}
		public Op1_logicoContext op1_logico(int i) {
			return getRuleContext(Op1_logicoContext.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			termo_logico();
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PR_OU) {
				{
				{
				setState(495);
				op1_logico();
				setState(496);
				termo_logico();
				}
				}
				setState(502);
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

	public static class Op1_logicoContext extends ParserRuleContext {
		public TerminalNode PR_OU() { return getToken(AlgumaParser.PR_OU, 0); }
		public Op1_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOp1_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOp1_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOp1_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op1_logicoContext op1_logico() throws RecognitionException {
		Op1_logicoContext _localctx = new Op1_logicoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_op1_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(PR_OU);
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

	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<Op2_logicoContext> op2_logico() {
			return getRuleContexts(Op2_logicoContext.class);
		}
		public Op2_logicoContext op2_logico(int i) {
			return getRuleContext(Op2_logicoContext.class,i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTermo_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTermo_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			fator_logico();
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PR_E) {
				{
				{
				setState(506);
				op2_logico();
				setState(507);
				fator_logico();
				}
				}
				setState(513);
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

	public static class Op2_logicoContext extends ParserRuleContext {
		public TerminalNode PR_E() { return getToken(AlgumaParser.PR_E, 0); }
		public Op2_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOp2_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOp2_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOp2_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2_logicoContext op2_logico() throws RecognitionException {
		Op2_logicoContext _localctx = new Op2_logicoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_op2_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(PR_E);
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

	public static class Fator_logicoContext extends ParserRuleContext {
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public TerminalNode PR_NAO() { return getToken(AlgumaParser.PR_NAO, 0); }
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitFator_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitFator_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_NAO) {
				{
				setState(516);
				match(PR_NAO);
				}
			}

			setState(519);
			parcela_logica();
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

	public static class Parcela_logicaContext extends ParserRuleContext {
		public TerminalNode PR_VERDADEIRO() { return getToken(AlgumaParser.PR_VERDADEIRO, 0); }
		public TerminalNode PR_FALSO() { return getToken(AlgumaParser.PR_FALSO, 0); }
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParcela_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParcela_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parcela_logica);
		try {
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_VERDADEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				match(PR_VERDADEIRO);
				}
				break;
			case PR_FALSO:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
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
				enterOuterAlt(_localctx, 3);
				{
				setState(523);
				expressao_relacional();
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

	public static class Expressao_relacionalContext extends ParserRuleContext {
		public List<Expressao_aritmeticaContext> expressao_aritmetica() {
			return getRuleContexts(Expressao_aritmeticaContext.class);
		}
		public Expressao_aritmeticaContext expressao_aritmetica(int i) {
			return getRuleContext(Expressao_aritmeticaContext.class,i);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Expressao_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterExpressao_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitExpressao_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitExpressao_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_relacionalContext expressao_relacional() throws RecognitionException {
		Expressao_relacionalContext _localctx = new Expressao_relacionalContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expressao_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			expressao_aritmetica();
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERADOR_MENOR) | (1L << OPERADOR_MAIOR) | (1L << OPERADOR_DIFERENTE) | (1L << OPERADOR_MAIOR_IGUAL) | (1L << OPERADOR_MENOR_IGUAL) | (1L << OPERADOR_IGUAL))) != 0)) {
				{
				setState(527);
				op_relacional();
				setState(528);
				expressao_aritmetica();
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

	public static class Op_relacionalContext extends ParserRuleContext {
		public TerminalNode OPERADOR_IGUAL() { return getToken(AlgumaParser.OPERADOR_IGUAL, 0); }
		public TerminalNode OPERADOR_DIFERENTE() { return getToken(AlgumaParser.OPERADOR_DIFERENTE, 0); }
		public TerminalNode OPERADOR_MAIOR_IGUAL() { return getToken(AlgumaParser.OPERADOR_MAIOR_IGUAL, 0); }
		public TerminalNode OPERADOR_MENOR_IGUAL() { return getToken(AlgumaParser.OPERADOR_MENOR_IGUAL, 0); }
		public TerminalNode OPERADOR_MAIOR() { return getToken(AlgumaParser.OPERADOR_MAIOR, 0); }
		public TerminalNode OPERADOR_MENOR() { return getToken(AlgumaParser.OPERADOR_MENOR, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u0219\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\3\7\3"+
		"i\n\3\f\3\16\3l\13\3\3\3\7\3o\n\3\f\3\16\3r\13\3\3\4\3\4\7\4v\n\4\f\4"+
		"\16\4y\13\4\3\5\3\5\3\5\3\5\5\5\177\n\5\3\5\3\5\7\5\u0083\n\5\f\5\16\5"+
		"\u0086\13\5\3\5\7\5\u0089\n\5\f\5\16\5\u008c\13\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u0093\n\5\3\5\3\5\3\5\3\5\7\5\u0099\n\5\f\5\16\5\u009c\13\5\3\5\7"+
		"\5\u009f\n\5\f\5\16\5\u00a2\13\5\3\5\3\5\5\5\u00a6\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b2\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u00bc\n\b\f\b\16\b\u00bf\13\b\3\b\3\b\3\t\5\t\u00c4\n\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\7\n\u00cc\n\n\f\n\16\n\u00cf\13\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\7\13\u00d8\n\13\f\13\16\13\u00db\13\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e7\n\f\f\f\16\f\u00ea\13\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u00f4\n\r\f\r\16\r\u00f7\13\r\5\r\u00f9\n\r\3\r"+
		"\3\r\3\16\7\16\u00fe\n\16\f\16\16\16\u0101\13\16\3\17\3\17\3\17\7\17\u0106"+
		"\n\17\f\17\16\17\u0109\13\17\3\20\3\20\3\20\7\20\u010e\n\20\f\20\16\20"+
		"\u0111\13\20\3\21\5\21\u0114\n\21\3\21\3\21\3\21\5\21\u0119\n\21\3\21"+
		"\5\21\u011c\n\21\3\22\3\22\3\22\3\22\7\22\u0122\n\22\f\22\16\22\u0125"+
		"\13\22\3\22\3\22\7\22\u0129\n\22\f\22\16\22\u012c\13\22\5\22\u012e\n\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u0137\n\23\f\23\16\23\u013a\13"+
		"\23\3\23\3\23\3\24\3\24\3\24\5\24\u0141\n\24\3\24\3\24\3\24\5\24\u0146"+
		"\n\24\3\24\7\24\u0149\n\24\f\24\16\24\u014c\13\24\3\24\3\24\3\25\3\25"+
		"\3\25\7\25\u0153\n\25\f\25\16\25\u0156\13\25\3\26\5\26\u0159\n\26\3\26"+
		"\3\26\3\26\7\26\u015e\n\26\f\26\16\26\u0161\13\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0173"+
		"\n\27\3\30\3\30\3\31\3\31\3\31\7\31\u017a\n\31\f\31\16\31\u017d\13\31"+
		"\3\31\3\31\3\31\3\32\3\32\5\32\u0184\n\32\3\33\5\33\u0187\n\33\3\33\3"+
		"\33\5\33\u018b\n\33\3\34\3\34\3\35\3\35\7\35\u0191\n\35\f\35\16\35\u0194"+
		"\13\35\3\35\3\35\3\36\3\36\3\36\7\36\u019b\n\36\f\36\16\36\u019e\13\36"+
		"\3\36\7\36\u01a1\n\36\f\36\16\36\u01a4\13\36\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \7 \u01ae\n \f \16 \u01b1\13 \3!\3!\3\"\3\"\3\"\3\"\7\"\u01b9\n"+
		"\"\f\"\16\"\u01bc\13\"\3#\3#\3$\3$\3$\3$\7$\u01c4\n$\f$\16$\u01c7\13$"+
		"\3%\3%\3&\5&\u01cc\n&\3&\3&\5&\u01d0\n&\3\'\3\'\3\'\5\'\u01d5\n\'\3(\3"+
		"(\3)\5)\u01da\n)\3)\3)\3)\3)\3)\3)\7)\u01e2\n)\f)\16)\u01e5\13)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\5)\u01ef\n)\3*\3*\3*\3*\7*\u01f5\n*\f*\16*\u01f8\13"+
		"*\3+\3+\3,\3,\3,\3,\7,\u0200\n,\f,\16,\u0203\13,\3-\3-\3.\5.\u0208\n."+
		"\3.\3.\3/\3/\3/\5/\u020f\n/\3\60\3\60\3\60\3\60\5\60\u0215\n\60\3\61\3"+
		"\61\3\61\2\2\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`\2\7\4\2\30\31>@\3\2$\'\3\2/\60\3\2\61\62"+
		"\3\2\649\2\u022e\2b\3\2\2\2\4j\3\2\2\2\6w\3\2\2\2\b\u00a5\3\2\2\2\n\u00b1"+
		"\3\2\2\2\f\u00b3\3\2\2\2\16\u00b6\3\2\2\2\20\u00c3\3\2\2\2\22\u00c9\3"+
		"\2\2\2\24\u00d3\3\2\2\2\26\u00de\3\2\2\2\30\u00ed\3\2\2\2\32\u00ff\3\2"+
		"\2\2\34\u0102\3\2\2\2\36\u010a\3\2\2\2 \u0113\3\2\2\2\"\u011d\3\2\2\2"+
		"$\u0131\3\2\2\2&\u013d\3\2\2\2(\u014f\3\2\2\2*\u0158\3\2\2\2,\u0172\3"+
		"\2\2\2.\u0174\3\2\2\2\60\u0176\3\2\2\2\62\u0183\3\2\2\2\64\u0186\3\2\2"+
		"\2\66\u018c\3\2\2\28\u018e\3\2\2\2:\u0197\3\2\2\2<\u01a5\3\2\2\2>\u01a9"+
		"\3\2\2\2@\u01b2\3\2\2\2B\u01b4\3\2\2\2D\u01bd\3\2\2\2F\u01bf\3\2\2\2H"+
		"\u01c8\3\2\2\2J\u01cf\3\2\2\2L\u01d4\3\2\2\2N\u01d6\3\2\2\2P\u01ee\3\2"+
		"\2\2R\u01f0\3\2\2\2T\u01f9\3\2\2\2V\u01fb\3\2\2\2X\u0204\3\2\2\2Z\u0207"+
		"\3\2\2\2\\\u020e\3\2\2\2^\u0210\3\2\2\2`\u0216\3\2\2\2bc\5\6\4\2cd\7\3"+
		"\2\2de\5\4\3\2ef\7\34\2\2f\3\3\2\2\2gi\5,\27\2hg\3\2\2\2il\3\2\2\2jh\3"+
		"\2\2\2jk\3\2\2\2kp\3\2\2\2lj\3\2\2\2mo\5\n\6\2nm\3\2\2\2or\3\2\2\2pn\3"+
		"\2\2\2pq\3\2\2\2q\5\3\2\2\2rp\3\2\2\2sv\5,\27\2tv\5\b\5\2us\3\2\2\2ut"+
		"\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\7\3\2\2\2yw\3\2\2\2z{\7\23\2\2"+
		"{|\7E\2\2|~\7)\2\2}\177\5(\25\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\u0084\7*\2\2\u0081\u0083\5,\27\2\u0082\u0081\3\2\2\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u008a\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0089\5\n\6\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u00a6\7\"\2\2\u008e\u008f\7\25\2\2\u008f\u0090\7"+
		"E\2\2\u0090\u0092\7)\2\2\u0091\u0093\5(\25\2\u0092\u0091\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7*\2\2\u0095\u0096\7(\2"+
		"\2\u0096\u009a\5\64\33\2\u0097\u0099\5,\27\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a0\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009d\u009f\5\n\6\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7#\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"z\3\2\2\2\u00a5\u008e\3\2\2\2\u00a6\t\3\2\2\2\u00a7\u00b2\5&\24\2\u00a8"+
		"\u00b2\5$\23\2\u00a9\u00b2\5\"\22\2\u00aa\u00b2\5\30\r\2\u00ab\u00b2\5"+
		"\26\f\2\u00ac\u00b2\5\24\13\2\u00ad\u00b2\5\22\n\2\u00ae\u00b2\5\20\t"+
		"\2\u00af\u00b2\5\16\b\2\u00b0\u00b2\5\f\7\2\u00b1\u00a7\3\2\2\2\u00b1"+
		"\u00a8\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00aa\3\2\2\2\u00b1\u00ab\3\2"+
		"\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\13\3\2\2\2\u00b3\u00b4\7\26\2"+
		"\2\u00b4\u00b5\5R*\2\u00b5\r\3\2\2\2\u00b6\u00b7\7E\2\2\u00b7\u00b8\7"+
		")\2\2\u00b8\u00bd\5R*\2\u00b9\u00ba\7+\2\2\u00ba\u00bc\5R*\2\u00bb\u00b9"+
		"\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7*\2\2\u00c1\17\3\2\2\2"+
		"\u00c2\u00c4\7=\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\5:\36\2\u00c6\u00c7\7<\2\2\u00c7\u00c8\5R*\2\u00c8"+
		"\21\3\2\2\2\u00c9\u00cd\7\f\2\2\u00ca\u00cc\5\n\6\2\u00cb\u00ca\3\2\2"+
		"\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\13\2\2\u00d1\u00d2\5R*\2\u00d2"+
		"\23\3\2\2\2\u00d3\u00d4\7\r\2\2\u00d4\u00d5\5R*\2\u00d5\u00d9\7\f\2\2"+
		"\u00d6\u00d8\5\n\6\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00dd\7\37\2\2\u00dd\25\3\2\2\2\u00de\u00df\7\n\2\2\u00df\u00e0\7E\2"+
		"\2\u00e0\u00e1\7<\2\2\u00e1\u00e2\5> \2\u00e2\u00e3\7\13\2\2\u00e3\u00e4"+
		"\5> \2\u00e4\u00e8\7\f\2\2\u00e5\u00e7\5\n\6\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7\36\2\2\u00ec\27\3\2\2\2\u00ed\u00ee"+
		"\7\7\2\2\u00ee\u00ef\5> \2\u00ef\u00f0\7\b\2\2\u00f0\u00f8\5\32\16\2\u00f1"+
		"\u00f5\7\t\2\2\u00f2\u00f4\5\n\6\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00f1\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fb\7\35\2\2\u00fb\31\3\2\2\2\u00fc\u00fe\5\34\17\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\33\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\5\36\20\2\u0103"+
		"\u0107\7(\2\2\u0104\u0106\5\n\6\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\35\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u010a\u010f\5 \21\2\u010b\u010c\7+\2\2\u010c\u010e\5 \21\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\37\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0114\5N(\2\u0113\u0112"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u011b\7?\2\2\u0116"+
		"\u0118\7.\2\2\u0117\u0119\5N(\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2"+
		"\2\u0119\u011a\3\2\2\2\u011a\u011c\7?\2\2\u011b\u0116\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c!\3\2\2\2\u011d\u011e\7\16\2\2\u011e\u011f\5R*\2\u011f\u0123"+
		"\7\20\2\2\u0120\u0122\5\n\6\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2"+
		"\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u012d\3\2\2\2\u0125\u0123"+
		"\3\2\2\2\u0126\u012a\7\t\2\2\u0127\u0129\5\n\6\2\u0128\u0127\3\2\2\2\u0129"+
		"\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012e\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012d\u0126\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0130\7 \2\2\u0130#\3\2\2\2\u0131\u0132\7\6\2\2\u0132"+
		"\u0133\7)\2\2\u0133\u0138\5R*\2\u0134\u0135\7+\2\2\u0135\u0137\5R*\2\u0136"+
		"\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7*\2\2\u013c"+
		"%\3\2\2\2\u013d\u013e\7\5\2\2\u013e\u0140\7)\2\2\u013f\u0141\7=\2\2\u0140"+
		"\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u014a\5:"+
		"\36\2\u0143\u0145\7+\2\2\u0144\u0146\7=\2\2\u0145\u0144\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\5:\36\2\u0148\u0143\3\2"+
		"\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7*\2\2\u014e\'\3\2\2\2"+
		"\u014f\u0154\5*\26\2\u0150\u0151\7+\2\2\u0151\u0153\5*\26\2\u0152\u0150"+
		"\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		")\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0159\7\24\2\2\u0158\u0157\3\2\2\2"+
		"\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015f\5:\36\2\u015b\u015c"+
		"\7+\2\2\u015c\u015e\5:\36\2\u015d\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0162\u0163\7(\2\2\u0163\u0164\5\64\33\2\u0164+\3\2\2\2\u0165\u0166"+
		"\7\4\2\2\u0166\u0173\5\60\31\2\u0167\u0168\7\27\2\2\u0168\u0169\7E\2\2"+
		"\u0169\u016a\7(\2\2\u016a\u016b\5\66\34\2\u016b\u016c\79\2\2\u016c\u016d"+
		"\5.\30\2\u016d\u0173\3\2\2\2\u016e\u016f\7\22\2\2\u016f\u0170\7E\2\2\u0170"+
		"\u0171\7(\2\2\u0171\u0173\5\62\32\2\u0172\u0165\3\2\2\2\u0172\u0167\3"+
		"\2\2\2\u0172\u016e\3\2\2\2\u0173-\3\2\2\2\u0174\u0175\t\2\2\2\u0175/\3"+
		"\2\2\2\u0176\u017b\5:\36\2\u0177\u0178\7+\2\2\u0178\u017a\5:\36\2\u0179"+
		"\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7(\2\2\u017f"+
		"\u0180\5\62\32\2\u0180\61\3\2\2\2\u0181\u0184\58\35\2\u0182\u0184\5\64"+
		"\33\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184\63\3\2\2\2\u0185\u0187"+
		"\7=\2\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018a\3\2\2\2\u0188"+
		"\u018b\5\66\34\2\u0189\u018b\7E\2\2\u018a\u0188\3\2\2\2\u018a\u0189\3"+
		"\2\2\2\u018b\65\3\2\2\2\u018c\u018d\t\3\2\2\u018d\67\3\2\2\2\u018e\u0192"+
		"\7\21\2\2\u018f\u0191\5\60\31\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2"+
		"\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192"+
		"\3\2\2\2\u0195\u0196\7!\2\2\u01969\3\2\2\2\u0197\u019c\7E\2\2\u0198\u0199"+
		"\7;\2\2\u0199\u019b\7E\2\2\u019a\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a2\3\2\2\2\u019e\u019c\3\2"+
		"\2\2\u019f\u01a1\5<\37\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3;\3\2\2\2\u01a4\u01a2\3\2\2\2"+
		"\u01a5\u01a6\7,\2\2\u01a6\u01a7\5> \2\u01a7\u01a8\7-\2\2\u01a8=\3\2\2"+
		"\2\u01a9\u01af\5B\"\2\u01aa\u01ab\5@!\2\u01ab\u01ac\5B\"\2\u01ac\u01ae"+
		"\3\2\2\2\u01ad\u01aa\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0?\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\t\4\2\2"+
		"\u01b3A\3\2\2\2\u01b4\u01ba\5F$\2\u01b5\u01b6\5D#\2\u01b6\u01b7\5F$\2"+
		"\u01b7\u01b9\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8"+
		"\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bbC\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd"+
		"\u01be\t\5\2\2\u01beE\3\2\2\2\u01bf\u01c5\5J&\2\u01c0\u01c1\5H%\2\u01c1"+
		"\u01c2\5J&\2\u01c2\u01c4\3\2\2\2\u01c3\u01c0\3\2\2\2\u01c4\u01c7\3\2\2"+
		"\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6G\3\2\2\2\u01c7\u01c5"+
		"\3\2\2\2\u01c8\u01c9\7\63\2\2\u01c9I\3\2\2\2\u01ca\u01cc\5N(\2\u01cb\u01ca"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d0\5P)\2\u01ce"+
		"\u01d0\5L\'\2\u01cf\u01cb\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0K\3\2\2\2\u01d1"+
		"\u01d2\7:\2\2\u01d2\u01d5\5:\36\2\u01d3\u01d5\7>\2\2\u01d4\u01d1\3\2\2"+
		"\2\u01d4\u01d3\3\2\2\2\u01d5M\3\2\2\2\u01d6\u01d7\7\60\2\2\u01d7O\3\2"+
		"\2\2\u01d8\u01da\7=\2\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01ef\5:\36\2\u01dc\u01dd\7E\2\2\u01dd\u01de\7)\2"+
		"\2\u01de\u01e3\5R*\2\u01df\u01e0\7+\2\2\u01e0\u01e2\5R*\2\u01e1\u01df"+
		"\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e6\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e7\7*\2\2\u01e7\u01ef\3\2"+
		"\2\2\u01e8\u01ef\7?\2\2\u01e9\u01ef\7@\2\2\u01ea\u01eb\7)\2\2\u01eb\u01ec"+
		"\5R*\2\u01ec\u01ed\7*\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01d9\3\2\2\2\u01ee"+
		"\u01dc\3\2\2\2\u01ee\u01e8\3\2\2\2\u01ee\u01e9\3\2\2\2\u01ee\u01ea\3\2"+
		"\2\2\u01efQ\3\2\2\2\u01f0\u01f6\5V,\2\u01f1\u01f2\5T+\2\u01f2\u01f3\5"+
		"V,\2\u01f3\u01f5\3\2\2\2\u01f4\u01f1\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6"+
		"\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7S\3\2\2\2\u01f8\u01f6\3\2\2\2"+
		"\u01f9\u01fa\7\33\2\2\u01faU\3\2\2\2\u01fb\u0201\5Z.\2\u01fc\u01fd\5X"+
		"-\2\u01fd\u01fe\5Z.\2\u01fe\u0200\3\2\2\2\u01ff\u01fc\3\2\2\2\u0200\u0203"+
		"\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202W\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0204\u0205\7\17\2\2\u0205Y\3\2\2\2\u0206\u0208\7\32\2"+
		"\2\u0207\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a"+
		"\5\\/\2\u020a[\3\2\2\2\u020b\u020f\7\30\2\2\u020c\u020f\7\31\2\2\u020d"+
		"\u020f\5^\60\2\u020e\u020b\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020d\3\2"+
		"\2\2\u020f]\3\2\2\2\u0210\u0214\5> \2\u0211\u0212\5`\61\2\u0212\u0213"+
		"\5> \2\u0213\u0215\3\2\2\2\u0214\u0211\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"_\3\2\2\2\u0216\u0217\t\6\2\2\u0217a\3\2\2\2;jpuw~\u0084\u008a\u0092\u009a"+
		"\u00a0\u00a5\u00b1\u00bd\u00c3\u00cd\u00d9\u00e8\u00f5\u00f8\u00ff\u0107"+
		"\u010f\u0113\u0118\u011b\u0123\u012a\u012d\u0138\u0140\u0145\u014a\u0154"+
		"\u0158\u015f\u0172\u017b\u0183\u0186\u018a\u0192\u019c\u01a2\u01af\u01ba"+
		"\u01c5\u01cb\u01cf\u01d4\u01d9\u01e3\u01ee\u01f6\u0201\u0207\u020e\u0214";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}