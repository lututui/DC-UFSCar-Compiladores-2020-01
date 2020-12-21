// Generated from C:/Users/74434/Documents/GitHub/analisador-lexico-la-antlr/src/main/java/br/ufscar/dc/compiladores/alguma\Alguma.g4 by ANTLR 4.8
package br.ufscar.dc.compiladores.alguma;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlgumaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlgumaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(AlgumaParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(AlgumaParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#declaracaoGlobal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoGlobal(AlgumaParser.DeclaracaoGlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(AlgumaParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#cmdRetorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRetorne(AlgumaParser.CmdRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#cmdChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamada(AlgumaParser.CmdChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtribuicao(AlgumaParser.CmdAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#cmdFaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFaca(AlgumaParser.CmdFacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnquanto(AlgumaParser.CmdEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#cmdPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPara(AlgumaParser.CmdParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#cmdCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCaso(AlgumaParser.CmdCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(AlgumaParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#intervaloNumerico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervaloNumerico(AlgumaParser.IntervaloNumericoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#inteiro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteiro(AlgumaParser.InteiroContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#cmdSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSe(AlgumaParser.CmdSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#cmdEscreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscreva(AlgumaParser.CmdEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#cmdLeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeia(AlgumaParser.CmdLeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#cmdSenao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSenao(AlgumaParser.CmdSenaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(AlgumaParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#declaracaoLocal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoLocal(AlgumaParser.DeclaracaoLocalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#valorConstante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorConstante(AlgumaParser.ValorConstanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(AlgumaParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(AlgumaParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#tipoEstendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoEstendido(AlgumaParser.TipoEstendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#tipoBasico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoBasico(AlgumaParser.TipoBasicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(AlgumaParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(AlgumaParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(AlgumaParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAritmetica(AlgumaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#operadorAritmetico1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorAritmetico1(AlgumaParser.OperadorAritmetico1Context ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#termoAritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoAritmetico(AlgumaParser.TermoAritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#operadorAritmetico2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorAritmetico2(AlgumaParser.OperadorAritmetico2Context ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorAritmetico(AlgumaParser.FatorAritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#parcelaAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcelaAritmetica(AlgumaParser.ParcelaAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#operadorUnario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorUnario(AlgumaParser.OperadorUnarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#parcelaNaoUnario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcelaNaoUnario(AlgumaParser.ParcelaNaoUnarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#parcelaUnario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcelaUnario(AlgumaParser.ParcelaUnarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#expressaoLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoLogica(AlgumaParser.ExpressaoLogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#termoLogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoLogico(AlgumaParser.TermoLogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#fatorLogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorLogico(AlgumaParser.FatorLogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoRelacional(AlgumaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#operadorRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorRelacional(AlgumaParser.OperadorRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#identificadorEndereco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificadorEndereco(AlgumaParser.IdentificadorEnderecoContext ctx);
}