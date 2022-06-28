package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, FUNCION_RAIZ=2, FUNCION_SENO=3, FUNCION_COSENO=4, FUNCION_PRINT=5, 
		FUNCION_READ=6, ESPACIO=7, IGUAL=8, PARENTESIS_ABIERTO=9, PARENTESIS_CERRADO=10, 
		LLAVE_ABIERTA=11, LLAVE_CERRADA=12, PUNTO_COMA=13, COMILLA=14, TIPO_VARIABLE=15, 
		TIPO_VARIABLE_VAR=16, TIPO_VARIABLE_CONST=17, TIPO_DATO=18, TIPO_DATO_INT=19, 
		TIPO_DATO_REAL=20, TIPO_DATO_STRING=21, CONDICIONAL_IF=22, CONDICIONAL_ELSE_IF=23, 
		CONDICIONAL_ELSE=24, CICLO_FOR=25, CICLO_WHILE=26, OPERADOR_IGUAL=27, 
		OPERADOR_NO_IGUAL=28, OPERADOR_SUMA=29, OPERADOR_RESTA=30, OPERADOR_MULT=31, 
		OPERADOR_DIV=32, NOMBRE_VARIABLE=33, VALOR_DATO=34, VALOR_DATO_ENTERO=35, 
		VALOR_DATO_REAL=36, VALOR_DATO_TEXTO=37, VALOR_DATO_STRING=38;
	public static final int
		RULE_programa = 0, RULE_linea = 1, RULE_declararVariable = 2, RULE_expresion = 3, 
		RULE_funcionLeerImprimir = 4, RULE_imprimirVariable = 5, RULE_leerVariable = 6, 
		RULE_funcionMatematica = 7, RULE_funcionRaiz = 8, RULE_funcionSeno = 9, 
		RULE_funcionCoseno = 10, RULE_operadorMatematico = 11, RULE_operadorAsignar = 12, 
		RULE_operadorSuma = 13, RULE_operadorResta = 14, RULE_operadorMultiplicacion = 15, 
		RULE_operadorDivision = 16, RULE_operadorBooleano = 17, RULE_operadorIgual = 18, 
		RULE_operadorNoIgual = 19, RULE_expresionCondicional = 20, RULE_bloqueCondicional = 21, 
		RULE_condicionalIf = 22, RULE_condicionalElseIf = 23, RULE_condicionalElse = 24, 
		RULE_bloqueRepetitivo = 25, RULE_cicloFor = 26, RULE_cicloWhile = 27;
	public static final String[] ruleNames = {
		"programa", "linea", "declararVariable", "expresion", "funcionLeerImprimir", 
		"imprimirVariable", "leerVariable", "funcionMatematica", "funcionRaiz", 
		"funcionSeno", "funcionCoseno", "operadorMatematico", "operadorAsignar", 
		"operadorSuma", "operadorResta", "operadorMultiplicacion", "operadorDivision", 
		"operadorBooleano", "operadorIgual", "operadorNoIgual", "expresionCondicional", 
		"bloqueCondicional", "condicionalIf", "condicionalElseIf", "condicionalElse", 
		"bloqueRepetitivo", "cicloFor", "cicloWhile"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'TORRE'", "'MUNDO'", "'ESTRELLA'", "'FUERZA'", "'TEMPLANZA'", 
		"' '", "'='", "'('", "')'", "'{'", "'}'", "';'", "'''", null, "'VAR'", 
		"'CONST'", null, "'PAPA'", "'SACERDOTISA'", "'EMPERATRIZ'", "'SOL'", "'LUNA_SOL'", 
		"'LUNA'", "'COLGADO'", "'RUEDA_FORTUNA'", "'=='", "'!='", "'+='", "'-='", 
		"'*='", "'/='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "FUNCION_RAIZ", "FUNCION_SENO", "FUNCION_COSENO", "FUNCION_PRINT", 
		"FUNCION_READ", "ESPACIO", "IGUAL", "PARENTESIS_ABIERTO", "PARENTESIS_CERRADO", 
		"LLAVE_ABIERTA", "LLAVE_CERRADA", "PUNTO_COMA", "COMILLA", "TIPO_VARIABLE", 
		"TIPO_VARIABLE_VAR", "TIPO_VARIABLE_CONST", "TIPO_DATO", "TIPO_DATO_INT", 
		"TIPO_DATO_REAL", "TIPO_DATO_STRING", "CONDICIONAL_IF", "CONDICIONAL_ELSE_IF", 
		"CONDICIONAL_ELSE", "CICLO_FOR", "CICLO_WHILE", "OPERADOR_IGUAL", "OPERADOR_NO_IGUAL", 
		"OPERADOR_SUMA", "OPERADOR_RESTA", "OPERADOR_MULT", "OPERADOR_DIV", "NOMBRE_VARIABLE", 
		"VALOR_DATO", "VALOR_DATO_ENTERO", "VALOR_DATO_REAL", "VALOR_DATO_TEXTO", 
		"VALOR_DATO_STRING"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public List<LineaContext> linea() {
			return getRuleContexts(LineaContext.class);
		}
		public LineaContext linea(int i) {
			return getRuleContext(LineaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				linea();
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCION_RAIZ) | (1L << FUNCION_SENO) | (1L << FUNCION_COSENO) | (1L << FUNCION_PRINT) | (1L << FUNCION_READ) | (1L << TIPO_VARIABLE) | (1L << CONDICIONAL_IF) | (1L << CICLO_FOR) | (1L << CICLO_WHILE) | (1L << NOMBRE_VARIABLE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineaContext extends ParserRuleContext {
		public DeclararVariableContext declararVariable() {
			return getRuleContext(DeclararVariableContext.class,0);
		}
		public FuncionLeerImprimirContext funcionLeerImprimir() {
			return getRuleContext(FuncionLeerImprimirContext.class,0);
		}
		public BloqueCondicionalContext bloqueCondicional() {
			return getRuleContext(BloqueCondicionalContext.class,0);
		}
		public BloqueRepetitivoContext bloqueRepetitivo() {
			return getRuleContext(BloqueRepetitivoContext.class,0);
		}
		public OperadorMatematicoContext operadorMatematico() {
			return getRuleContext(OperadorMatematicoContext.class,0);
		}
		public FuncionMatematicaContext funcionMatematica() {
			return getRuleContext(FuncionMatematicaContext.class,0);
		}
		public LineaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linea; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitLinea(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineaContext linea() throws RecognitionException {
		LineaContext _localctx = new LineaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_linea);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO_VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				declararVariable();
				}
				break;
			case FUNCION_PRINT:
			case FUNCION_READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				funcionLeerImprimir();
				}
				break;
			case CONDICIONAL_IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				bloqueCondicional();
				}
				break;
			case CICLO_FOR:
			case CICLO_WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				bloqueRepetitivo();
				}
				break;
			case NOMBRE_VARIABLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				operadorMatematico();
				}
				break;
			case FUNCION_RAIZ:
			case FUNCION_SENO:
			case FUNCION_COSENO:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				funcionMatematica();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclararVariableContext extends ParserRuleContext {
		public TerminalNode TIPO_VARIABLE() { return getToken(ParserTParser.TIPO_VARIABLE, 0); }
		public TerminalNode TIPO_DATO() { return getToken(ParserTParser.TIPO_DATO, 0); }
		public TerminalNode NOMBRE_VARIABLE() { return getToken(ParserTParser.NOMBRE_VARIABLE, 0); }
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
		public TerminalNode VALOR_DATO() { return getToken(ParserTParser.VALOR_DATO, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ParserTParser.PUNTO_COMA, 0); }
		public DeclararVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclararVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararVariableContext declararVariable() throws RecognitionException {
		DeclararVariableContext _localctx = new DeclararVariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declararVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(TIPO_VARIABLE);
			setState(70);
			match(TIPO_DATO);
			setState(71);
			match(NOMBRE_VARIABLE);
			setState(72);
			match(IGUAL);
			setState(73);
			match(VALOR_DATO);
			setState(74);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode NOMBRE_VARIABLE() { return getToken(ParserTParser.NOMBRE_VARIABLE, 0); }
		public TerminalNode VALOR_DATO() { return getToken(ParserTParser.VALOR_DATO, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==NOMBRE_VARIABLE || _la==VALOR_DATO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionLeerImprimirContext extends ParserRuleContext {
		public ImprimirVariableContext imprimirVariable() {
			return getRuleContext(ImprimirVariableContext.class,0);
		}
		public LeerVariableContext leerVariable() {
			return getRuleContext(LeerVariableContext.class,0);
		}
		public FuncionLeerImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionLeerImprimir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFuncionLeerImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionLeerImprimirContext funcionLeerImprimir() throws RecognitionException {
		FuncionLeerImprimirContext _localctx = new FuncionLeerImprimirContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcionLeerImprimir);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCION_PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				imprimirVariable();
				}
				break;
			case FUNCION_READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				leerVariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImprimirVariableContext extends ParserRuleContext {
		public TerminalNode FUNCION_PRINT() { return getToken(ParserTParser.FUNCION_PRINT, 0); }
		public TerminalNode PARENTESIS_ABIERTO() { return getToken(ParserTParser.PARENTESIS_ABIERTO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENTESIS_CERRADO() { return getToken(ParserTParser.PARENTESIS_CERRADO, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ParserTParser.PUNTO_COMA, 0); }
		public ImprimirVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimirVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitImprimirVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirVariableContext imprimirVariable() throws RecognitionException {
		ImprimirVariableContext _localctx = new ImprimirVariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_imprimirVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(FUNCION_PRINT);
			setState(83);
			match(PARENTESIS_ABIERTO);
			setState(84);
			expresion();
			setState(85);
			match(PARENTESIS_CERRADO);
			setState(86);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeerVariableContext extends ParserRuleContext {
		public TerminalNode FUNCION_READ() { return getToken(ParserTParser.FUNCION_READ, 0); }
		public TerminalNode PARENTESIS_ABIERTO() { return getToken(ParserTParser.PARENTESIS_ABIERTO, 0); }
		public TerminalNode PARENTESIS_CERRADO() { return getToken(ParserTParser.PARENTESIS_CERRADO, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ParserTParser.PUNTO_COMA, 0); }
		public LeerVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leerVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitLeerVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerVariableContext leerVariable() throws RecognitionException {
		LeerVariableContext _localctx = new LeerVariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_leerVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(FUNCION_READ);
			setState(89);
			match(PARENTESIS_ABIERTO);
			setState(90);
			match(PARENTESIS_CERRADO);
			setState(91);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionMatematicaContext extends ParserRuleContext {
		public FuncionRaizContext funcionRaiz() {
			return getRuleContext(FuncionRaizContext.class,0);
		}
		public FuncionSenoContext funcionSeno() {
			return getRuleContext(FuncionSenoContext.class,0);
		}
		public FuncionCosenoContext funcionCoseno() {
			return getRuleContext(FuncionCosenoContext.class,0);
		}
		public FuncionMatematicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionMatematica; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFuncionMatematica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionMatematicaContext funcionMatematica() throws RecognitionException {
		FuncionMatematicaContext _localctx = new FuncionMatematicaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcionMatematica);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCION_RAIZ:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				funcionRaiz();
				}
				break;
			case FUNCION_SENO:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				funcionSeno();
				}
				break;
			case FUNCION_COSENO:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				funcionCoseno();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionRaizContext extends ParserRuleContext {
		public TerminalNode FUNCION_RAIZ() { return getToken(ParserTParser.FUNCION_RAIZ, 0); }
		public TerminalNode PARENTESIS_ABIERTO() { return getToken(ParserTParser.PARENTESIS_ABIERTO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENTESIS_CERRADO() { return getToken(ParserTParser.PARENTESIS_CERRADO, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ParserTParser.PUNTO_COMA, 0); }
		public FuncionRaizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionRaiz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFuncionRaiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionRaizContext funcionRaiz() throws RecognitionException {
		FuncionRaizContext _localctx = new FuncionRaizContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcionRaiz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(FUNCION_RAIZ);
			setState(99);
			match(PARENTESIS_ABIERTO);
			setState(100);
			expresion();
			setState(101);
			match(PARENTESIS_CERRADO);
			setState(102);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionSenoContext extends ParserRuleContext {
		public TerminalNode FUNCION_SENO() { return getToken(ParserTParser.FUNCION_SENO, 0); }
		public TerminalNode PARENTESIS_ABIERTO() { return getToken(ParserTParser.PARENTESIS_ABIERTO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENTESIS_CERRADO() { return getToken(ParserTParser.PARENTESIS_CERRADO, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ParserTParser.PUNTO_COMA, 0); }
		public FuncionSenoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionSeno; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFuncionSeno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionSenoContext funcionSeno() throws RecognitionException {
		FuncionSenoContext _localctx = new FuncionSenoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcionSeno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(FUNCION_SENO);
			setState(105);
			match(PARENTESIS_ABIERTO);
			setState(106);
			expresion();
			setState(107);
			match(PARENTESIS_CERRADO);
			setState(108);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionCosenoContext extends ParserRuleContext {
		public TerminalNode FUNCION_COSENO() { return getToken(ParserTParser.FUNCION_COSENO, 0); }
		public TerminalNode PARENTESIS_ABIERTO() { return getToken(ParserTParser.PARENTESIS_ABIERTO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENTESIS_CERRADO() { return getToken(ParserTParser.PARENTESIS_CERRADO, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ParserTParser.PUNTO_COMA, 0); }
		public FuncionCosenoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionCoseno; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFuncionCoseno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionCosenoContext funcionCoseno() throws RecognitionException {
		FuncionCosenoContext _localctx = new FuncionCosenoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcionCoseno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(FUNCION_COSENO);
			setState(111);
			match(PARENTESIS_ABIERTO);
			setState(112);
			expresion();
			setState(113);
			match(PARENTESIS_CERRADO);
			setState(114);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorMatematicoContext extends ParserRuleContext {
		public OperadorAsignarContext operadorAsignar() {
			return getRuleContext(OperadorAsignarContext.class,0);
		}
		public OperadorSumaContext operadorSuma() {
			return getRuleContext(OperadorSumaContext.class,0);
		}
		public OperadorRestaContext operadorResta() {
			return getRuleContext(OperadorRestaContext.class,0);
		}
		public OperadorMultiplicacionContext operadorMultiplicacion() {
			return getRuleContext(OperadorMultiplicacionContext.class,0);
		}
		public OperadorDivisionContext operadorDivision() {
			return getRuleContext(OperadorDivisionContext.class,0);
		}
		public OperadorMatematicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorMatematico; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperadorMatematico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorMatematicoContext operadorMatematico() throws RecognitionException {
		OperadorMatematicoContext _localctx = new OperadorMatematicoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operadorMatematico);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				operadorAsignar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				operadorSuma();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				operadorResta();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				operadorMultiplicacion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				operadorDivision();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorAsignarContext extends ParserRuleContext {
		public TerminalNode NOMBRE_VARIABLE() { return getToken(ParserTParser.NOMBRE_VARIABLE, 0); }
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
		public TerminalNode VALOR_DATO() { return getToken(ParserTParser.VALOR_DATO, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ParserTParser.PUNTO_COMA, 0); }
		public OperadorAsignarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorAsignar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperadorAsignar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorAsignarContext operadorAsignar() throws RecognitionException {
		OperadorAsignarContext _localctx = new OperadorAsignarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operadorAsignar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(NOMBRE_VARIABLE);
			setState(124);
			match(IGUAL);
			setState(125);
			match(VALOR_DATO);
			setState(126);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorSumaContext extends ParserRuleContext {
		public TerminalNode NOMBRE_VARIABLE() { return getToken(ParserTParser.NOMBRE_VARIABLE, 0); }
		public TerminalNode OPERADOR_SUMA() { return getToken(ParserTParser.OPERADOR_SUMA, 0); }
		public TerminalNode VALOR_DATO() { return getToken(ParserTParser.VALOR_DATO, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ParserTParser.PUNTO_COMA, 0); }
		public OperadorSumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorSuma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperadorSuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorSumaContext operadorSuma() throws RecognitionException {
		OperadorSumaContext _localctx = new OperadorSumaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operadorSuma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(NOMBRE_VARIABLE);
			setState(129);
			match(OPERADOR_SUMA);
			setState(130);
			match(VALOR_DATO);
			setState(131);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorRestaContext extends ParserRuleContext {
		public TerminalNode NOMBRE_VARIABLE() { return getToken(ParserTParser.NOMBRE_VARIABLE, 0); }
		public TerminalNode OPERADOR_RESTA() { return getToken(ParserTParser.OPERADOR_RESTA, 0); }
		public TerminalNode VALOR_DATO() { return getToken(ParserTParser.VALOR_DATO, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ParserTParser.PUNTO_COMA, 0); }
		public OperadorRestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorResta; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperadorResta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorRestaContext operadorResta() throws RecognitionException {
		OperadorRestaContext _localctx = new OperadorRestaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operadorResta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(NOMBRE_VARIABLE);
			setState(134);
			match(OPERADOR_RESTA);
			setState(135);
			match(VALOR_DATO);
			setState(136);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorMultiplicacionContext extends ParserRuleContext {
		public TerminalNode NOMBRE_VARIABLE() { return getToken(ParserTParser.NOMBRE_VARIABLE, 0); }
		public TerminalNode OPERADOR_MULT() { return getToken(ParserTParser.OPERADOR_MULT, 0); }
		public TerminalNode VALOR_DATO() { return getToken(ParserTParser.VALOR_DATO, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ParserTParser.PUNTO_COMA, 0); }
		public OperadorMultiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorMultiplicacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperadorMultiplicacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorMultiplicacionContext operadorMultiplicacion() throws RecognitionException {
		OperadorMultiplicacionContext _localctx = new OperadorMultiplicacionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operadorMultiplicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(NOMBRE_VARIABLE);
			setState(139);
			match(OPERADOR_MULT);
			setState(140);
			match(VALOR_DATO);
			setState(141);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorDivisionContext extends ParserRuleContext {
		public TerminalNode NOMBRE_VARIABLE() { return getToken(ParserTParser.NOMBRE_VARIABLE, 0); }
		public TerminalNode OPERADOR_DIV() { return getToken(ParserTParser.OPERADOR_DIV, 0); }
		public TerminalNode VALOR_DATO() { return getToken(ParserTParser.VALOR_DATO, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ParserTParser.PUNTO_COMA, 0); }
		public OperadorDivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorDivision; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperadorDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorDivisionContext operadorDivision() throws RecognitionException {
		OperadorDivisionContext _localctx = new OperadorDivisionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operadorDivision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(NOMBRE_VARIABLE);
			setState(144);
			match(OPERADOR_DIV);
			setState(145);
			match(VALOR_DATO);
			setState(146);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorBooleanoContext extends ParserRuleContext {
		public OperadorIgualContext operadorIgual() {
			return getRuleContext(OperadorIgualContext.class,0);
		}
		public OperadorNoIgualContext operadorNoIgual() {
			return getRuleContext(OperadorNoIgualContext.class,0);
		}
		public OperadorBooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorBooleano; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperadorBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorBooleanoContext operadorBooleano() throws RecognitionException {
		OperadorBooleanoContext _localctx = new OperadorBooleanoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operadorBooleano);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				operadorIgual();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				operadorNoIgual();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorIgualContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode OPERADOR_IGUAL() { return getToken(ParserTParser.OPERADOR_IGUAL, 0); }
		public OperadorIgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorIgual; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperadorIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorIgualContext operadorIgual() throws RecognitionException {
		OperadorIgualContext _localctx = new OperadorIgualContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operadorIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			expresion();
			setState(153);
			match(OPERADOR_IGUAL);
			setState(154);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorNoIgualContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode OPERADOR_NO_IGUAL() { return getToken(ParserTParser.OPERADOR_NO_IGUAL, 0); }
		public OperadorNoIgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorNoIgual; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperadorNoIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorNoIgualContext operadorNoIgual() throws RecognitionException {
		OperadorNoIgualContext _localctx = new OperadorNoIgualContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operadorNoIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			expresion();
			setState(157);
			match(OPERADOR_NO_IGUAL);
			setState(158);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionCondicionalContext extends ParserRuleContext {
		public TerminalNode PARENTESIS_ABIERTO() { return getToken(ParserTParser.PARENTESIS_ABIERTO, 0); }
		public OperadorBooleanoContext operadorBooleano() {
			return getRuleContext(OperadorBooleanoContext.class,0);
		}
		public TerminalNode PARENTESIS_CERRADO() { return getToken(ParserTParser.PARENTESIS_CERRADO, 0); }
		public ExpresionCondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionCondicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitExpresionCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionCondicionalContext expresionCondicional() throws RecognitionException {
		ExpresionCondicionalContext _localctx = new ExpresionCondicionalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expresionCondicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(PARENTESIS_ABIERTO);
			setState(161);
			operadorBooleano();
			setState(162);
			match(PARENTESIS_CERRADO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueCondicionalContext extends ParserRuleContext {
		public CondicionalIfContext condicionalIf() {
			return getRuleContext(CondicionalIfContext.class,0);
		}
		public CondicionalElseIfContext condicionalElseIf() {
			return getRuleContext(CondicionalElseIfContext.class,0);
		}
		public CondicionalElseContext condicionalElse() {
			return getRuleContext(CondicionalElseContext.class,0);
		}
		public BloqueCondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueCondicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitBloqueCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueCondicionalContext bloqueCondicional() throws RecognitionException {
		BloqueCondicionalContext _localctx = new BloqueCondicionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bloqueCondicional);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				condicionalIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				condicionalElseIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				condicionalElse();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalIfContext extends ParserRuleContext {
		public TerminalNode CONDICIONAL_IF() { return getToken(ParserTParser.CONDICIONAL_IF, 0); }
		public ExpresionCondicionalContext expresionCondicional() {
			return getRuleContext(ExpresionCondicionalContext.class,0);
		}
		public TerminalNode LLAVE_ABIERTA() { return getToken(ParserTParser.LLAVE_ABIERTA, 0); }
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public TerminalNode LLAVE_CERRADA() { return getToken(ParserTParser.LLAVE_CERRADA, 0); }
		public CondicionalIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondicionalIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalIfContext condicionalIf() throws RecognitionException {
		CondicionalIfContext _localctx = new CondicionalIfContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condicionalIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(CONDICIONAL_IF);
			setState(170);
			expresionCondicional();
			setState(171);
			match(LLAVE_ABIERTA);
			setState(172);
			programa();
			setState(173);
			match(LLAVE_CERRADA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalElseIfContext extends ParserRuleContext {
		public CondicionalIfContext condicionalIf() {
			return getRuleContext(CondicionalIfContext.class,0);
		}
		public TerminalNode CONDICIONAL_ELSE_IF() { return getToken(ParserTParser.CONDICIONAL_ELSE_IF, 0); }
		public ExpresionCondicionalContext expresionCondicional() {
			return getRuleContext(ExpresionCondicionalContext.class,0);
		}
		public TerminalNode LLAVE_ABIERTA() { return getToken(ParserTParser.LLAVE_ABIERTA, 0); }
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public TerminalNode LLAVE_CERRADA() { return getToken(ParserTParser.LLAVE_CERRADA, 0); }
		public CondicionalElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalElseIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondicionalElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalElseIfContext condicionalElseIf() throws RecognitionException {
		CondicionalElseIfContext _localctx = new CondicionalElseIfContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_condicionalElseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			condicionalIf();
			setState(176);
			match(CONDICIONAL_ELSE_IF);
			setState(177);
			expresionCondicional();
			setState(178);
			match(LLAVE_ABIERTA);
			setState(179);
			programa();
			setState(180);
			match(LLAVE_CERRADA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalElseContext extends ParserRuleContext {
		public CondicionalIfContext condicionalIf() {
			return getRuleContext(CondicionalIfContext.class,0);
		}
		public TerminalNode CONDICIONAL_ELSE() { return getToken(ParserTParser.CONDICIONAL_ELSE, 0); }
		public TerminalNode LLAVE_ABIERTA() { return getToken(ParserTParser.LLAVE_ABIERTA, 0); }
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public TerminalNode LLAVE_CERRADA() { return getToken(ParserTParser.LLAVE_CERRADA, 0); }
		public CondicionalElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalElse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondicionalElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalElseContext condicionalElse() throws RecognitionException {
		CondicionalElseContext _localctx = new CondicionalElseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_condicionalElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			condicionalIf();
			setState(183);
			match(CONDICIONAL_ELSE);
			setState(184);
			match(LLAVE_ABIERTA);
			setState(185);
			programa();
			setState(186);
			match(LLAVE_CERRADA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueRepetitivoContext extends ParserRuleContext {
		public CicloForContext cicloFor() {
			return getRuleContext(CicloForContext.class,0);
		}
		public CicloWhileContext cicloWhile() {
			return getRuleContext(CicloWhileContext.class,0);
		}
		public BloqueRepetitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueRepetitivo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitBloqueRepetitivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueRepetitivoContext bloqueRepetitivo() throws RecognitionException {
		BloqueRepetitivoContext _localctx = new BloqueRepetitivoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bloqueRepetitivo);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CICLO_FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				cicloFor();
				}
				break;
			case CICLO_WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				cicloWhile();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloForContext extends ParserRuleContext {
		public TerminalNode CICLO_FOR() { return getToken(ParserTParser.CICLO_FOR, 0); }
		public TerminalNode PARENTESIS_ABIERTO() { return getToken(ParserTParser.PARENTESIS_ABIERTO, 0); }
		public TerminalNode NOMBRE_VARIABLE() { return getToken(ParserTParser.NOMBRE_VARIABLE, 0); }
		public List<TerminalNode> PUNTO_COMA() { return getTokens(ParserTParser.PUNTO_COMA); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(ParserTParser.PUNTO_COMA, i);
		}
		public OperadorBooleanoContext operadorBooleano() {
			return getRuleContext(OperadorBooleanoContext.class,0);
		}
		public OperadorMatematicoContext operadorMatematico() {
			return getRuleContext(OperadorMatematicoContext.class,0);
		}
		public TerminalNode PARENTESIS_CERRADO() { return getToken(ParserTParser.PARENTESIS_CERRADO, 0); }
		public TerminalNode LLAVE_ABIERTA() { return getToken(ParserTParser.LLAVE_ABIERTA, 0); }
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public TerminalNode LLAVE_CERRADA() { return getToken(ParserTParser.LLAVE_CERRADA, 0); }
		public CicloForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloFor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCicloFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloForContext cicloFor() throws RecognitionException {
		CicloForContext _localctx = new CicloForContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cicloFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(CICLO_FOR);
			setState(193);
			match(PARENTESIS_ABIERTO);
			setState(194);
			match(NOMBRE_VARIABLE);
			setState(195);
			match(PUNTO_COMA);
			setState(196);
			operadorBooleano();
			setState(197);
			match(PUNTO_COMA);
			setState(198);
			operadorMatematico();
			setState(199);
			match(PARENTESIS_CERRADO);
			setState(200);
			match(LLAVE_ABIERTA);
			setState(201);
			programa();
			setState(202);
			match(LLAVE_CERRADA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloWhileContext extends ParserRuleContext {
		public TerminalNode CICLO_WHILE() { return getToken(ParserTParser.CICLO_WHILE, 0); }
		public TerminalNode PARENTESIS_ABIERTO() { return getToken(ParserTParser.PARENTESIS_ABIERTO, 0); }
		public OperadorBooleanoContext operadorBooleano() {
			return getRuleContext(OperadorBooleanoContext.class,0);
		}
		public TerminalNode PARENTESIS_CERRADO() { return getToken(ParserTParser.PARENTESIS_CERRADO, 0); }
		public TerminalNode LLAVE_ABIERTA() { return getToken(ParserTParser.LLAVE_ABIERTA, 0); }
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public TerminalNode LLAVE_CERRADA() { return getToken(ParserTParser.LLAVE_CERRADA, 0); }
		public CicloWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloWhile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCicloWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloWhileContext cicloWhile() throws RecognitionException {
		CicloWhileContext _localctx = new CicloWhileContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cicloWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(CICLO_WHILE);
			setState(205);
			match(PARENTESIS_ABIERTO);
			setState(206);
			operadorBooleano();
			setState(207);
			match(PARENTESIS_CERRADO);
			setState(208);
			match(LLAVE_ABIERTA);
			setState(209);
			programa();
			setState(210);
			match(LLAVE_CERRADA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00d7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\6\2<\n\2\r\2\16\2=\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\5\6S\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5"+
		"\tc\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r|\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u0099\n\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u00aa"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\5\33\u00c1\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668\2\3\3\2#$\2\u00cb\2;\3\2\2\2\4E\3\2\2\2\6G\3\2\2\2"+
		"\bN\3\2\2\2\nR\3\2\2\2\fT\3\2\2\2\16Z\3\2\2\2\20b\3\2\2\2\22d\3\2\2\2"+
		"\24j\3\2\2\2\26p\3\2\2\2\30{\3\2\2\2\32}\3\2\2\2\34\u0082\3\2\2\2\36\u0087"+
		"\3\2\2\2 \u008c\3\2\2\2\"\u0091\3\2\2\2$\u0098\3\2\2\2&\u009a\3\2\2\2"+
		"(\u009e\3\2\2\2*\u00a2\3\2\2\2,\u00a9\3\2\2\2.\u00ab\3\2\2\2\60\u00b1"+
		"\3\2\2\2\62\u00b8\3\2\2\2\64\u00c0\3\2\2\2\66\u00c2\3\2\2\28\u00ce\3\2"+
		"\2\2:<\5\4\3\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?F\5"+
		"\6\4\2@F\5\n\6\2AF\5,\27\2BF\5\64\33\2CF\5\30\r\2DF\5\20\t\2E?\3\2\2\2"+
		"E@\3\2\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\5\3\2\2\2GH\7\21\2"+
		"\2HI\7\24\2\2IJ\7#\2\2JK\7\n\2\2KL\7$\2\2LM\7\17\2\2M\7\3\2\2\2NO\t\2"+
		"\2\2O\t\3\2\2\2PS\5\f\7\2QS\5\16\b\2RP\3\2\2\2RQ\3\2\2\2S\13\3\2\2\2T"+
		"U\7\7\2\2UV\7\13\2\2VW\5\b\5\2WX\7\f\2\2XY\7\17\2\2Y\r\3\2\2\2Z[\7\b\2"+
		"\2[\\\7\13\2\2\\]\7\f\2\2]^\7\17\2\2^\17\3\2\2\2_c\5\22\n\2`c\5\24\13"+
		"\2ac\5\26\f\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\21\3\2\2\2de\7\4\2\2ef\7"+
		"\13\2\2fg\5\b\5\2gh\7\f\2\2hi\7\17\2\2i\23\3\2\2\2jk\7\5\2\2kl\7\13\2"+
		"\2lm\5\b\5\2mn\7\f\2\2no\7\17\2\2o\25\3\2\2\2pq\7\6\2\2qr\7\13\2\2rs\5"+
		"\b\5\2st\7\f\2\2tu\7\17\2\2u\27\3\2\2\2v|\5\32\16\2w|\5\34\17\2x|\5\36"+
		"\20\2y|\5 \21\2z|\5\"\22\2{v\3\2\2\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3"+
		"\2\2\2|\31\3\2\2\2}~\7#\2\2~\177\7\n\2\2\177\u0080\7$\2\2\u0080\u0081"+
		"\7\17\2\2\u0081\33\3\2\2\2\u0082\u0083\7#\2\2\u0083\u0084\7\37\2\2\u0084"+
		"\u0085\7$\2\2\u0085\u0086\7\17\2\2\u0086\35\3\2\2\2\u0087\u0088\7#\2\2"+
		"\u0088\u0089\7 \2\2\u0089\u008a\7$\2\2\u008a\u008b\7\17\2\2\u008b\37\3"+
		"\2\2\2\u008c\u008d\7#\2\2\u008d\u008e\7!\2\2\u008e\u008f\7$\2\2\u008f"+
		"\u0090\7\17\2\2\u0090!\3\2\2\2\u0091\u0092\7#\2\2\u0092\u0093\7\"\2\2"+
		"\u0093\u0094\7$\2\2\u0094\u0095\7\17\2\2\u0095#\3\2\2\2\u0096\u0099\5"+
		"&\24\2\u0097\u0099\5(\25\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"%\3\2\2\2\u009a\u009b\5\b\5\2\u009b\u009c\7\35\2\2\u009c\u009d\5\b\5\2"+
		"\u009d\'\3\2\2\2\u009e\u009f\5\b\5\2\u009f\u00a0\7\36\2\2\u00a0\u00a1"+
		"\5\b\5\2\u00a1)\3\2\2\2\u00a2\u00a3\7\13\2\2\u00a3\u00a4\5$\23\2\u00a4"+
		"\u00a5\7\f\2\2\u00a5+\3\2\2\2\u00a6\u00aa\5.\30\2\u00a7\u00aa\5\60\31"+
		"\2\u00a8\u00aa\5\62\32\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa-\3\2\2\2\u00ab\u00ac\7\30\2\2\u00ac\u00ad\5*\26\2"+
		"\u00ad\u00ae\7\r\2\2\u00ae\u00af\5\2\2\2\u00af\u00b0\7\16\2\2\u00b0/\3"+
		"\2\2\2\u00b1\u00b2\5.\30\2\u00b2\u00b3\7\31\2\2\u00b3\u00b4\5*\26\2\u00b4"+
		"\u00b5\7\r\2\2\u00b5\u00b6\5\2\2\2\u00b6\u00b7\7\16\2\2\u00b7\61\3\2\2"+
		"\2\u00b8\u00b9\5.\30\2\u00b9\u00ba\7\32\2\2\u00ba\u00bb\7\r\2\2\u00bb"+
		"\u00bc\5\2\2\2\u00bc\u00bd\7\16\2\2\u00bd\63\3\2\2\2\u00be\u00c1\5\66"+
		"\34\2\u00bf\u00c1\58\35\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\65\3\2\2\2\u00c2\u00c3\7\33\2\2\u00c3\u00c4\7\13\2\2\u00c4\u00c5\7#\2"+
		"\2\u00c5\u00c6\7\17\2\2\u00c6\u00c7\5$\23\2\u00c7\u00c8\7\17\2\2\u00c8"+
		"\u00c9\5\30\r\2\u00c9\u00ca\7\f\2\2\u00ca\u00cb\7\r\2\2\u00cb\u00cc\5"+
		"\2\2\2\u00cc\u00cd\7\16\2\2\u00cd\67\3\2\2\2\u00ce\u00cf\7\34\2\2\u00cf"+
		"\u00d0\7\13\2\2\u00d0\u00d1\5$\23\2\u00d1\u00d2\7\f\2\2\u00d2\u00d3\7"+
		"\r\2\2\u00d3\u00d4\5\2\2\2\u00d4\u00d5\7\16\2\2\u00d59\3\2\2\2\n=ERb{"+
		"\u0098\u00a9\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}