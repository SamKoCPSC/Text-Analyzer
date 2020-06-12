import org.junit.jupiter.api.Test;
import superawesomepackage.StringAnalyzer;
import superawesomepackage.StringOperator;

import static org.junit.jupiter.api.Assertions.*;

public class StringOperatorTest {
    @Test
    void reverseTest() {
        assertEquals(StringOperator.reverse("a1"), "Input: a1\nThe reverse string is: 1a");
        assertEquals(StringOperator.reverse("qwer1234"), "Input: qwer1234\nThe reverse string is: 4321rewq");
        assertEquals(StringOperator.reverse("x"), "Input: x\nThe reverse string is: x");
    }

    @Test
    void shuffleTest() {
        assertTrue(StringOperator.shuffle("qwerasdfzxcv").contains("qwerasdfzxcv"));
        assertTrue(StringOperator.shuffle("1234567890").contains("1234567890"));
    }

    @Test
    void captitalizeTest() {
        assertEquals(StringOperator.captilize("qwerasdf"), "Input: qwerasdf\nThe capitalized string is: QWERASDF");
        assertEquals(StringOperator.captilize("QWERASDF"), "Input: QWERASDF\nThe capitalized string is: QWERASDF");
        assertEquals(StringOperator.captilize("qWeRaSdF"), "Input: qWeRaSdF\nThe capitalized string is: QWERASDF");
    }

    @Test
    void uncapitalizeTest() {
        assertEquals(StringOperator.uncaptilize("QWERASDF"), "Input: QWERASDF\nThe uncapitalized string is: qwerasdf");
        assertEquals(StringOperator.uncaptilize("qwerasdf"), "Input: qwerasdf\nThe uncapitalized string is: qwerasdf");
        assertEquals(StringOperator.uncaptilize("qWeRaSdF"), "Input: qWeRaSdF\nThe uncapitalized string is: qwerasdf");
    }

    @Test
    void alternateTest() {
        assertEquals(StringOperator.alternate("QWERASDF"), "Input: QWERASDF\nThe alternating string is: qWeRaSdF");
        assertEquals(StringOperator.alternate("qwerasdf"), "Input: qwerasdf\nThe alternating string is: qWeRaSdF");
        assertEquals(StringOperator.alternate("qWeRaSdF"), "Input: qWeRaSdF\nThe alternating string is: qWeRaSdF");
    }
}
