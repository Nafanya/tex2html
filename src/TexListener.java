// Generated from /home/nafanya/study/parsers/tex2html/src/Tex.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TexParser}.
 */
public interface TexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TexParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(TexParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(TexParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(TexParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(TexParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexParser#cmdoptions}.
	 * @param ctx the parse tree
	 */
	void enterCmdoptions(TexParser.CmdoptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexParser#cmdoptions}.
	 * @param ctx the parse tree
	 */
	void exitCmdoptions(TexParser.CmdoptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexParser#cmdparams}.
	 * @param ctx the parse tree
	 */
	void enterCmdparams(TexParser.CmdparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexParser#cmdparams}.
	 * @param ctx the parse tree
	 */
	void exitCmdparams(TexParser.CmdparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexParser#units}.
	 * @param ctx the parse tree
	 */
	void enterUnits(TexParser.UnitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexParser#units}.
	 * @param ctx the parse tree
	 */
	void exitUnits(TexParser.UnitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(TexParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(TexParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(TexParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(TexParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexParser#words}.
	 * @param ctx the parse tree
	 */
	void enterWords(TexParser.WordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexParser#words}.
	 * @param ctx the parse tree
	 */
	void exitWords(TexParser.WordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexParser#mathexpr}.
	 * @param ctx the parse tree
	 */
	void enterMathexpr(TexParser.MathexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexParser#mathexpr}.
	 * @param ctx the parse tree
	 */
	void exitMathexpr(TexParser.MathexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(TexParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(TexParser.MathContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(TexParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(TexParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexParser#min}.
	 * @param ctx the parse tree
	 */
	void enterMin(TexParser.MinContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexParser#min}.
	 * @param ctx the parse tree
	 */
	void exitMin(TexParser.MinContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexParser#lim}.
	 * @param ctx the parse tree
	 */
	void enterLim(TexParser.LimContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexParser#lim}.
	 * @param ctx the parse tree
	 */
	void exitLim(TexParser.LimContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexParser#frac}.
	 * @param ctx the parse tree
	 */
	void enterFrac(TexParser.FracContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexParser#frac}.
	 * @param ctx the parse tree
	 */
	void exitFrac(TexParser.FracContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(TexParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(TexParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexParser#integral}.
	 * @param ctx the parse tree
	 */
	void enterIntegral(TexParser.IntegralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexParser#integral}.
	 * @param ctx the parse tree
	 */
	void exitIntegral(TexParser.IntegralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterSymbols(TexParser.SymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitSymbols(TexParser.SymbolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRel(TexParser.RelContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRel(TexParser.RelContext ctx);
}