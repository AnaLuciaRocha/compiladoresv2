lexer grammar algLexer;

//null alg true false while do finally leave restart return if then else write writeln
//Add rules
// 1. Palavras chave
INT                 : 'int';
BOOL                : 'bool';
FLOAT               : 'float';
STRING              : 'string';
VOID                : 'void';
SIZEOF              : 'sizeof';
NULL                : 'null';
ALG                 : 'alg';
TRUE                : 'true';
FALSE               : 'false';
WHILE               : 'while';
DO                  : 'do';
FINALLY             : 'finally';
LEAVE               : 'leave';
RESTART             : 'restart';
RETURN              : 'return';
IF                  : 'if';
THEN                : 'then';
ELSE                : 'else';
WRITE               : 'write';
WRITELN             : 'writeln';

// 2. Caracteres brancos
SPACES              : [\n\r\t ]+ -> skip;

// 3. Comentarios
COMMENT_E           : '##' ~[\n\r]* '\r'? '\n' -> skip;
COMMENT_O           : '(*' ~[*)]*  '*)' -> skip; //rever pode ter qualquer coisa dentro

// 4. Delimitadores e terminadores
COMMA               : ',';
SEMI_COLON          : ';';
L_PAREN             : '(';
R_PAREN             : ')';
//EXPRESSION_DELI     : '(' ~[)]* ')';


// 5. Identificadores
INDENT              :  ([a-zA-Z] | [\u0080-\u00FF])([a-zA-Z0-9_] | [\u0080-\u00FF])*;

// 6. Literais
LITERAL_INT         : ([1-9][0-9]*) | [0]{1};
DOUBLE              : LITERAL_INT ('.' [0-9]+)? ([eE] [+-]? LITERAL_INT)?;
//LITERAL_STRING      : [\u0027] (~[\u0000]* ~([~\u0027])+ ('~'['])?)* [\u0027];
LITERAL_STRING      : '\''  ('~'~[\u0000] | ~[~\u0000])*? '\''; //non greedy - match the least amount of data while allowing the remainder of the regex to match.


// 7. Operadores e outras seq relevantes
PLUS                : '+';
MINUS               : '-';
MULT                : '*';
DIV                 : '/';
REMAIN              : '%';
L_BRACKET            : '[';
R_BRACKET            : ']';
QUESTION            : '?';
LESS_THAN           : '<';
GREATER_THAN        : '>';
GREATER_EQUAL_THAN  : '>=';
LESS_EQUAL_THAN     :'<=';
IS_EQUAL            : '==';
EQUAL               : '=';
DIFERENT            : '!=';
NOT                 :'~';
AND                 :'&&';
OR                  :'||';
MUCH_BIGGER_THAN    : '>>';
AT                  :'@';
L_CURVE_BRACKET     :'{';
R_CURVE_BRACKET      :'}';
