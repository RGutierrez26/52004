// Generated from c:/Users/renzo/Desktop/52004/Parcial2/p.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class pLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, LETRA=4, DIGITO=5, SIMBOLO=6, LPAREN=7, RPAREN=8, 
		LLLAVE=9, RLLAVE=10, WS=11, SEMICOLON=12, PRINTF=13, IF=14, ELSE=15, RETURN=16, 
		NEWLINE=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "LETRA", "DIGITO", "SIMBOLO", "LPAREN", "RPAREN", 
			"LLLAVE", "RLLAVE", "WS", "SEMICOLON", "PRINTF", "IF", "ELSE", "RETURN", 
			"NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", "'1'", "'\"'", null, null, null, "'('", "')'", "'{'", "'}'", 
			null, "';'", "'printf'", "'if'", "'else'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "LETRA", "DIGITO", "SIMBOLO", "LPAREN", "RPAREN", 
			"LLLAVE", "RLLAVE", "WS", "SEMICOLON", "PRINTF", "IF", "ELSE", "RETURN", 
			"NEWLINE"
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


	public pLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "p.g4"; }

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
		"\u0004\u0000\u0011]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0004\n9\b"+
		"\n\u000b\n\f\n:\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0003\u0010X\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0000\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0004"+
		"\u0002\u0000AZaz\u0001\u000009\u0005\u0000!!,,..::??\u0002\u0000\t\t "+
		" ^\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000"+
		"\u0000\u0005\'\u0001\u0000\u0000\u0000\u0007)\u0001\u0000\u0000\u0000"+
		"\t+\u0001\u0000\u0000\u0000\u000b-\u0001\u0000\u0000\u0000\r/\u0001\u0000"+
		"\u0000\u0000\u000f1\u0001\u0000\u0000\u0000\u00113\u0001\u0000\u0000\u0000"+
		"\u00135\u0001\u0000\u0000\u0000\u00158\u0001\u0000\u0000\u0000\u0017>"+
		"\u0001\u0000\u0000\u0000\u0019@\u0001\u0000\u0000\u0000\u001bG\u0001\u0000"+
		"\u0000\u0000\u001dJ\u0001\u0000\u0000\u0000\u001fO\u0001\u0000\u0000\u0000"+
		"!W\u0001\u0000\u0000\u0000#$\u00050\u0000\u0000$\u0002\u0001\u0000\u0000"+
		"\u0000%&\u00051\u0000\u0000&\u0004\u0001\u0000\u0000\u0000\'(\u0005\""+
		"\u0000\u0000(\u0006\u0001\u0000\u0000\u0000)*\u0007\u0000\u0000\u0000"+
		"*\b\u0001\u0000\u0000\u0000+,\u0007\u0001\u0000\u0000,\n\u0001\u0000\u0000"+
		"\u0000-.\u0007\u0002\u0000\u0000.\f\u0001\u0000\u0000\u0000/0\u0005(\u0000"+
		"\u00000\u000e\u0001\u0000\u0000\u000012\u0005)\u0000\u00002\u0010\u0001"+
		"\u0000\u0000\u000034\u0005{\u0000\u00004\u0012\u0001\u0000\u0000\u0000"+
		"56\u0005}\u0000\u00006\u0014\u0001\u0000\u0000\u000079\u0007\u0003\u0000"+
		"\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0006"+
		"\n\u0000\u0000=\u0016\u0001\u0000\u0000\u0000>?\u0005;\u0000\u0000?\u0018"+
		"\u0001\u0000\u0000\u0000@A\u0005p\u0000\u0000AB\u0005r\u0000\u0000BC\u0005"+
		"i\u0000\u0000CD\u0005n\u0000\u0000DE\u0005t\u0000\u0000EF\u0005f\u0000"+
		"\u0000F\u001a\u0001\u0000\u0000\u0000GH\u0005i\u0000\u0000HI\u0005f\u0000"+
		"\u0000I\u001c\u0001\u0000\u0000\u0000JK\u0005e\u0000\u0000KL\u0005l\u0000"+
		"\u0000LM\u0005s\u0000\u0000MN\u0005e\u0000\u0000N\u001e\u0001\u0000\u0000"+
		"\u0000OP\u0005r\u0000\u0000PQ\u0005e\u0000\u0000QR\u0005t\u0000\u0000"+
		"RS\u0005u\u0000\u0000ST\u0005r\u0000\u0000TU\u0005n\u0000\u0000U \u0001"+
		"\u0000\u0000\u0000VX\u0005\r\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0005\n\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[\\\u0006\u0010\u0000\u0000\\\"\u0001\u0000\u0000\u0000"+
		"\u0003\u0000:W\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}