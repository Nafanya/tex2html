package com.company;

import com.company.grammar.TexBaseListener;
import com.company.grammar.TexParser;
import org.antlr.v4.runtime.RuleContext;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by nafanya on 5/4/16.
 */
public class Html extends TexBaseListener {

    private StringBuilder buffer;
    private String title;
    private String author;
    private String date;

    private boolean inSection;
    private boolean inSubsection;
    private boolean inCode;

    private int depth;

    public Html() {
        buffer = new StringBuilder();
        inSection = inSubsection = inCode = false;
        depth = 1;
    }

    private void append(String s) {
        buffer.append(Stream.generate(() -> "  ").limit(depth).collect(Collectors.joining()));
        buffer.append(s);
    }

    @Override
    public void enterCommand(TexParser.CommandContext ctx) {
        super.enterCommand(ctx);

        final String command = ctx.WORD().getText();
        switch (command) {
            case "title":
                title = getCommandText(ctx, " "); break;
            case "author":
                author = getCommandText(ctx, " "); break;
            case "date":
                date = getCommandText(ctx, " "); break;
            case "begin":
                startBlock(ctx); break;
            case "end":
                endBlock(ctx); break;
            case "section":
                startSection(getCommandText(ctx, " ")); break;
            case "subsection":
                startSubsection(getCommandText(ctx, " ")); break;
            default:
                break;
        }
    }

    private String getCommandText(TexParser.CommandContext ctx, String separator) {
        return ctx.cmdparams().text().words().stream().map(RuleContext::getText).collect(Collectors.joining(separator));
    }

    @Override
    public void exitCommand(TexParser.CommandContext ctx) {
        super.exitCommand(ctx);

        final String command = ctx.WORD().getText();
        switch (command) {
            default:
                break;
        }
    }

    @Override
    public void enterUnits(TexParser.UnitsContext ctx) {
        super.enterUnits(ctx);

        if (!inCode) {
            append("<p>\n");
        }
        depth++;
        append("");
    }

    @Override
    public void exitUnits(TexParser.UnitsContext ctx) {
        super.exitUnits(ctx);

        depth--;
        if (!inCode) {
            buffer.append("\n");
            append("</p>\n");
        }
    }

    @Override
    public void enterUnit(TexParser.UnitContext ctx) {
        super.enterUnit(ctx);

        if (ctx.text() != null) {
            buffer.append(ctx.text().words().stream().map(RuleContext::getText).collect(Collectors.joining(" "))).append(" ");
        }
    }

    @Override
    public void enterMathexpr(TexParser.MathexprContext ctx) {
        super.enterMathexpr(ctx);

        buffer.append(escape(ctx.getText())).append(" ");
    }

    private String escape(String token) {
        return token
                .replace("\\le", "&le;")
                .replace("\\ge", "&ge;")
                .replace("\\ne", "&ne;")
                .replace("\\min", "\\min ")
                .replace("<", "&lt;")
                .replace(">", "&gt;");
    }

    private void startBlock(TexParser.CommandContext ctx) {
        depth++;
        final String blockName = ctx.cmdparams().text().getText();
        switch (blockName) {
            case "document":
                append(HtmlConst.getDocumentStart(title, title, author)); break;
            case "verbatim":
                inCode = true;
                append("<pre><code>\n"); break;
            default:
                break;
        }
    }

    private void endBlock(TexParser.CommandContext ctx) {
        final String blockName = ctx.cmdparams().text().getText();
        switch (blockName) {
            case "document":
                append(HtmlConst.getDocumentEnd()); break;
            case "verbatim":
                inCode = false;
                append("</code></pre>\n"); break;
            default:
                break;
        }
        depth--;
    }

    @Override
    public String toString() {
        return buffer.toString();
    }

    private void startSection(String title) {
        if (inSubsection) {
            depth--;
            append("</div>\n");
            inSubsection = false;
        }
        if (inSection) {
            depth--;
            append("</div>\n");
        }
        inSection = true;
        append("<div class=\"docs-section\">\n");
        depth++;
        append(String.format("<h6 class=\"docs-header\">%s</h6>\n", title));
    }

    private void startSubsection(String title) {
        if (inSubsection) {
            depth--;
            append("</div>\n");
        }
        inSubsection = true;
        append("<div class=\"docs-subsection\">\n");
        depth++;
        append(String.format("<h6 class=\"docs-subheader\">%s</h6>\n", title));
    }
}
