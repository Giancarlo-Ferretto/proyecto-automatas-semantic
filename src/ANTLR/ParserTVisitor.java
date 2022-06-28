package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ParserTParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#linea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinea(ParserTParser.LineaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declararVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararVariable(ParserTParser.DeclararVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(ParserTParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#funcionLeerImprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionLeerImprimir(ParserTParser.FuncionLeerImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#imprimirVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimirVariable(ParserTParser.ImprimirVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#leerVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeerVariable(ParserTParser.LeerVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#funcionMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionMatematica(ParserTParser.FuncionMatematicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#funcionRaiz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionRaiz(ParserTParser.FuncionRaizContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#funcionSeno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionSeno(ParserTParser.FuncionSenoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#funcionCoseno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionCoseno(ParserTParser.FuncionCosenoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operadorMatematico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorMatematico(ParserTParser.OperadorMatematicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operadorAsignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorAsignar(ParserTParser.OperadorAsignarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operadorSuma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorSuma(ParserTParser.OperadorSumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operadorResta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorResta(ParserTParser.OperadorRestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operadorMultiplicacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorMultiplicacion(ParserTParser.OperadorMultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operadorDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorDivision(ParserTParser.OperadorDivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operadorBooleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorBooleano(ParserTParser.OperadorBooleanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operadorIgual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorIgual(ParserTParser.OperadorIgualContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operadorNoIgual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorNoIgual(ParserTParser.OperadorNoIgualContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#expresionCondicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionCondicional(ParserTParser.ExpresionCondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#bloqueCondicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueCondicional(ParserTParser.BloqueCondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#condicionalIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalIf(ParserTParser.CondicionalIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#condicionalElseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalElseIf(ParserTParser.CondicionalElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#condicionalElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalElse(ParserTParser.CondicionalElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#bloqueRepetitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueRepetitivo(ParserTParser.BloqueRepetitivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#cicloFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloFor(ParserTParser.CicloForContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#cicloWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloWhile(ParserTParser.CicloWhileContext ctx);
}