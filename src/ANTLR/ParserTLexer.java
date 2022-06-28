package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "FUNCION_RAIZ", "FUNCION_SENO", "FUNCION_COSENO", "FUNCION_PRINT", 
		"FUNCION_READ", "ESPACIO", "IGUAL", "PARENTESIS_ABIERTO", "PARENTESIS_CERRADO", 
		"LLAVE_ABIERTA", "LLAVE_CERRADA", "PUNTO_COMA", "COMILLA", "TIPO_VARIABLE", 
		"TIPO_VARIABLE_VAR", "TIPO_VARIABLE_CONST", "TIPO_DATO", "TIPO_DATO_INT", 
		"TIPO_DATO_REAL", "TIPO_DATO_STRING", "CONDICIONAL_IF", "CONDICIONAL_ELSE_IF", 
		"CONDICIONAL_ELSE", "CICLO_FOR", "CICLO_WHILE", "OPERADOR_IGUAL", "OPERADOR_NO_IGUAL", 
		"OPERADOR_SUMA", "OPERADOR_RESTA", "OPERADOR_MULT", "OPERADOR_DIV", "NOMBRE_VARIABLE", 
		"VALOR_DATO", "VALOR_DATO_ENTERO", "VALOR_DATO_REAL", "VALOR_DATO_TEXTO", 
		"VALOR_DATO_STRING"
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


	public ParserTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u011a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\5\20\u008c\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\5\23\u009b\n\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\6\"\u00f4\n\"\r\"\16\"\u00f5"+
		"\3#\3#\3#\5#\u00fb\n#\3$\6$\u00fe\n$\r$\16$\u00ff\3%\6%\u0103\n%\r%\16"+
		"%\u0104\3%\3%\6%\u0109\n%\r%\16%\u010a\3&\6&\u010e\n&\r&\16&\u010f\3\'"+
		"\3\'\3\'\6\'\u0115\n\'\r\'\16\'\u0116\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(\3\2\6\5\2\13\f\17\17\"\"\5\2C\\aac|\3\2\62;\4\2C\\c|\2\u0125\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5S\3\2\2\2\7Y\3\2\2\2\t_\3\2"+
		"\2\2\13h\3\2\2\2\ro\3\2\2\2\17y\3\2\2\2\21{\3\2\2\2\23}\3\2\2\2\25\177"+
		"\3\2\2\2\27\u0081\3\2\2\2\31\u0083\3\2\2\2\33\u0085\3\2\2\2\35\u0087\3"+
		"\2\2\2\37\u008b\3\2\2\2!\u008d\3\2\2\2#\u0091\3\2\2\2%\u009a\3\2\2\2\'"+
		"\u009c\3\2\2\2)\u00a1\3\2\2\2+\u00ad\3\2\2\2-\u00b8\3\2\2\2/\u00bc\3\2"+
		"\2\2\61\u00c5\3\2\2\2\63\u00ca\3\2\2\2\65\u00d2\3\2\2\2\67\u00e0\3\2\2"+
		"\29\u00e3\3\2\2\2;\u00e6\3\2\2\2=\u00e9\3\2\2\2?\u00ec\3\2\2\2A\u00ef"+
		"\3\2\2\2C\u00f3\3\2\2\2E\u00fa\3\2\2\2G\u00fd\3\2\2\2I\u0102\3\2\2\2K"+
		"\u010d\3\2\2\2M\u0111\3\2\2\2OP\t\2\2\2PQ\3\2\2\2QR\b\2\2\2R\4\3\2\2\2"+
		"ST\7V\2\2TU\7Q\2\2UV\7T\2\2VW\7T\2\2WX\7G\2\2X\6\3\2\2\2YZ\7O\2\2Z[\7"+
		"W\2\2[\\\7P\2\2\\]\7F\2\2]^\7Q\2\2^\b\3\2\2\2_`\7G\2\2`a\7U\2\2ab\7V\2"+
		"\2bc\7T\2\2cd\7G\2\2de\7N\2\2ef\7N\2\2fg\7C\2\2g\n\3\2\2\2hi\7H\2\2ij"+
		"\7W\2\2jk\7G\2\2kl\7T\2\2lm\7\\\2\2mn\7C\2\2n\f\3\2\2\2op\7V\2\2pq\7G"+
		"\2\2qr\7O\2\2rs\7R\2\2st\7N\2\2tu\7C\2\2uv\7P\2\2vw\7\\\2\2wx\7C\2\2x"+
		"\16\3\2\2\2yz\7\"\2\2z\20\3\2\2\2{|\7?\2\2|\22\3\2\2\2}~\7*\2\2~\24\3"+
		"\2\2\2\177\u0080\7+\2\2\u0080\26\3\2\2\2\u0081\u0082\7}\2\2\u0082\30\3"+
		"\2\2\2\u0083\u0084\7\177\2\2\u0084\32\3\2\2\2\u0085\u0086\7=\2\2\u0086"+
		"\34\3\2\2\2\u0087\u0088\7)\2\2\u0088\36\3\2\2\2\u0089\u008c\5!\21\2\u008a"+
		"\u008c\5#\22\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c \3\2\2\2"+
		"\u008d\u008e\7X\2\2\u008e\u008f\7C\2\2\u008f\u0090\7T\2\2\u0090\"\3\2"+
		"\2\2\u0091\u0092\7E\2\2\u0092\u0093\7Q\2\2\u0093\u0094\7P\2\2\u0094\u0095"+
		"\7U\2\2\u0095\u0096\7V\2\2\u0096$\3\2\2\2\u0097\u009b\5\'\24\2\u0098\u009b"+
		"\5)\25\2\u0099\u009b\5+\26\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b&\3\2\2\2\u009c\u009d\7R\2\2\u009d\u009e\7C\2\2\u009e"+
		"\u009f\7R\2\2\u009f\u00a0\7C\2\2\u00a0(\3\2\2\2\u00a1\u00a2\7U\2\2\u00a2"+
		"\u00a3\7C\2\2\u00a3\u00a4\7E\2\2\u00a4\u00a5\7G\2\2\u00a5\u00a6\7T\2\2"+
		"\u00a6\u00a7\7F\2\2\u00a7\u00a8\7Q\2\2\u00a8\u00a9\7V\2\2\u00a9\u00aa"+
		"\7K\2\2\u00aa\u00ab\7U\2\2\u00ab\u00ac\7C\2\2\u00ac*\3\2\2\2\u00ad\u00ae"+
		"\7G\2\2\u00ae\u00af\7O\2\2\u00af\u00b0\7R\2\2\u00b0\u00b1\7G\2\2\u00b1"+
		"\u00b2\7T\2\2\u00b2\u00b3\7C\2\2\u00b3\u00b4\7V\2\2\u00b4\u00b5\7T\2\2"+
		"\u00b5\u00b6\7K\2\2\u00b6\u00b7\7\\\2\2\u00b7,\3\2\2\2\u00b8\u00b9\7U"+
		"\2\2\u00b9\u00ba\7Q\2\2\u00ba\u00bb\7N\2\2\u00bb.\3\2\2\2\u00bc\u00bd"+
		"\7N\2\2\u00bd\u00be\7W\2\2\u00be\u00bf\7P\2\2\u00bf\u00c0\7C\2\2\u00c0"+
		"\u00c1\7a\2\2\u00c1\u00c2\7U\2\2\u00c2\u00c3\7Q\2\2\u00c3\u00c4\7N\2\2"+
		"\u00c4\60\3\2\2\2\u00c5\u00c6\7N\2\2\u00c6\u00c7\7W\2\2\u00c7\u00c8\7"+
		"P\2\2\u00c8\u00c9\7C\2\2\u00c9\62\3\2\2\2\u00ca\u00cb\7E\2\2\u00cb\u00cc"+
		"\7Q\2\2\u00cc\u00cd\7N\2\2\u00cd\u00ce\7I\2\2\u00ce\u00cf\7C\2\2\u00cf"+
		"\u00d0\7F\2\2\u00d0\u00d1\7Q\2\2\u00d1\64\3\2\2\2\u00d2\u00d3\7T\2\2\u00d3"+
		"\u00d4\7W\2\2\u00d4\u00d5\7G\2\2\u00d5\u00d6\7F\2\2\u00d6\u00d7\7C\2\2"+
		"\u00d7\u00d8\7a\2\2\u00d8\u00d9\7H\2\2\u00d9\u00da\7Q\2\2\u00da\u00db"+
		"\7T\2\2\u00db\u00dc\7V\2\2\u00dc\u00dd\7W\2\2\u00dd\u00de\7P\2\2\u00de"+
		"\u00df\7C\2\2\u00df\66\3\2\2\2\u00e0\u00e1\7?\2\2\u00e1\u00e2\7?\2\2\u00e2"+
		"8\3\2\2\2\u00e3\u00e4\7#\2\2\u00e4\u00e5\7?\2\2\u00e5:\3\2\2\2\u00e6\u00e7"+
		"\7-\2\2\u00e7\u00e8\7?\2\2\u00e8<\3\2\2\2\u00e9\u00ea\7/\2\2\u00ea\u00eb"+
		"\7?\2\2\u00eb>\3\2\2\2\u00ec\u00ed\7,\2\2\u00ed\u00ee\7?\2\2\u00ee@\3"+
		"\2\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f1\7?\2\2\u00f1B\3\2\2\2\u00f2\u00f4"+
		"\t\3\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6D\3\2\2\2\u00f7\u00fb\5G$\2\u00f8\u00fb\5I%\2\u00f9"+
		"\u00fb\5M\'\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2"+
		"\2\2\u00fbF\3\2\2\2\u00fc\u00fe\t\4\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100H\3\2\2\2\u0101"+
		"\u0103\t\4\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\7\60\2\2\u0107"+
		"\u0109\t\4\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010bJ\3\2\2\2\u010c\u010e\t\5\2\2\u010d\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"L\3\2\2\2\u0111\u0114\5\35\17\2\u0112\u0115\5K&\2\u0113\u0115\5\17\b\2"+
		"\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\5\35\17\2"+
		"\u0119N\3\2\2\2\17\2\u008b\u009a\u00f3\u00f5\u00fa\u00ff\u0104\u010a\u010d"+
		"\u010f\u0114\u0116\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}