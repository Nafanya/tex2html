package com.company;

import com.company.grammar.TexLexer;
import com.company.grammar.TexParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    private static final String report =
            "\\documentclass[11pt,oneside,a4paper]{article}\n" +
                    "\n" +
                    "\\usepackage{mathtext}\n" +
                    "\\usepackage[T1,T2A]{fontenc}\n" +
                    "\\usepackage[utf8]{inputenc}\n" +
                    "\\usepackage[english,russian]{babel}\n" +
                    "\n" +
                    "\\title{Лабораторная работа 3. Использование автоматичиских генераторов и анализаторов ANTLR и Bison}\n" +
                    "\\author{Никита Ященко, М3338}\n" +
                    "\\date{4 Мая 2016}\n" +
                    "\n" +
                    "\\begin{document}\n" +
                    "\n" +
                    "\\maketitle\n" +
                    "\n" +
                    "\\section{Задание}\n" +
                    "\\subsection{Вариант 8.}\n" +
                    " \n" +
                    "Выберите подмножетсво TeX и напишите его конвертор в HTML.\n" +
                    "При необходимости используйте MathML.\n" +
                    "\n" +
                    "\\subsection{Пример}\n" +
                    "\n" +
                    "\\begin{verbatim}\n" +
                    "$a_i = b_i + x^2$\n" +
                    "\\end{verbatim}\n" +
                    "\n" +
                    "Или этот документ\n" +
                    "\n" +
                    "\\section{Ход работы}\n" +
                    " \n" +
                    "Ход работы\n" +
                    " \n" +
                    "\\section{Примеры}\n" +
                    "\n" +
                    "\\subsection{Числа и переменные}\n" +
                    "\n" +
                    "$a$, $2$, $\\pi$\n" +
                    "\n" +
                    "\\subsection{Операции}\n" +
                    "\n" +
                    "$2 + 2 * 2$, $1 + 2 * 3 / 4$, $a + b * c$\n" +
                    " \n" +
                    "\\subsection{Отношения}\n" +
                    "\n" +
                    "$a < b \\le c$\n" +
                    "\n" +
                    "$d = e \\ne f$\n" +
                    "\n" +
                    "$g > h \\ge i$\n" +
                    "\n" +
                    "\\subsection{Математика}\n" +
                    "\n" +
                    "Add $a$ squared and $b$ squared to get $c$ squared.\n" +
                    "Or, using a more mathematical approach: $a^2 + b^{2} = c^2$.\n" +
                    "\n" +
                    "100 $m^{3}$ of water.\n" +
                    "\n" +
                    "$\\lim_{x \\to 6}{6}$\n" +
                    "\n" +
                    "$\\lim_{n \\to \\infty}{1/n} = \\frac{\\pi^2}{6} * 0$\n" +
                    "\n" +
                    "$\\sum_{k=1}^{5}{k} = \\frac{60}{2}/2$\n" +
                    "\n" +
                    "$\\lim_{x \\to \\infty}{x} = \\infty$\n" +
                    " \n" +
                    "\\end{document}\n";

    public static void main(String[] args) throws IOException {
        ANTLRInputStream inputStream = new ANTLRInputStream(report);
        TexLexer lexer = new TexLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        TexParser parser = new TexParser(tokenStream);
        ParseTree tree = parser.document();
        ParseTreeWalker walker = new ParseTreeWalker();
        Html html = new Html();
        walker.walk(html, tree);
//        System.out.println(html);

        PrintWriter writer = new PrintWriter("output/out.html", "UTF-8");
        writer.print(html);
        writer.close();
    }
}
