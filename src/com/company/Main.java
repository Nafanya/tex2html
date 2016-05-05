package com.company;

import com.company.grammar.TexLexer;
import com.company.grammar.TexParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args == null || args.length != 1 || args[0] == null) {
            System.err.println("Usage: Main FILE");
            System.exit(1);
        }
        FileInputStream in = new FileInputStream(args[0]);
        ANTLRInputStream inputStream = new ANTLRInputStream(in);
        TexLexer lexer = new TexLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        TexParser parser = new TexParser(tokenStream);
        ParseTree tree = parser.document();
        ParseTreeWalker walker = new ParseTreeWalker();
        Html html = new Html();
        walker.walk(html, tree);

        PrintWriter writer = new PrintWriter("output/out.html", "UTF-8");
        writer.print(html);
        writer.close();
    }
}
