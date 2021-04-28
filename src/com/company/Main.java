package com.company;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import alg.alg;
import alg.algLexer;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        try {
            algLexer lexer = new algLexer(CharStreams.fromFileName("exemplo.txt"));
            alg parser = new alg(new CommonTokenStream(lexer));
            parser.start();
            System.out.println("alg parser has finished parsing");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
