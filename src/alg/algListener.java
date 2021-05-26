// Generated from /home/jay/IdeaProjects/compiladoresv2/src/alg.g4 by ANTLR 4.9.1
package alg;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link alg}.
 */
public interface algListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link alg#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(alg.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(alg.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(alg.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(alg.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleDeclaration}
	 * labeled alternative in {@link alg#variable_declation}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDeclaration(alg.SimpleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleDeclaration}
	 * labeled alternative in {@link alg#variable_declation}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDeclaration(alg.SimpleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InitializationDeclaration}
	 * labeled alternative in {@link alg#variable_declation}.
	 * @param ctx the parse tree
	 */
	void enterInitializationDeclaration(alg.InitializationDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InitializationDeclaration}
	 * labeled alternative in {@link alg#variable_declation}.
	 * @param ctx the parse tree
	 */
	void exitInitializationDeclaration(alg.InitializationDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#simple_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSimple_declaration(alg.Simple_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#simple_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSimple_declaration(alg.Simple_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#initialization_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInitialization_declaration(alg.Initialization_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#initialization_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInitialization_declaration(alg.Initialization_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#type}.
	 * @param ctx the parse tree
	 */
	void enterType(alg.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#type}.
	 * @param ctx the parse tree
	 */
	void exitType(alg.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleExpr}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(alg.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleExpr}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(alg.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusMinus}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(alg.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusMinus}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(alg.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexArr}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexArr(alg.IndexArrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexArr}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexArr(alg.IndexArrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndComparator}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndComparator(alg.AndComparatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndComparator}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndComparator(alg.AndComparatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrComparator}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrComparator(alg.OrComparatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrComparator}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrComparator(alg.OrComparatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(alg.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(alg.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary(alg.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary(alg.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryComparator}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComparator(alg.BinaryComparatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryComparator}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComparator(alg.BinaryComparatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(alg.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(alg.MultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(alg.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(alg.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Null}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterNull(alg.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitNull(alg.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterVar(alg.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitVar(alg.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterDouble(alg.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitDouble(alg.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterString(alg.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitString(alg.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code True}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterTrue(alg.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code True}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitTrue(alg.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code False}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterFalse(alg.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code False}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitFalse(alg.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionIn}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIn(alg.FunctionInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionIn}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIn(alg.FunctionInContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#index_pointer}.
	 * @param ctx the parse tree
	 */
	void enterIndex_pointer(alg.Index_pointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#index_pointer}.
	 * @param ctx the parse tree
	 */
	void exitIndex_pointer(alg.Index_pointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(alg.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(alg.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#function_invocation}.
	 * @param ctx the parse tree
	 */
	void enterFunction_invocation(alg.Function_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#function_invocation}.
	 * @param ctx the parse tree
	 */
	void exitFunction_invocation(alg.Function_invocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StdReadFunction}
	 * labeled alternative in {@link alg#function_invocation_special}.
	 * @param ctx the parse tree
	 */
	void enterStdReadFunction(alg.StdReadFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StdReadFunction}
	 * labeled alternative in {@link alg#function_invocation_special}.
	 * @param ctx the parse tree
	 */
	void exitStdReadFunction(alg.StdReadFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SizeOfFunction}
	 * labeled alternative in {@link alg#function_invocation_special}.
	 * @param ctx the parse tree
	 */
	void enterSizeOfFunction(alg.SizeOfFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SizeOfFunction}
	 * labeled alternative in {@link alg#function_invocation_special}.
	 * @param ctx the parse tree
	 */
	void exitSizeOfFunction(alg.SizeOfFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteFunction}
	 * labeled alternative in {@link alg#function_invocation_special}.
	 * @param ctx the parse tree
	 */
	void enterWriteFunction(alg.WriteFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteFunction}
	 * labeled alternative in {@link alg#function_invocation_special}.
	 * @param ctx the parse tree
	 */
	void exitWriteFunction(alg.WriteFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(alg.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(alg.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#main_function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMain_function_declaration(alg.Main_function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#main_function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMain_function_declaration(alg.Main_function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#function_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type(alg.Function_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#function_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type(alg.Function_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(alg.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(alg.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(alg.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(alg.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#prologo}.
	 * @param ctx the parse tree
	 */
	void enterPrologo(alg.PrologoContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#prologo}.
	 * @param ctx the parse tree
	 */
	void exitPrologo(alg.PrologoContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#epilogo}.
	 * @param ctx the parse tree
	 */
	void enterEpilogo(alg.EpilogoContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#epilogo}.
	 * @param ctx the parse tree
	 */
	void exitEpilogo(alg.EpilogoContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(alg.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(alg.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(alg.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(alg.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#instruction_control}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_control(alg.Instruction_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#instruction_control}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_control(alg.Instruction_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#atribuition}.
	 * @param ctx the parse tree
	 */
	void enterAtribuition(alg.AtribuitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#atribuition}.
	 * @param ctx the parse tree
	 */
	void exitAtribuition(alg.AtribuitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#instruction_conditional}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_conditional(alg.Instruction_conditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#instruction_conditional}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_conditional(alg.Instruction_conditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#cycle}.
	 * @param ctx the parse tree
	 */
	void enterCycle(alg.CycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#cycle}.
	 * @param ctx the parse tree
	 */
	void exitCycle(alg.CycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#sub_block}.
	 * @param ctx the parse tree
	 */
	void enterSub_block(alg.Sub_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#sub_block}.
	 * @param ctx the parse tree
	 */
	void exitSub_block(alg.Sub_blockContext ctx);
}