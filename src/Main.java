import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args == null || args.length != 2 || args[0] == null || args[1] == null) {
            System.err.println("Usage: Main INPUT OUTPUT");
            System.exit(1);
        }

        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(args[0]), StandardCharsets.UTF_8));
        ANTLRInputStream inputStream = new ANTLRInputStream(in);
        TexLexer lexer = new TexLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        TexParser parser = new TexParser(tokenStream);
        ParseTree tree = parser.document();
        ParseTreeWalker walker = new ParseTreeWalker();
        Html html = new Html();
        walker.walk(html, tree);

        PrintWriter writer = new PrintWriter(args[1], "UTF-8");
        writer.print(html);
        writer.close();
    }
}
