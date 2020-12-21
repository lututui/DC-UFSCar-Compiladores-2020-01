package br.ufscar.dc.compiladores.alguma.semantico

class ErroSemantico(linha: Int, message: String) : Exception("Linha $linha: $message")
