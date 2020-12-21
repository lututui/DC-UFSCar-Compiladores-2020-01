grammar Alguma;

programa: declaracao* PR_ALGORITMO corpo PR_FIM_ALGORITMO;
declaracao: declaracaoLocal | declaracaoGlobal;
corpo: declaracaoLocal* cmd*;
declaracaoGlobal: PR_PROCEDIMENTO IDENT DELIMITADOR_ABRE_PARENTESES (parametro (DELIMITADOR_VIRGULA parametro)*)? DELIMITADOR_FECHA_PARENTESES declaracaoLocal* cmd* PR_FIM_PROCEDIMENTO |
                  PR_FUNCAO       IDENT DELIMITADOR_ABRE_PARENTESES (parametro (DELIMITADOR_VIRGULA parametro)*)? DELIMITADOR_FECHA_PARENTESES DELIMITADOR_DOIS_PONTOS tipoEstendido declaracaoLocal* cmd* PR_FIM_FUNCAO;
cmd: cmdLeia | cmdEscreva | cmdSe | cmdCaso | cmdPara | cmdEnquanto | cmdFaca | cmdAtribuicao | cmdChamada | cmdRetorne;
cmdRetorne: PR_RETORNE expressaoLogica;
cmdChamada: IDENT DELIMITADOR_ABRE_PARENTESES expressaoLogica (DELIMITADOR_VIRGULA expressaoLogica)* DELIMITADOR_FECHA_PARENTESES;
cmdAtribuicao: identificadorEndereco OPERADOR_ATRIBUICAO expressaoLogica;
cmdFaca: PR_FACA cmd* PR_ATE expressaoLogica;
cmdEnquanto: PR_ENQUANTO expressaoLogica PR_FACA cmd* PR_FIM_ENQUANTO;
cmdPara: PR_PARA IDENT OPERADOR_ATRIBUICAO expressaoAritmetica PR_ATE expressaoAritmetica PR_FACA cmd* PR_FIM_PARA;
cmdCaso: PR_CASO expressaoAritmetica PR_SEJA selecao* cmdSenao? PR_FIM_CASO;
selecao: intervaloNumerico (DELIMITADOR_VIRGULA intervaloNumerico)* DELIMITADOR_DOIS_PONTOS cmd*;
intervaloNumerico: inteiro (OPERADOR_RANGE inteiro)?;
inteiro: operadorUnario? NUM_INT;
cmdSe: PR_SE expressaoLogica PR_ENTAO cmd* cmdSenao? PR_FIM_SE;
cmdEscreva: PR_ESCREVA DELIMITADOR_ABRE_PARENTESES expressaoLogica (DELIMITADOR_VIRGULA expressaoLogica)* DELIMITADOR_FECHA_PARENTESES;
cmdLeia: PR_LEIA DELIMITADOR_ABRE_PARENTESES identificadorEndereco (',' identificadorEndereco)* DELIMITADOR_FECHA_PARENTESES;
cmdSenao: PR_SENAO cmd*;
parametro: PR_VAR? identificador (DELIMITADOR_VIRGULA identificador)* DELIMITADOR_DOIS_PONTOS tipoEstendido;
declaracaoLocal: (PR_DECLARE variavel) |
    (PR_CONSTANTE IDENT DELIMITADOR_DOIS_PONTOS tipoBasico OPERADOR_IGUAL valorConstante) |
    (PR_TIPO IDENT DELIMITADOR_DOIS_PONTOS tipo);
valorConstante: CADEIA | inteiro | (operadorUnario? NUM_REAL) | PR_VERDADEIRO | PR_FALSO;
variavel: identificador (DELIMITADOR_VIRGULA identificador)* DELIMITADOR_DOIS_PONTOS tipo;
tipo: registro | tipoEstendido;
tipoEstendido: TIPO_ENDERECO? (tipoBasico | IDENT);
tipoBasico: PR_TIPO_LITERAL | PR_TIPO_INTEIRO | PR_TIPO_REAL | PR_TIPO_LOGICO;
registro: PR_REGISTRO variavel* PR_FIM_REGISTRO;
identificador: IDENT (OPERADOR_REGISTRO identificador)? dimensao*;
dimensao: DELIMITADOR_ABRE_COLCHETES expressaoAritmetica DELIMITADOR_FECHA_COLCHETES;
expressaoAritmetica: termoAritmetico (operadorAritmetico1 termoAritmetico)*;
operadorAritmetico1: OPERADOR_SOMA | OPERADOR_SUBTRACAO;
termoAritmetico: fatorAritmetico (operadorAritmetico2 fatorAritmetico)*;
operadorAritmetico2: OPERADOR_MULTIPLICACAO | OPERADOR_DIVISAO;
fatorAritmetico: parcelaAritmetica (OPERADOR_MOD parcelaAritmetica)*;
parcelaAritmetica: parcelaUnario | parcelaNaoUnario;
operadorUnario: OPERADOR_SUBTRACAO;
parcelaNaoUnario: (OPERADOR_ENDERECO identificador) | CADEIA;
parcelaUnario: operadorUnario? (identificadorEndereco | cmdChamada | NUM_INT | NUM_REAL | (DELIMITADOR_ABRE_PARENTESES expressaoLogica DELIMITADOR_FECHA_PARENTESES));
expressaoLogica: termoLogico (PR_OU termoLogico)*;
termoLogico: fatorLogico (PR_E fatorLogico)*;
fatorLogico: PR_NAO? (PR_VERDADEIRO | PR_FALSO | expressaoRelacional);
expressaoRelacional: expressaoAritmetica (operadorRelacional expressaoAritmetica)?;
operadorRelacional: OPERADOR_IGUAL | OPERADOR_DIFERENTE | OPERADOR_MAIOR_IGUAL | OPERADOR_MENOR_IGUAL | OPERADOR_MAIOR | OPERADOR_MENOR;
identificadorEndereco: TIPO_ENDERECO? identificador;

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