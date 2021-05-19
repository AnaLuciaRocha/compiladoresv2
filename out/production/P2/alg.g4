parser grammar alg;
options{tokenVocab=algLexer;}


start: declaration+ EOF;

//Declaracoes
declaration: variable_declation (SEMI_COLON | {notifyErrorListeners("Missing ';'");})
            | function_declaration;

variable_declation: simple_declaration #SimpleDeclaration
                    | initialization_declaration #InitializationDeclaration;

simple_declaration : type INDENT (COMMA INDENT)*; //int i,j


initialization_declaration: type INDENT EQUAL ( expression |  L_BRACKET expression R_BRACKET);


type :
      INT
    | BOOL
    | FLOAT
    | STRING
    | LESS_THAN  type  GREATER_THAN ;

// Expressions Left Recursion
expression:
            simple_expression
            | L_PAREN expression R_PAREN // Parentheses
            | expression L_BRACKET expression R_BRACKET //Indexecao do array
            | (PLUS | MINUS | NOT | QUESTION) expression //Unary Operator
            | expression (MULT | DIV | REMAIN) expression //Binary Operator Higher Priority
            | expression (PLUS | MINUS) expression //Binary Operator Lower Priority
            | expression (LESS_THAN | GREATER_THAN | LESS_EQUAL_THAN | GREATER_EQUAL_THAN | IS_EQUAL | DIFERENT) expression //Binary Operator Comparator
            | expression AND expression //Binary AND
            | expression OR expression //Binary OR
            ;
//Left recursion fixed
//expression: expression2 expression_aux;
//expression_aux: op1 expression2 expression_aux | ;
//expression2: expression3 expression_aux2;
//expression_aux2: op2 expression3 expression_aux2 | ;
//expression3: expression4 expression_aux3;
//expression_aux3: op3 expression4 expression_aux3 | ;
//expression4: expression5 expression_aux4;
//expression_aux4: op4 expression5 expression_aux4 | ;
//expression5: expression6 expression_aux5;
//expression_aux5: op5 expression6 expression_aux5 | ;
//
//expression6: expression7 expression_aux6;
//expression_aux6: L_BRACKET expression R_BRACKET expression_aux6 | ;
//
//expression7:
//             simple_expression
//            | L_PAREN expression R_PAREN
//            | (PLUS | MINUS | NOT | QUESTION) expression
//            ;
//
//
//op1: (LESS_THAN | GREATER_THAN | LESS_EQUAL_THAN | GREATER_EQUAL_THAN | IS_EQUAL | DIFERENT);
//op2: (PLUS | MINUS);
//op3: (MULT | DIV | REMAIN);
//op4: AND;
//op5: OR;


simple_expression : LITERAL_INT
                  | NULL
                  | INDENT
                  | DOUBLE
                  | LITERAL_STRING
                  | TRUE
                  | FALSE
                  | function_invocation;


// must declare here to use it later
index_pointer: expression L_BRACKET expression (R_BRACKET | {notifyErrorListeners("Missing ']'");});

expression_list: expression | (COMMA expression)* | ;


//2. Functions

function_invocation : INDENT L_PAREN expression_list R_PAREN | function_invocation_special;

function_invocation_special : AT  L_PAREN  R_PAREN
                            | SIZEOF  L_PAREN expression R_PAREN
                            | (WRITE | WRITELN) function_invocation ;

function_declaration: (function_type |  {notifyErrorListeners("A function must have a type");}) INDENT L_PAREN arg* R_PAREN body ;

function_type : VOID | type;


arg: simple_declaration (COMMA simple_declaration)*;

body: prologo? block epilogo?;
prologo : AT block ;
epilogo: block MUCH_BIGGER_THAN;
block : L_CURVE_BRACKET (variable_declation SEMI_COLON)*  instructions+ ( R_CURVE_BRACKET | {notifyErrorListeners("Missing '}'");});




//3. Instructions
//This is an example of left factorization getting fixed
// The coment code is the one who wasn't left factored
//instructions : expression SEMI_COLON
//             | instruction_control SEMI_COLON
//             | atribuition SEMI_COLON
//             | instruction_conditional
//             | cycle
//             | sub_block ;

instructions : (expression
             | instruction_control
             | atribuition )SEMI_COLON
             | instruction_conditional
             | cycle
             | sub_block ;


//3.2 Control instruction
instruction_control: LEAVE
                    | RESTART
                    | RETURN (expression | );

//3.3 atribuicao - atribuir valor a uma zona na memora lado_esq = expressao
atribuition : (INDENT | index_pointer) EQUAL expression  ;


//3.4 instrucao condicional if
instruction_conditional : IF expression THEN instructions (ELSE instructions)?  ;

//3.5 ciclo
cycle: WHILE expression DO instructions (FINALLY instructions|) ;

//3.6 subbloco organiza bloco de instrucoes, nao permite declaracao de variaveis
sub_block: L_CURVE_BRACKET instructions* R_CURVE_BRACKET;




