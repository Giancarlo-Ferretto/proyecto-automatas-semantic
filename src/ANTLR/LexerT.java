package ANTLR;

// Generated from LexerT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerT extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCION_RAIZ=1, FUNCION_SENO=2, FUNCION_COSENO=3, FUNCION_PRINT=4, FUNCION_READ=5, 
		ESPACIO=6, IGUAL=7, PARENTESIS_ABIERTO=8, PARENTESIS_CERRADO=9, LLAVE_ABIERTA=10, 
		LLAVE_CERRADA=11, PUNTO_COMA=12, COMILLA=13, TIPO_VARIABLE=14, TIPO_VARIABLE_VAR=15, 
		TIPO_VARIABLE_CONST=16, TIPO_DATO=17, TIPO_DATO_INT=18, TIPO_DATO_REAL=19, 
		TIPO_DATO_STRING=20, CONDICIONAL_IF=21, CONDICIONAL_ELSE_IF=22, CONDICIONAL_ELSE=23, 
		CICLO_FOR=24, CICLO_WHILE=25, OPERADOR_IGUAL=26, OPERADOR_NO_IGUAL=27, 
		OPERADOR_SUMA=28, OPERADOR_RESTA=29, OPERADOR_MULT=30, OPERADOR_DIV=31, 
		NOMBRE_VARIABLE=32, VALOR_DATO=33, VALOR_DATO_ENTERO=34, VALOR_DATO_REAL=35, 
		VALOR_DATO_TEXTO=36, VALOR_DATO_STRING=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"FUNCION_RAIZ", "FUNCION_SENO", "FUNCION_COSENO", "FUNCION_PRINT", "FUNCION_READ", 
		"ESPACIO", "IGUAL", "PARENTESIS_ABIERTO", "PARENTESIS_CERRADO", "LLAVE_ABIERTA", 
		"LLAVE_CERRADA", "PUNTO_COMA", "COMILLA", "TIPO_VARIABLE", "TIPO_VARIABLE_VAR", 
		"TIPO_VARIABLE_CONST", "TIPO_DATO", "TIPO_DATO_INT", "TIPO_DATO_REAL", 
		"TIPO_DATO_STRING", "CONDICIONAL_IF", "CONDICIONAL_ELSE_IF", "CONDICIONAL_ELSE", 
		"CICLO_FOR", "CICLO_WHILE", "OPERADOR_IGUAL", "OPERADOR_NO_IGUAL", "OPERADOR_SUMA", 
		"OPERADOR_RESTA", "OPERADOR_MULT", "OPERADOR_DIV", "NOMBRE_VARIABLE", 
		"VALOR_DATO", "VALOR_DATO_ENTERO", "VALOR_DATO_REAL", "VALOR_DATO_TEXTO", 
		"VALOR_DATO_STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'TORRE'", "'MUNDO'", "'ESTRELLA'", "'FUERZA'", "'TEMPLANZA'", "' '", 
		"'='", "'('", "')'", "'{'", "'}'", "';'", "'''", null, "'VAR'", "'CONST'", 
		null, "'PAPA'", "'SACERDOTISA'", "'EMPERATRIZ'", "'SOL'", "'LUNA_SOL'", 
		"'LUNA'", "'COLGADO'", "'RUEDA_FORTUNA'", "'=='", "'!='", "'+='", "'-='", 
		"'*='", "'/='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FUNCION_RAIZ", "FUNCION_SENO", "FUNCION_COSENO", "FUNCION_PRINT", 
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


	public LexerT(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerT.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\5\17\u0086\n"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5"+
		"\22\u0095\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3!\6!\u00ee\n!\r!\16!\u00ef\3\"\3\"\3\"\5\"\u00f5"+
		"\n\"\3#\6#\u00f8\n#\r#\16#\u00f9\3$\6$\u00fd\n$\r$\16$\u00fe\3$\3$\6$"+
		"\u0103\n$\r$\16$\u0104\3%\6%\u0108\n%\r%\16%\u0109\3&\3&\3&\6&\u010f\n"+
		"&\r&\16&\u0110\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\5\5\2C\\aac|\3\2\62;"+
		"\4\2C\\c|\2\u011f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5S\3\2\2\2\7Y\3\2"+
		"\2\2\tb\3\2\2\2\13i\3\2\2\2\rs\3\2\2\2\17u\3\2\2\2\21w\3\2\2\2\23y\3\2"+
		"\2\2\25{\3\2\2\2\27}\3\2\2\2\31\177\3\2\2\2\33\u0081\3\2\2\2\35\u0085"+
		"\3\2\2\2\37\u0087\3\2\2\2!\u008b\3\2\2\2#\u0094\3\2\2\2%\u0096\3\2\2\2"+
		"\'\u009b\3\2\2\2)\u00a7\3\2\2\2+\u00b2\3\2\2\2-\u00b6\3\2\2\2/\u00bf\3"+
		"\2\2\2\61\u00c4\3\2\2\2\63\u00cc\3\2\2\2\65\u00da\3\2\2\2\67\u00dd\3\2"+
		"\2\29\u00e0\3\2\2\2;\u00e3\3\2\2\2=\u00e6\3\2\2\2?\u00e9\3\2\2\2A\u00ed"+
		"\3\2\2\2C\u00f4\3\2\2\2E\u00f7\3\2\2\2G\u00fc\3\2\2\2I\u0107\3\2\2\2K"+
		"\u010b\3\2\2\2MN\7V\2\2NO\7Q\2\2OP\7T\2\2PQ\7T\2\2QR\7G\2\2R\4\3\2\2\2"+
		"ST\7O\2\2TU\7W\2\2UV\7P\2\2VW\7F\2\2WX\7Q\2\2X\6\3\2\2\2YZ\7G\2\2Z[\7"+
		"U\2\2[\\\7V\2\2\\]\7T\2\2]^\7G\2\2^_\7N\2\2_`\7N\2\2`a\7C\2\2a\b\3\2\2"+
		"\2bc\7H\2\2cd\7W\2\2de\7G\2\2ef\7T\2\2fg\7\\\2\2gh\7C\2\2h\n\3\2\2\2i"+
		"j\7V\2\2jk\7G\2\2kl\7O\2\2lm\7R\2\2mn\7N\2\2no\7C\2\2op\7P\2\2pq\7\\\2"+
		"\2qr\7C\2\2r\f\3\2\2\2st\7\"\2\2t\16\3\2\2\2uv\7?\2\2v\20\3\2\2\2wx\7"+
		"*\2\2x\22\3\2\2\2yz\7+\2\2z\24\3\2\2\2{|\7}\2\2|\26\3\2\2\2}~\7\177\2"+
		"\2~\30\3\2\2\2\177\u0080\7=\2\2\u0080\32\3\2\2\2\u0081\u0082\7)\2\2\u0082"+
		"\34\3\2\2\2\u0083\u0086\5\37\20\2\u0084\u0086\5!\21\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0084\3\2\2\2\u0086\36\3\2\2\2\u0087\u0088\7X\2\2\u0088\u0089"+
		"\7C\2\2\u0089\u008a\7T\2\2\u008a \3\2\2\2\u008b\u008c\7E\2\2\u008c\u008d"+
		"\7Q\2\2\u008d\u008e\7P\2\2\u008e\u008f\7U\2\2\u008f\u0090\7V\2\2\u0090"+
		"\"\3\2\2\2\u0091\u0095\5%\23\2\u0092\u0095\5\'\24\2\u0093\u0095\5)\25"+
		"\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095$"+
		"\3\2\2\2\u0096\u0097\7R\2\2\u0097\u0098\7C\2\2\u0098\u0099\7R\2\2\u0099"+
		"\u009a\7C\2\2\u009a&\3\2\2\2\u009b\u009c\7U\2\2\u009c\u009d\7C\2\2\u009d"+
		"\u009e\7E\2\2\u009e\u009f\7G\2\2\u009f\u00a0\7T\2\2\u00a0\u00a1\7F\2\2"+
		"\u00a1\u00a2\7Q\2\2\u00a2\u00a3\7V\2\2\u00a3\u00a4\7K\2\2\u00a4\u00a5"+
		"\7U\2\2\u00a5\u00a6\7C\2\2\u00a6(\3\2\2\2\u00a7\u00a8\7G\2\2\u00a8\u00a9"+
		"\7O\2\2\u00a9\u00aa\7R\2\2\u00aa\u00ab\7G\2\2\u00ab\u00ac\7T\2\2\u00ac"+
		"\u00ad\7C\2\2\u00ad\u00ae\7V\2\2\u00ae\u00af\7T\2\2\u00af\u00b0\7K\2\2"+
		"\u00b0\u00b1\7\\\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7U\2\2\u00b3\u00b4\7Q"+
		"\2\2\u00b4\u00b5\7N\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7N\2\2\u00b7\u00b8"+
		"\7W\2\2\u00b8\u00b9\7P\2\2\u00b9\u00ba\7C\2\2\u00ba\u00bb\7a\2\2\u00bb"+
		"\u00bc\7U\2\2\u00bc\u00bd\7Q\2\2\u00bd\u00be\7N\2\2\u00be.\3\2\2\2\u00bf"+
		"\u00c0\7N\2\2\u00c0\u00c1\7W\2\2\u00c1\u00c2\7P\2\2\u00c2\u00c3\7C\2\2"+
		"\u00c3\60\3\2\2\2\u00c4\u00c5\7E\2\2\u00c5\u00c6\7Q\2\2\u00c6\u00c7\7"+
		"N\2\2\u00c7\u00c8\7I\2\2\u00c8\u00c9\7C\2\2\u00c9\u00ca\7F\2\2\u00ca\u00cb"+
		"\7Q\2\2\u00cb\62\3\2\2\2\u00cc\u00cd\7T\2\2\u00cd\u00ce\7W\2\2\u00ce\u00cf"+
		"\7G\2\2\u00cf\u00d0\7F\2\2\u00d0\u00d1\7C\2\2\u00d1\u00d2\7a\2\2\u00d2"+
		"\u00d3\7H\2\2\u00d3\u00d4\7Q\2\2\u00d4\u00d5\7T\2\2\u00d5\u00d6\7V\2\2"+
		"\u00d6\u00d7\7W\2\2\u00d7\u00d8\7P\2\2\u00d8\u00d9\7C\2\2\u00d9\64\3\2"+
		"\2\2\u00da\u00db\7?\2\2\u00db\u00dc\7?\2\2\u00dc\66\3\2\2\2\u00dd\u00de"+
		"\7#\2\2\u00de\u00df\7?\2\2\u00df8\3\2\2\2\u00e0\u00e1\7-\2\2\u00e1\u00e2"+
		"\7?\2\2\u00e2:\3\2\2\2\u00e3\u00e4\7/\2\2\u00e4\u00e5\7?\2\2\u00e5<\3"+
		"\2\2\2\u00e6\u00e7\7,\2\2\u00e7\u00e8\7?\2\2\u00e8>\3\2\2\2\u00e9\u00ea"+
		"\7\61\2\2\u00ea\u00eb\7?\2\2\u00eb@\3\2\2\2\u00ec\u00ee\t\2\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0B\3\2\2\2\u00f1\u00f5\5E#\2\u00f2\u00f5\5G$\2\u00f3\u00f5\5"+
		"K&\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"D\3\2\2\2\u00f6\u00f8\t\3\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2"+
		"\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00faF\3\2\2\2\u00fb\u00fd\t"+
		"\3\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\7\60\2\2\u0101\u0103\t"+
		"\3\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105H\3\2\2\2\u0106\u0108\t\4\2\2\u0107\u0106\3\2\2\2"+
		"\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010aJ\3"+
		"\2\2\2\u010b\u010e\5\33\16\2\u010c\u010f\5I%\2\u010d\u010f\5\r\7\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\5\33\16\2\u0113"+
		"L\3\2\2\2\17\2\u0085\u0094\u00ed\u00ef\u00f4\u00f9\u00fe\u0104\u0107\u0109"+
		"\u010e\u0110\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}