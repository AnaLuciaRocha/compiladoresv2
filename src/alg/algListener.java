// Generated from C:/Users/x1/OneDrive - Universidade do Algarve/LEI/06_Semestre/P2/src\alg.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by {@link alg#variable_declation}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declation(alg.Variable_declationContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#variable_declation}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declation(alg.Variable_declationContext ctx);
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
	 * Enter a parse tree produced by {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(alg.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(alg.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(alg.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(alg.Simple_expressionContext ctx);
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