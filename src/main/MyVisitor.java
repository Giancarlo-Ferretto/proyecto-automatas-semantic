package main;

import java.util.HashMap;
import java.util.Map;

import ANTLR.ParserTBaseVisitor;
import ANTLR.ParserTParser.DeclararVariableContext;
import ANTLR.ParserTParser.ImprimirVariableContext;
import ANTLR.ParserTParser.FuncionRaizContext;
import ANTLR.ParserTParser.FuncionSenoContext;
import ANTLR.ParserTParser.FuncionCosenoContext;
import ANTLR.ParserTParser.CondicionalIfContext;
import ANTLR.ParserTParser.CondicionalElseContext;
import ANTLR.ParserTParser.CondicionalElseIfContext;
import ANTLR.ParserTParser.ExpresionCondicionalContext;
import ANTLR.ParserTParser.OperadorBooleanoContext;
import ANTLR.ParserTParser.OperadorIgualContext;
import ANTLR.ParserTParser.OperadorNoIgualContext;
import ANTLR.ParserTParser.OperadorAsignarContext;
import ANTLR.ParserTParser.OperadorSumaContext;
import ANTLR.ParserTParser.OperadorRestaContext;
import ANTLR.ParserTParser.OperadorMultiplicacionContext;
import ANTLR.ParserTParser.OperadorDivisionContext;
import ANTLR.ParserTParser.CicloForContext;
import ANTLR.ParserTParser.CicloWhileContext;

public class MyVisitor extends ParserTBaseVisitor<Integer> {
	private Map<String, String> variables = new HashMap<String, String>();

	private static boolean isNumeric(String str) {
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }
	
	@Override 
	public Integer visitDeclararVariable(DeclararVariableContext ctx) { 
		String variable = ctx.NOMBRE_VARIABLE().getText();
		String valor = "";
		
		if(variables.containsKey(variable)) {
			throw new IllegalArgumentException("La variable " + variable + " ya fue declarada.");
		}
		else {
			if(ctx.TIPO_DATO().getText().equals("EMPERATRIZ")) {
				valor = ctx.VALOR_DATO().getText().replaceAll("'", "");
			}
			else {
				valor = ctx.VALOR_DATO().getText();
			}
			variables.put(variable, valor);
		}
		return 0;
	}
	
	@Override 
	public Integer visitImprimirVariable(ImprimirVariableContext ctx) {
		String argumento = ctx.expresion().getText();
		String imprimir = "";
		
		if(variables.containsKey(argumento)) {
			imprimir = variables.get(argumento);
		}
		else if(ctx.expresion().VALOR_DATO() != null) {
			imprimir = argumento;
		}
		else {
			throw new IllegalArgumentException("El argumento " + argumento + " no existe.");
		}
		System.out.println(imprimir);
		return 0;
	}
	
	@Override 
	public Integer visitFuncionRaiz(FuncionRaizContext ctx) {
		String argumento = ctx.expresion().getText();
		double numero = 0;
		
		if(variables.containsKey(argumento)) {
			argumento = variables.get(argumento).toString();
			if(isNumeric(argumento)) {
				numero = Float.parseFloat(argumento);
			}
		}
		else if(ctx.expresion().VALOR_DATO() == null) {
			throw new IllegalArgumentException("El argumento " + argumento + " no existe.");
		}
		
		if(isNumeric(argumento)) {
			numero = Float.parseFloat(argumento);
		}
		else {
			throw new IllegalArgumentException("El argumento " + argumento + " no es un real.");
		}
		
		double resultado = Math.sqrt(numero);
		System.out.println("[DEBUG] " + ctx.FUNCION_RAIZ().toString() + "(" + argumento + ") = " + resultado);
		return (int)resultado;
	}
	
	@Override 
	public Integer visitFuncionSeno(FuncionSenoContext ctx) {
		String argumento = ctx.expresion().getText();
		double numero = 0;
		
		if(variables.containsKey(argumento)) {
			argumento = variables.get(argumento).toString();
			if(isNumeric(argumento)) {
				numero = Float.parseFloat(argumento);
			}
		}
		else if(ctx.expresion().VALOR_DATO() == null) {
			throw new IllegalArgumentException("El argumento " + argumento + " no existe.");
		}
		
		if(isNumeric(argumento)) {
			numero = Float.parseFloat(argumento);
		}
		else {
			throw new IllegalArgumentException("El argumento " + argumento + " no es un real.");
		}
		
		double resultado = Math.sin(numero);
		System.out.println("[DEBUG] " + ctx.FUNCION_SENO().toString() + "(" + argumento + ") = " + resultado);
		return (int)resultado;
	}
	
	@Override 
	public Integer visitFuncionCoseno(FuncionCosenoContext ctx) {
		String argumento = ctx.expresion().getText();
		double numero = 0;
		
		if(variables.containsKey(argumento)) {
			argumento = variables.get(argumento).toString();
			if(isNumeric(argumento)) {
				numero = Float.parseFloat(argumento);
			}
		}
		else if(ctx.expresion().VALOR_DATO() == null) {
			throw new IllegalArgumentException("El argumento " + argumento + " no existe.");
		}
		
		if(isNumeric(argumento)) {
			numero = Float.parseFloat(argumento);
		}
		else {
			throw new IllegalArgumentException("El argumento " + argumento + " no es un real.");
		}
		
		double resultado = Math.cos(numero);
		System.out.println("[DEBUG] " + ctx.FUNCION_COSENO().toString() + "(" + argumento + ") = " + resultado);
		return (int)resultado;
	}
	
	@Override 
	public Integer visitCondicionalIf(CondicionalIfContext ctx) {
		Integer salida = visitExpresionCondicional(ctx.expresionCondicional());	
	
		if(salida == 1) {
			return visitPrograma(ctx.programa());
		}
		return 0;
	}
	
	@Override 
	public Integer visitCondicionalElseIf(CondicionalElseIfContext ctx) {
		Integer salida = visitExpresionCondicional(ctx.condicionalIf().expresionCondicional());
		
		if(salida == 1) {
			return visitPrograma(ctx.condicionalIf().programa());
		}
		else {
			salida = visitExpresionCondicional(ctx.expresionCondicional());
			
			if(salida == 1) {
				return visitPrograma(ctx.programa());
			}
		}
		return 0;
	}
	
	@Override 
	public Integer visitCondicionalElse(CondicionalElseContext ctx) {
		Integer salida = visitExpresionCondicional(ctx.condicionalIf().expresionCondicional());
		
		if(salida == 1) {
			return visitPrograma(ctx.condicionalIf().programa());
		}
		return visitPrograma(ctx.programa());
	}
		
	@Override 
	public Integer visitExpresionCondicional(ExpresionCondicionalContext ctx) {
		return visitOperadorBooleano(ctx.operadorBooleano());
	}
	
	@Override
	public Integer visitOperadorBooleano(OperadorBooleanoContext ctx) {
		Integer salida = 0;
		
		if(ctx.operadorIgual() != null) {
			salida = visitOperadorIgual(ctx.operadorIgual());
		}
		else if(ctx.operadorNoIgual() != null) {
			salida = visitOperadorNoIgual(ctx.operadorNoIgual());
		}
		else {
			throw new IllegalArgumentException("El operador booleano del condicional no esta definido.");
		}
		return salida;
	}
	
	@Override
	public Integer visitOperadorIgual(OperadorIgualContext ctx) {
		String izquierda = ctx.expresion(0).getText();
		String derecha = ctx.expresion(1).getText();

		if(variables.containsKey(izquierda)) {
			izquierda = variables.get(izquierda);
		}
		
		if(variables.containsKey(derecha)) {
			derecha = variables.get(derecha);
		}

		return (izquierda.equals(derecha)? 1 : 0);
	}
	
	@Override
	public Integer visitOperadorNoIgual(OperadorNoIgualContext ctx) {
		String izquierda = ctx.expresion(0).getText();
		String derecha = ctx.expresion(1).getText();

		if(variables.containsKey(izquierda)) {
			izquierda = variables.get(izquierda);
		}
		
		if(variables.containsKey(derecha)) {
			derecha = variables.get(derecha);
		}

		return (izquierda.equals(derecha)? 0 : 1);
	}
	
	@Override
	public Integer visitOperadorAsignar(OperadorAsignarContext ctx) {
		String variable = ctx.NOMBRE_VARIABLE().getText();
		String argumento = ctx.VALOR_DATO().getText();

		if(variables.containsKey(variable)) {
			variables.put(variable, argumento);
		}
		else {
			throw new IllegalArgumentException("La variable " + variable + " no esta definida.");
		}
		return 0;
	}
	
	@Override
	public Integer visitOperadorSuma(OperadorSumaContext ctx) {
		String variable = ctx.NOMBRE_VARIABLE().getText();
		String argumento = ctx.VALOR_DATO().getText();
		int resultado = 0;
		
		if(!isNumeric(argumento)) {
			throw new IllegalArgumentException("El argumento " + argumento + "no es un numero real.");
		}
		
		if(variables.containsKey(variable)) {
			Double numero = Double.parseDouble(variables.get(variable));
			Double argumentoNumerico = Double.parseDouble(argumento);
			resultado = (int)(numero + argumentoNumerico);
			variables.put(variable, String.valueOf(resultado));
		}
		else {
			throw new IllegalArgumentException("La variable " + variable + " no esta definida.");
		}
		return 0;
	}
	
	@Override
	public Integer visitOperadorResta(OperadorRestaContext ctx) {
		String variable = ctx.NOMBRE_VARIABLE().getText();
		String argumento = ctx.VALOR_DATO().getText();
		int resultado = 0;
		
		if(!isNumeric(argumento)) {
			throw new IllegalArgumentException("El argumento " + argumento + "no es un numero real.");
		}
		
		if(variables.containsKey(variable)) {
			Double numero = Double.parseDouble(variables.get(variable));
			Double argumentoNumerico = Double.parseDouble(argumento);
			resultado = (int)(numero - argumentoNumerico);
			variables.put(variable, String.valueOf(resultado));
		}
		else {
			throw new IllegalArgumentException("La variable " + variable + " no esta definida.");
		}
		return 0;
	}
	
	@Override
	public Integer visitOperadorMultiplicacion(OperadorMultiplicacionContext ctx) {
		String variable = ctx.NOMBRE_VARIABLE().getText();
		String argumento = ctx.VALOR_DATO().getText();
		int resultado = 0;
		
		if(!isNumeric(argumento)) {
			throw new IllegalArgumentException("El argumento " + argumento + "no es un numero real.");
		}
		
		if(variables.containsKey(variable)) {
			Double numero = Double.parseDouble(variables.get(variable));
			Double argumentoNumerico = Double.parseDouble(argumento);
			resultado = (int)(numero * argumentoNumerico);
			variables.put(variable, String.valueOf(resultado));
		}
		else {
			throw new IllegalArgumentException("La variable " + variable + " no esta definida.");
		}
		return 0;
	}
	
	@Override
	public Integer visitOperadorDivision(OperadorDivisionContext ctx) {
		String variable = ctx.NOMBRE_VARIABLE().getText();
		String argumento = ctx.VALOR_DATO().getText();
		int resultado = 0;
		
		if(!isNumeric(argumento)) {
			throw new IllegalArgumentException("El argumento " + argumento + "no es un numero real.");
		}
		
		if(variables.containsKey(variable)) {
			Double numero = Double.parseDouble(variables.get(variable));
			Double argumentoNumerico = Double.parseDouble(argumento);
			resultado = (int)(numero * argumentoNumerico);
			variables.put(variable, String.valueOf(resultado));
		}
		else {
			throw new IllegalArgumentException("La variable " + variable + " no esta definida.");
		}
		return 0;
	}
	
	@Override
	public Integer visitCicloFor(CicloForContext ctx) {		
		int indice = 0;
		variables.put(ctx.NOMBRE_VARIABLE().getText(), String.valueOf(indice));
		
		while(visitOperadorBooleano(ctx.operadorBooleano()) == 1) {
			visitOperadorMatematico(ctx.operadorMatematico());
			visitPrograma(ctx.programa());
		}		
		/*for(indice = 0; (visitOperadorBooleano(ctx.operadorBooleano()) == 1); indice++) {
			visitPrograma(ctx.programa());	
			variables.put(ctx.NOMBRE_VARIABLE().getText(), String.valueOf(indice));
		}*/
		return 0;
	}
	
	@Override
	public Integer visitCicloWhile(CicloWhileContext ctx) {
		Integer salida = visitOperadorBooleano(ctx.operadorBooleano());	
		Integer salidaPrograma = 0;
		
		while (salida == 1 && salidaPrograma == 0) {
			salida = visitOperadorBooleano(ctx.operadorBooleano());	
			salidaPrograma = visitPrograma(ctx.programa());
		}
		return 0;
	}
}