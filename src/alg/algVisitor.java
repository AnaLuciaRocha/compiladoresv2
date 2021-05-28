// Generated from C:/Users/x1/OneDrive - Universidade do Algarve/LEI/06_Semestre/P2/src\alg.g4 by ANTLR 4.9.1
package alg;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link alg}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface algVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link alg#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(alg.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(alg.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleDeclaration}
	 * labeled alternative in {@link alg#variable_declation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDeclaration(alg.SimpleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InitializationDeclaration}
	 * labeled alternative in {@link alg#variable_declation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializationDeclaration(alg.InitializationDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#simple_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_declaration(alg.Simple_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#initialization_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization_declaration(alg.Initialization_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(alg.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleExpr}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(alg.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusMinus}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(alg.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexArr}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexArr(alg.IndexArrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndComparator}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndComparator(alg.AndComparatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrComparator}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrComparator(alg.OrComparatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(alg.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(alg.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryComparator}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryComparator(alg.BinaryComparatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link alg#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(alg.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(alg.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(alg.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(alg.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(alg.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(alg.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code True}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(alg.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code False}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(alg.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionIn}
	 * labeled alternative in {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIn(alg.FunctionInContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#index_pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_pointer(alg.Index_pointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(alg.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#function_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_invocation(alg.Function_invocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StdReadFunction}
	 * labeled alternative in {@link alg#function_invocation_special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdReadFunction(alg.StdReadFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SizeOfFunction}
	 * labeled alternative in {@link alg#function_invocation_special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeOfFunction(alg.SizeOfFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteFunction}
	 * labeled alternative in {@link alg#function_invocation_special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteFunction(alg.WriteFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(alg.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#main_function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_function_declaration(alg.Main_function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#function_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_type(alg.Function_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(alg.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(alg.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#prologo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrologo(alg.PrologoContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#epilogo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpilogo(alg.EpilogoContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(alg.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#instructions_cycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions_cycle(alg.Instructions_cycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#instruction_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_control(alg.Instruction_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(alg.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#instruction_control_cycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_control_cycle(alg.Instruction_control_cycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#atribuition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuition(alg.AtribuitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#instruction_conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_conditional(alg.Instruction_conditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#cycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle(alg.CycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#sub_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_block(alg.Sub_blockContext ctx);
}