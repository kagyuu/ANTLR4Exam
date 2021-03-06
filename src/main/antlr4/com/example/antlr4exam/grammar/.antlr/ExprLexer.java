// Generated from /home/atsushihondoh/Documents/ANTLR4Exam/src/main/antlr4/com/example/antlr4exam/grammar/Expr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MUL_DEV=4, PLUS_MINUS=5, NUMBER=6, NEWLINE=7, 
		WHITESPACE=8, WORD=9, ALPHABET=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "MUL_DEV", "PLUS_MINUS", "NUMBER", "NEWLINE", 
			"WHITESPACE", "WORD", "ALPHABET"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "MUL_DEV", "PLUS_MINUS", "NUMBER", "NEWLINE", 
			"WHITESPACE", "WORD", "ALPHABET"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fE\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\5\7$\n\7\3\7\6\7\'"+
		"\n\7\r\7\16\7(\3\7\3\7\6\7-\n\7\r\7\16\7.\5\7\61\n\7\3\b\5\b\64\n\b\3"+
		"\b\3\b\3\t\6\t9\n\t\r\t\16\t:\3\t\3\t\3\n\6\n@\n\n\r\n\16\nA\3\13\3\13"+
		"\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\7\4\2,,\61\61"+
		"\4\2--//\3\2\62;\4\2\13\13\"\"\6\2..\60\60C\\c|\2K\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\31\3\2\2\2\7\33\3\2"+
		"\2\2\t\36\3\2\2\2\13 \3\2\2\2\r#\3\2\2\2\17\63\3\2\2\2\218\3\2\2\2\23"+
		"?\3\2\2\2\25C\3\2\2\2\27\30\7*\2\2\30\4\3\2\2\2\31\32\7+\2\2\32\6\3\2"+
		"\2\2\33\34\7\61\2\2\34\35\7\61\2\2\35\b\3\2\2\2\36\37\t\2\2\2\37\n\3\2"+
		"\2\2 !\t\3\2\2!\f\3\2\2\2\"$\t\3\2\2#\"\3\2\2\2#$\3\2\2\2$&\3\2\2\2%\'"+
		"\t\4\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\60\3\2\2\2*,\7\60\2"+
		"\2+-\t\4\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60*\3"+
		"\2\2\2\60\61\3\2\2\2\61\16\3\2\2\2\62\64\7\17\2\2\63\62\3\2\2\2\63\64"+
		"\3\2\2\2\64\65\3\2\2\2\65\66\7\f\2\2\66\20\3\2\2\2\679\t\5\2\28\67\3\2"+
		"\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\b\t\2\2=\22\3\2\2\2>@\5"+
		"\25\13\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\24\3\2\2\2CD\t\6\2\2"+
		"D\26\3\2\2\2\n\2#(.\60\63:A\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}