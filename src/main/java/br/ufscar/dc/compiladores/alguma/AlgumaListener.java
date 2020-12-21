// Generated from C:/Users/74434/Documents/GitHub/analisador-lexico-la-antlr/src/main/java/br/ufscar/dc/compiladores/alguma\Alguma.g4 by ANTLR 4.8
package br.ufscar.dc.compiladores.alguma;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaParser}.
 */
public interface AlgumaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(AlgumaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(AlgumaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(AlgumaParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(AlgumaParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#declaracaoGlobal}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoGlobal(AlgumaParser.DeclaracaoGlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#declaracaoGlobal}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoGlobal(AlgumaParser.DeclaracaoGlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(AlgumaParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(AlgumaParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(AlgumaParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(AlgumaParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(AlgumaParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(AlgumaParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(AlgumaParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(AlgumaParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(AlgumaParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(AlgumaParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(AlgumaParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(AlgumaParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(AlgumaParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(AlgumaParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(AlgumaParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(AlgumaParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(AlgumaParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(AlgumaParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#intervaloNumerico}.
	 * @param ctx the parse tree
	 */
	void enterIntervaloNumerico(AlgumaParser.IntervaloNumericoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#intervaloNumerico}.
	 * @param ctx the parse tree
	 */
	void exitIntervaloNumerico(AlgumaParser.IntervaloNumericoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#inteiro}.
	 * @param ctx the parse tree
	 */
	void enterInteiro(AlgumaParser.InteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#inteiro}.
	 * @param ctx the parse tree
	 */
	void exitInteiro(AlgumaParser.InteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(AlgumaParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(AlgumaParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(AlgumaParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(AlgumaParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(AlgumaParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(AlgumaParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmdSenao}.
	 * @param ctx the parse tree
	 */
	void enterCmdSenao(AlgumaParser.CmdSenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmdSenao}.
	 * @param ctx the parse tree
	 */
	void exitCmdSenao(AlgumaParser.CmdSenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(AlgumaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(AlgumaParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#declaracaoLocal}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoLocal(AlgumaParser.DeclaracaoLocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#declaracaoLocal}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoLocal(AlgumaParser.DeclaracaoLocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#valorConstante}.
	 * @param ctx the parse tree
	 */
	void enterValorConstante(AlgumaParser.ValorConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#valorConstante}.
	 * @param ctx the parse tree
	 */
	void exitValorConstante(AlgumaParser.ValorConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(AlgumaParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(AlgumaParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(AlgumaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(AlgumaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#tipoEstendido}.
	 * @param ctx the parse tree
	 */
	void enterTipoEstendido(AlgumaParser.TipoEstendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#tipoEstendido}.
	 * @param ctx the parse tree
	 */
	void exitTipoEstendido(AlgumaParser.TipoEstendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#tipoBasico}.
	 * @param ctx the parse tree
	 */
	void enterTipoBasico(AlgumaParser.TipoBasicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#tipoBasico}.
	 * @param ctx the parse tree
	 */
	void exitTipoBasico(AlgumaParser.TipoBasicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(AlgumaParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(AlgumaParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(AlgumaParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(AlgumaParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(AlgumaParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(AlgumaParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(AlgumaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(AlgumaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#operadorAritmetico1}.
	 * @param ctx the parse tree
	 */
	void enterOperadorAritmetico1(AlgumaParser.OperadorAritmetico1Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#operadorAritmetico1}.
	 * @param ctx the parse tree
	 */
	void exitOperadorAritmetico1(AlgumaParser.OperadorAritmetico1Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmetico(AlgumaParser.TermoAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmetico(AlgumaParser.TermoAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#operadorAritmetico2}.
	 * @param ctx the parse tree
	 */
	void enterOperadorAritmetico2(AlgumaParser.OperadorAritmetico2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#operadorAritmetico2}.
	 * @param ctx the parse tree
	 */
	void exitOperadorAritmetico2(AlgumaParser.OperadorAritmetico2Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFatorAritmetico(AlgumaParser.FatorAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFatorAritmetico(AlgumaParser.FatorAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#parcelaAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterParcelaAritmetica(AlgumaParser.ParcelaAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#parcelaAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitParcelaAritmetica(AlgumaParser.ParcelaAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#operadorUnario}.
	 * @param ctx the parse tree
	 */
	void enterOperadorUnario(AlgumaParser.OperadorUnarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#operadorUnario}.
	 * @param ctx the parse tree
	 */
	void exitOperadorUnario(AlgumaParser.OperadorUnarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#parcelaNaoUnario}.
	 * @param ctx the parse tree
	 */
	void enterParcelaNaoUnario(AlgumaParser.ParcelaNaoUnarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#parcelaNaoUnario}.
	 * @param ctx the parse tree
	 */
	void exitParcelaNaoUnario(AlgumaParser.ParcelaNaoUnarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#parcelaUnario}.
	 * @param ctx the parse tree
	 */
	void enterParcelaUnario(AlgumaParser.ParcelaUnarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#parcelaUnario}.
	 * @param ctx the parse tree
	 */
	void exitParcelaUnario(AlgumaParser.ParcelaUnarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogica(AlgumaParser.ExpressaoLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogica(AlgumaParser.ExpressaoLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#termoLogico}.
	 * @param ctx the parse tree
	 */
	void enterTermoLogico(AlgumaParser.TermoLogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#termoLogico}.
	 * @param ctx the parse tree
	 */
	void exitTermoLogico(AlgumaParser.TermoLogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#fatorLogico}.
	 * @param ctx the parse tree
	 */
	void enterFatorLogico(AlgumaParser.FatorLogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#fatorLogico}.
	 * @param ctx the parse tree
	 */
	void exitFatorLogico(AlgumaParser.FatorLogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(AlgumaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(AlgumaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#operadorRelacional}.
	 * @param ctx the parse tree
	 */
	void enterOperadorRelacional(AlgumaParser.OperadorRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#operadorRelacional}.
	 * @param ctx the parse tree
	 */
	void exitOperadorRelacional(AlgumaParser.OperadorRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#identificadorEndereco}.
	 * @param ctx the parse tree
	 */
	void enterIdentificadorEndereco(AlgumaParser.IdentificadorEnderecoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#identificadorEndereco}.
	 * @param ctx the parse tree
	 */
	void exitIdentificadorEndereco(AlgumaParser.IdentificadorEnderecoContext ctx);
}