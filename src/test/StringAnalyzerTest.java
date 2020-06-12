import org.junit.jupiter.api.Test;
import superawesomepackage.StringAnalyzer;

import static org.junit.jupiter.api.Assertions.*;


public class StringAnalyzerTest {
    @Test
    void testCharacterCount() {
        assertEquals(StringAnalyzer.characterCount("a1"), "Input: a1\nThere are 2 characters");
        assertEquals(StringAnalyzer.characterCount("123456"), "Input: 123456\nThere are 6 characters");
        assertEquals(StringAnalyzer.characterCount("qwerasdf"), "Input: qwerasdf\nThere are 8 characters");
    }

    @Test
    void testLetterCount() {
        assertEquals(StringAnalyzer.letterCount("a1"), "Input: a1\nThere are 1 letters");
        assertEquals(StringAnalyzer.letterCount("1234qwer"), "Input: 1234qwer\nThere are 4 letters");
        assertEquals(StringAnalyzer.letterCount("q1w2e3r4"), "Input: q1w2e3r4\nThere are 4 letters");
    }

    @Test
    void testNumberCount() {
        assertEquals(StringAnalyzer.numberCount("a1"), "Input: a1\nThere are 1 numbers");
        assertEquals(StringAnalyzer.numberCount("1234qwer"), "Input: 1234qwer\nThere are 4 numbers");
        assertEquals(StringAnalyzer.numberCount("q1w2e3r4"), "Input: q1w2e3r4\nThere are 4 numbers");
    }

    @Test
    void testSpaceCount() {
        assertEquals(StringAnalyzer.spaceCount("a1"), "Input: a1\nThere are 0 spaces");
        assertEquals(StringAnalyzer.spaceCount("1234 qwer"), "Input: 1234 qwer\nThere are 1 spaces");
        assertEquals(StringAnalyzer.spaceCount("q 1 w 2 e 3 r 4"), "Input: q 1 w 2 e 3 r 4\nThere are 7 spaces");
    }

    @Test
    void testPunctuationCount() {
        assertEquals(StringAnalyzer.punctuationCount("a1"), "Input: a1\nThere are 0 punctuations");
        assertEquals(StringAnalyzer.punctuationCount("?!?!?!"), "Input: ?!?!?!\nThere are 6 punctuations");
        assertEquals(StringAnalyzer.punctuationCount("Hello."), "Input: Hello.\nThere are 1 punctuations");
    }
}
