package br.ufscar.dc.compiladores.alguma.semantico

import br.ufscar.dc.compiladores.alguma.AlgumaBaseVisitor
import br.ufscar.dc.compiladores.alguma.AlgumaParser

class Visitor : AlgumaBaseVisitor<Any>() {
    val escopo = Escopo()
    val tabelaDeSimbolos = TabelaDeSimbolos()
    val erros = mutableListOf<ErroSemantico>()

    override fun visitDeclaracaoLocal(ctx: AlgumaParser.DeclaracaoLocalContext?) {
        if (ctx == null) return

        if (ctx.PR_DECLARE() != null) {
            visitVariavel(ctx.variavel())
            return
        }

        val ident = ctx.IDENT().text

        if (ctx.PR_CONSTANTE() != null) {
            tabelaDeSimbolos.put(ident, ctx.tipoBasico().text)
            return
        }

        tabelaDeSimbolos.put(ident, visitTipo(ctx.tipo()))
    }

    override fun visitDeclaracaoGlobal(ctx: AlgumaParser.DeclaracaoGlobalContext?) {
        if (ctx == null) return

        if (ctx.PR_FUNCAO() != null) {
            tabelaDeSimbolos.put(ctx.IDENT().text, "funcao")
            return
        }

        tabelaDeSimbolos.put(ctx.IDENT().text, "procedimento")
    }

    override fun visitTipo(ctx: AlgumaParser.TipoContext): String {
        if (ctx.registro() != null) {
            visitRegistro(ctx.registro())
            return "registro"
        }

        return visitTipoEstendido(ctx.tipoEstendido())
    }

    override fun visitRegistro(ctx: AlgumaParser.RegistroContext?) {
        if (ctx == null) return

        ctx.variavel().forEach {
            tabelaDeSimbolos
        }

        visitVariavel(ctx.variavel())
    }

    override fun visitTipoEstendido(ctx: AlgumaParser.TipoEstendidoContext): String {
        if (ctx.tipoBasico() != null) {
            return visitTipoBasico(ctx.tipoBasico())
        }

        val ident = ctx.IDENT().text

        if (!tabelaDeSimbolos.containsTipo(ident)) {
            erros.add(ErroSemantico(ctx.start.line, "tipo $ident nao declarado"))
        }

        return ctx.IDENT().text
    }

    override fun visitTipoBasico(ctx: AlgumaParser.TipoBasicoContext): String {
        if (ctx.PR_TIPO_INTEIRO() != null) return "inteiro"
        if (ctx.PR_TIPO_LITERAL() != null) return "literal"
        if (ctx.PR_TIPO_LOGICO() != null) return "logico"

        return "real"
    }

    override fun visitVariavel(ctx: AlgumaParser.VariavelContext) {
        val tipo = visitTipo(ctx.tipo())

        ctx.identificador().forEach { visitVariavel(it, tipo) }
    }

    override fun visitIdentificadorEndereco(ctx: AlgumaParser.IdentificadorEnderecoContext): String {
        val ident = if (ctx.TIPO_ENDERECO() == null) {
            visitIdentificador(ctx.identificador())
        } else "^${visitIdentificador(ctx.identificador())}"

        if (!tabelaDeSimbolos.contains(ident)) {
            erros.add(ErroSemantico(ctx.start.line, "identificador $ident nao declarado"))
        }

        return ident
    }

    override fun visitIdentificador(ctx: AlgumaParser.IdentificadorContext): String {
        if (ctx.identificador() == null) return ctx.IDENT().text

        return "${ctx.IDENT()}.${visitIdentificador(ctx.identificador())}"
    }

    /* private */

    private fun visitVariavel(variavel: AlgumaParser.IdentificadorContext, tipo: String) {
        if (tabelaDeSimbolos.contains(variavel.text)) {
            erros.add(ErroSemantico(variavel.start.line, "identificador ${variavel.text} ja declarado anteriormente"))
            return
        }

        if (!tabelaDeSimbolos.containsTipo(tipo)) return

        tabelaDeSimbolos.put(variavel.text, tipo)
    }

    private fun visitVariavel(ctxs: List<AlgumaParser.VariavelContext>) {
        ctxs.forEach { visitVariavel(it) }
    }
}