parser grammar alg;
options{tokenVocab=algLexer;}


//start: .+ EOF;
start: declaration+ EOF;

//Declaracoes
declaration: variable_declation SEMI_COLON
            | function_declaration;

variable_declation: (simple_declaration
                    | initialization_declaration);

simple_declaration : type INDENT (COMMA INDENT)*; //int i,j


initialization_declaration: type INDENT EQUAL ( expression |  L_BRACKET expression R_BRACKET);


type :
      INT
    | BOOL
    | FLOAT
    | STRING
    | LESS_THAN  type  GREATER_THAN ;

// Expressions must do
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

simple_expression : LITERAL_INT
                  | NULL
                  | INDENT
                  | DOUBLE
                  | LITERAL_STRING
                  | TRUE
                  | FALSE
                  | function_invocation;



index_pointer: expression L_BRACKET expression R_BRACKET ; //CHECK THISSSS

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




