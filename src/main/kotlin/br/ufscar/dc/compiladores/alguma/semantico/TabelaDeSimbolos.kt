package br.ufscar.dc.compiladores.alguma.semantico

class TabelaDeSimbolos {
    private val tabela = HashMap<String, Simbolo>()

    fun put(identificador : String, tipo : String) {
        tabela[identificador] = Simbolo(identificador, tipo)
    }

    fun contains(identificador: String): Boolean {
        return tabela.containsKey(identificador)
    }

    fun containsTipo(tipo: String): Boolean {
        if (tipo == "inteiro" || tipo == "real" || tipo == "logico" || tipo == "literal") {
            return true
        }

        return tabela.any { it.value.tipo == tipo }
    }
}