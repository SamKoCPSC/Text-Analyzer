import org.junit.jupiter.api.Test;
import superawesomepackage.StringGenerator;

import static org.junit.jupiter.api.Assertions.*;

public class StringGeneratorTest {
    @Test
    void randomStringTest() {
        assertTrue(StringGenerator.randomString().length() < 50);
        assertTrue(StringGenerator.randomString().length() < 50);
        assertTrue(StringGenerator.randomString().length() < 50);
        assertTrue(StringGenerator.randomString().length() < 50);
        assertTrue(StringGenerator.randomString().length() < 50);
        assertTrue(StringGenerator.randomString().length() < 50);
        assertTrue(StringGenerator.randomString().length() < 50);
        assertTrue(StringGenerator.randomString().length() < 50);
        assertTrue(StringGenerator.randomString().length() < 50);
        assertTrue(StringGenerator.randomString().length() < 50);
        assertTrue(StringGenerator.randomString().length() < 50);
        assertTrue(StringGenerator.randomString().length() < 50);
        assertTrue(StringGenerator.randomString().length() < 50);
        assertTrue(StringGenerator.randomString().length() < 50);
        assertTrue(StringGenerator.randomString().length() < 50);
        assertTrue(StringGenerator.randomString().length() < 50);
        assertTrue(StringGenerator.randomString().length() < 50);
        assertTrue(StringGenerator.randomString().length() < 50);
        assertTrue(StringGenerator.randomString().length() < 50);
    }

    @Test
    void randomNumberTest() {
        assertTrue(StringGenerator.randomNumbers().matches("[0-9]*"));
        assertTrue(StringGenerator.randomNumbers().matches("[0-9]*"));
        assertTrue(StringGenerator.randomNumbers().matches("[0-9]*"));
        assertTrue(StringGenerator.randomNumbers().matches("[0-9]*"));
    }

    @Test
    void randomLetterTest() {
        assertTrue(StringGenerator.randomLetters().matches("[a-zA-Z]*"));
        assertTrue(StringGenerator.randomLetters().matches("[a-zA-Z]*"));
        assertTrue(StringGenerator.randomLetters().matches("[a-zA-Z]*"));
        assertTrue(StringGenerator.randomLetters().matches("[a-zA-Z]*"));

    }

    @Test
    void randomUppercaseTest() {
        assertTrue(StringGenerator.randomUppercase().matches("[A-Z]*"));
        assertTrue(StringGenerator.randomUppercase().matches("[A-Z]*"));
        assertTrue(StringGenerator.randomUppercase().matches("[A-Z]*"));
        assertTrue(StringGenerator.randomUppercase().matches("[A-Z]*"));
    }

    @Test
    void randomLowercaseTest() {
        assertTrue(StringGenerator.randomLowercase().matches("[a-z]*"));
        assertTrue(StringGenerator.randomLowercase().matches("[a-z]*"));
        assertTrue(StringGenerator.randomLowercase().matches("[a-z]*"));
        assertTrue(StringGenerator.randomLowercase().matches("[a-z]*"));
    }
}
