parser grammar alg;
options{tokenVocab=algLexer;}


start: declaration+ EOF;

//Declaracoes
declaration: variable_declation (SEMI_COLON | {notifyErrorListeners("Missing ';'");})
            | function_declaration;

variable_declation: simple_declaration #SimpleDeclaration| initialization_declaration #InitializationDeclaration;

simple_declaration : type INDENT (COMMA INDENT)*; //int i,j


initialization_declaration: type INDENT EQUAL ( expression |  L_BRACKET expression R_BRACKET);


type :
      INT
    | BOOL
    | FLOAT
    | STRING
    | NULL
    | LESS_THAN  type  GREATER_THAN ; //<type>

// Expressions Left Recursion
expression:
            simple_expression                             #SimpleExpr
            | L_PAREN expression R_PAREN                  #ParenExpr// Parentheses
            | expression L_BRACKET expression R_BRACKET   #IndexArr//Indexecao do array
            | (PLUS | MINUS | NOT | QUESTION) expression  #Unary//Unary Operator
            | expression (MULT | DIV | REMAIN) expression #MultDiv //Binary Operator Higher Priority
            | expression (PLUS | MINUS) expression        #PlusMinus//Binary Operator Lower Priority
            | expression (LESS_THAN | GREATER_THAN | LESS_EQUAL_THAN | GREATER_EQUAL_THAN | IS_EQUAL | DIFERENT) expression #BinaryComparator //Binary Operator Comparator
            | expression AND expression                   #AndComparator//Binary AND
            | expression OR expression                    #OrComparator//Binary OR
            ;


simple_expression : LITERAL_INT              #Int
                  | NULL                     #Null
                  | INDENT                   #Var
                  | LITERAL_FLOAT            #Float
                  | LITERAL_STRING           #String
                  | TRUE                     #True
                  | FALSE                    #False
                  | function_invocation      #FunctionIn;


// must declare here to use it later
index_pointer: expression L_BRACKET expression (R_BRACKET | {notifyErrorListeners("Missing ']'");});

expression_list: expression (COMMA expression)*
                | ;


//2. Functions

function_invocation : INDENT L_PAREN expression_list R_PAREN | function_invocation_special;

function_invocation_special : AT  L_PAREN  R_PAREN                      # StdReadFunction
                            | SIZEOF  L_PAREN expression R_PAREN        # SizeOfFunction
                            | (WRITE | WRITELN) '(' expression_list ')' # WriteFunction
                            ;

function_declaration: ((function_type |  {notifyErrorListeners("A function must have a type");}) INDENT L_PAREN arg* R_PAREN |
                        main_function_declaration ) body ;

main_function_declaration : INT ALG '(' INT INDENT ',' '<' STRING '>' INDENT ')'; //todo

function_type : VOID | type;

arg: simple_declaration (COMMA simple_declaration)*;

body: prologo? block epilogo?;
prologo : AT block ;
epilogo: block MUCH_BIGGER_THAN;
block : L_CURVE_BRACKET (variable_declation SEMI_COLON)*  (instructions+)? ( R_CURVE_BRACKET | {notifyErrorListeners("Missing '}'");});




//3. Instructions
//This is an example of left factorization getting fixed
// The coment code is the one who wasn't left factored
//instructions : expression SEMI_COLON
//             | instruction_control SEMI_COLON
//             | atribuition SEMI_COLON
//             | instruction_conditional
//             | cycle
//             | sub_block ;

instructions_cycle : (expression
             | instruction_control_cycle
             | atribuition )SEMI_COLON
             | instruction_conditional
             | cycle
             | sub_block ;


//3.2 Control instruction
instruction_control: RETURN (expression | );

instructions : (expression
             | instruction_control
             | atribuition )SEMI_COLON
             | instruction_conditional
             | cycle
             | sub_block ;


//3.2 Control instruction
instruction_control_cycle: LEAVE
                    | RESTART
                    | RETURN (expression | );

//3.3 atribuicao - atribuir valor a uma zona na memora lado_esq = expressao
atribuition : (INDENT | index_pointer) EQUAL expression  ;


//3.4 instrucao condicional if
instruction_conditional : IF expression THEN instructions (ELSE instructions)?  ;

//3.5 ciclo
cycle: WHILE expression DO instructions_cycle (FINALLY instructions_cycle|) ;

//3.6 subbloco organiza bloco de instrucoes, nao permite declaracao de variaveis
sub_block: L_CURVE_BRACKET instructions* R_CURVE_BRACKET;




