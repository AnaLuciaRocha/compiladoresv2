# Compiladores 
> Ana Rocha </p>
> Jean Morelli </p>

## Requirements
- Java 13
- ANTLR 
- Follow instructions in the [document](https://docs.google.com/document/d/1gQ2lsidvN2cDUUsHEkT05L-wGbX5mROB7d70Aaj3R64/edit?usp=sharing)

### Lexer (Lexical Analysis)
First part

### Grammar and Error (Sintax Analysis)
Second part of the work 
- Errors
1. There's an error when ";" is missing
2. There's an error when "}" is missing in the function block
3. There's an error when a function type is not indicated 
4. There's an error when a "]" is missing in the array pointer expression

- Left recursion
We commented two ways of remove left recursion in our grammar in the expressions part

- Left factored
We have everything left factored

### Semantic Analysis
Capturing semantic errors and showing in console using **Listener paradigm**

### Code generating
Now we used **Visitor paradigm**

### NOTES
There were some improvements made on the last work, that involved fix some bugs that we had in previous versions, such:
1. "Declaracao com inicializacao"
- We forgot one detail in the grammar part, regarding the body of a function. Now our parse tree is working with more than one instruction
- We also forgot to check types in semantic analysis, now it's fixed.


