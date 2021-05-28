package com.company;

import alg.TypeChecker;
import alg.FunctionDeclarationChecker;
import alg.alg;
import alg.algLexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            algLexer simpleLexer = new algLexer(CharStreams.fromFileName("ex.sim"));
            alg simpleParser = new alg(new CommonTokenStream(simpleLexer));
            ParseTree tree = simpleParser.start();
            System.out.println("syntatic parsing finished");


            // create a standard ANTLR parse tree walker
            ParseTreeWalker walker = new ParseTreeWalker();
            // create listener then feed to walker
            System.out.println("Type checking...");
            FunctionDeclarationChecker functionListener = new FunctionDeclarationChecker();
            walker.walk(functionListener, tree);

            TypeChecker listener = new TypeChecker(functionListener.functionList);


            walker.walk(listener, tree);

            //TODO: exercício 2. O exercício 2 é feito fácilmente com 2 listeners. Temos de partir o TypeChecker em 2.
            // O primeiro faz a declaração de todas as variáveis e funções. Fazemos também a resolução de todas
            // as variáveis (pois na linguagem queremos que as variáveis apenas tenham acesso a declarações anteriores).
            // O segundo listener (vai ter que ser definido noutra outra classe), vai fazer a resolução de todas as funções,
            // e vai fazer a verificação de tipos para as expressões (só é possível fazer a verificação de tipos depois
            // das funções estarem resolvidas).
            // Para isto funcionar, o segundo listener precisa de ter acesso à informação produzida pelo 1.º listener, como
            // por exemplo as tabelas de símbolos. Isto quer dizer que a tabela de símbolos (scopes) deixa de poder ser uma
            // variável local do listener, e tem que passar a ser um atributo/propriedade da árvore.

            if (listener.semanticErrors > 0) {
                System.out.println(listener.semanticErrors + " semantic errors found. Compilation process halted.");
                System.exit(1);
            }

            System.out.println("No semantic errors found");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
