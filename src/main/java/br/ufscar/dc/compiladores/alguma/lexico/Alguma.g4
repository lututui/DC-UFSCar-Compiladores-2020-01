grammar Alguma;

programa: declaracoes PR_ALGORITMO corpo PR_FIM_ALGORITMO;
corpo: declaracao_local* cmd*;
declaracoes: (declaracao_local | declaracao_global)*;
declaracao_global: (PR_PROCEDIMENTO IDENT DELIMITADOR_ABRE_PARENTESES parametros? DELIMITADOR_FECHA_PARENTESES declaracao_local* cmd* PR_FIM_PROCEDIMENTO) |
    PR_FUNCAO IDENT DELIMITADOR_ABRE_PARENTESES parametros? DELIMITADOR_FECHA_PARENTESES DELIMITADOR_DOIS_PONTOS tipo_estendido declaracao_local* cmd* PR_FIM_FUNCAO;
cmd: cmdLeia | cmdEscreva | cmdSe | cmdCaso | cmdPara | cmdEnquanto | cmdFaca | cmdAtribuicao | cmdChamada | cmdRetorne;
cmdRetorne: PR_RETORNE expressao;
cmdChamada: IDENT DELIMITADOR_ABRE_PARENTESES expressao (DELIMITADOR_VIRGULA expressao)* DELIMITADOR_FECHA_PARENTESES;
cmdAtribuicao: TIPO_ENDERECO? identificador OPERADOR_ATRIBUICAO expressao;
cmdFaca: PR_FACA cmd* PR_ATE expressao;
cmdEnquanto: PR_ENQUANTO expressao PR_FACA cmd* PR_FIM_ENQUANTO;
cmdPara: PR_PARA IDENT OPERADOR_ATRIBUICAO expressao_aritmetica PR_ATE expressao_aritmetica PR_FACA cmd* PR_FIM_PARA;
cmdCaso: PR_CASO expressao_aritmetica PR_SEJA selecao (PR_SENAO cmd*)? PR_FIM_CASO;
selecao: item_selecao*;
item_selecao: constantes DELIMITADOR_DOIS_PONTOS cmd*;
constantes: numero_intervalo (DELIMITADOR_VIRGULA numero_intervalo)*;
numero_intervalo: op_unario? NUM_INT (OPERADOR_RANGE op_unario? NUM_INT)?;
cmdSe: PR_SE expressao PR_ENTAO cmd* (PR_SENAO cmd*)? PR_FIM_SE;
cmdEscreva: PR_ESCREVA DELIMITADOR_ABRE_PARENTESES expressao (DELIMITADOR_VIRGULA expressao)* DELIMITADOR_FECHA_PARENTESES;
cmdLeia: PR_LEIA DELIMITADOR_ABRE_PARENTESES TIPO_ENDERECO? identificador (',' TIPO_ENDERECO? identificador)* DELIMITADOR_FECHA_PARENTESES;
parametros: parametro (DELIMITADOR_VIRGULA parametro)*;
parametro: PR_VAR? identificador (DELIMITADOR_VIRGULA identificador)* DELIMITADOR_DOIS_PONTOS tipo_estendido;
declaracao_local: (PR_DECLARE variavel) |
    (PR_CONSTANTE IDENT DELIMITADOR_DOIS_PONTOS tipo_basico OPERADOR_IGUAL valor_constante) |
    (PR_TIPO IDENT DELIMITADOR_DOIS_PONTOS tipo);
valor_constante: CADEIA | NUM_INT | NUM_REAL | PR_VERDADEIRO | PR_FALSO;
variavel: identificador (DELIMITADOR_VIRGULA identificador)* DELIMITADOR_DOIS_PONTOS tipo;
tipo: registro | tipo_estendido;
tipo_estendido: TIPO_ENDERECO? (tipo_basico | IDENT);
tipo_basico: PR_TIPO_LITERAL | PR_TIPO_INTEIRO | PR_TIPO_REAL | PR_TIPO_LOGICO;
registro: PR_REGISTRO variavel* PR_FIM_REGISTRO;
identificador: IDENT (OPERADOR_REGISTRO IDENT)* dimensao*;
dimensao: DELIMITADOR_ABRE_COLCHETES expressao_aritmetica DELIMITADOR_FECHA_COLCHETES;
expressao_aritmetica: termo (op1 termo)*;
op1: OPERADOR_SOMA | OPERADOR_SUBTRACAO;
termo: fator (op2 fator)*;
op2: OPERADOR_MULTIPLICACAO | OPERADOR_DIVISAO;
fator: parcela (op3 parcela)*;
op3: OPERADOR_MOD;
parcela: (op_unario? parcela_unario) | parcela_nao_unario;
parcela_nao_unario: (OPERADOR_ENDERECO identificador) | CADEIA;
op_unario: OPERADOR_SUBTRACAO;
parcela_unario: (TIPO_ENDERECO? identificador) |
     (IDENT DELIMITADOR_ABRE_PARENTESES expressao (DELIMITADOR_VIRGULA expressao)* DELIMITADOR_FECHA_PARENTESES) |
     NUM_INT |
     NUM_REAL |
     (DELIMITADOR_ABRE_PARENTESES expressao DELIMITADOR_FECHA_PARENTESES);
expressao: termo_logico (op1_logico termo_logico)*;
op1_logico: PR_OU;
termo_logico: fator_logico (op2_logico fator_logico)*;
op2_logico: PR_E;
fator_logico: PR_NAO? parcela_logica;
parcela_logica: PR_VERDADEIRO | PR_FALSO | expressao_relacional;
expressao_relacional: expressao_aritmetica (op_relacional expressao_aritmetica)?;
op_relacional: OPERADOR_IGUAL |
    OPERADOR_DIFERENTE |
    OPERADOR_MAIOR_IGUAL |
    OPERADOR_MENOR_IGUAL |
    OPERADOR_MAIOR |
    OPERADOR_MENOR;

PR_ALGORITMO: 'algoritmo';
PR_DECLARE: 'declare';
PR_LEIA: 'leia';
PR_ESCREVA: 'escreva';
PR_CASO: 'caso';
PR_SEJA: 'seja';
PR_SENAO: 'senao';
PR_PARA: 'para';
PR_ATE: 'ate';
PR_FACA: 'faca';
PR_ENQUANTO: 'enquanto';
PR_SE: 'se';
PR_E: 'e';
PR_ENTAO: 'entao';
PR_REGISTRO: 'registro';
PR_TIPO: 'tipo';
PR_PROCEDIMENTO: 'procedimento';
PR_VAR: 'var';
PR_FUNCAO: 'funcao';
PR_RETORNE: 'retorne';
PR_CONSTANTE: 'constante';
PR_VERDADEIRO: 'verdadeiro';
PR_FALSO: 'falso';
PR_NAO: 'nao';
PR_OU: 'ou';

PR_FIM_ALGORITMO: 'fim_algoritmo';
PR_FIM_CASO: 'fim_caso';
PR_FIM_PARA: 'fim_para';
PR_FIM_ENQUANTO: 'fim_enquanto';
PR_FIM_SE: 'fim_se';
PR_FIM_REGISTRO: 'fim_registro';
PR_FIM_PROCEDIMENTO: 'fim_procedimento';
PR_FIM_FUNCAO: 'fim_funcao';

PR_TIPO_LITERAL: 'literal';
PR_TIPO_INTEIRO: 'inteiro';
PR_TIPO_REAL: 'real';
PR_TIPO_LOGICO: 'logico';

DELIMITADOR_DOIS_PONTOS: ':';
DELIMITADOR_ABRE_PARENTESES: '(';
DELIMITADOR_FECHA_PARENTESES: ')';
DELIMITADOR_VIRGULA: ',';
DELIMITADOR_ABRE_COLCHETES: '[';
DELIMITADOR_FECHA_COLCHETES: ']';

OPERADOR_RANGE: '..';
OPERADOR_SOMA: '+';
OPERADOR_SUBTRACAO: '-';
OPERADOR_MULTIPLICACAO: '*';
OPERADOR_DIVISAO: '/';
OPERADOR_MOD: '%';
OPERADOR_MENOR: '<';
OPERADOR_MAIOR: '>';
OPERADOR_DIFERENTE: '<>';
OPERADOR_MAIOR_IGUAL: '>=';
OPERADOR_MENOR_IGUAL: '<=';
OPERADOR_IGUAL: '=';
OPERADOR_ENDERECO: '&';
OPERADOR_REGISTRO: '.';
OPERADOR_ATRIBUICAO: '<-';

TIPO_ENDERECO: '^';

CADEIA: '"' ~[\r\n]*? '"';

fragment LETRA: 'a'..'z' | 'A'..'Z';
NUM_INT: ('0'..'9')+;
NUM_REAL: NUM_INT '.' NUM_INT;

COMENTARIO: '{' ~[\r\n]*? '}' -> skip;
ESPACO_EM_BRANCO: [ \t\r\n]+ -> skip;

COMENTARIO_NAO_FECHADO: '{' ~[}]* [\r\n]+?;
CADEIA_NAO_FECHADA: '"' ~["]* [\r\n]+?;

IDENT: (LETRA|'_')(LETRA|NUM_INT|'_')*;