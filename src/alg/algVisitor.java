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
	 * Visit a parse tree produced by {@link alg#variable_declation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declation(alg.Variable_declationContext ctx);
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
	 * Visit a parse tree produced by {@link alg#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(alg.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(alg.Simple_expressionContext ctx);
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
	 * Visit a parse tree produced by {@link alg#function_invocation_special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_invocation_special(alg.Function_invocation_specialContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(alg.Function_declarationContext ctx);
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
	 * Visit a parse tree produced by {@link alg#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(alg.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#instruction_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_control(alg.Instruction_controlContext ctx);
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