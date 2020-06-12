package superawesomepackage;

public class StringGenerator {
    public static String randomString() {

        // EFFECTS: returns a random string of basic ASCII characters that is at most 100 characters long
        return generateRandomAscii(32, 95);
    }

    // EFFECTS: returns a random string of numbers that is at most 100 characters long
    public static String randomNumbers() {
        return generateRandomAscii(48,10);
    }

    // EFFECTS: returns a random string of uppercase letters that is at most 100 characters long
    public static String randomUppercase() {
        return generateRandomAscii(65, 26);
    }

    // EFFECTS: returns a random string of lowercase letters that is at most 100 characters long
    public static String randomLowercase() {
        return generateRandomAscii(97, 26);
    }

    // EFFECTS: returns a random string of letters that is at most 100 characters long
    public static String randomLetters() {
        int rand = (int) (Math.random() * 100);
        String string = "";
        for (int i = 0; i < rand; i++) {
            int x = (int) (Math.random() * 52);
            char c = (x < 26) ? 'A' : 'a';
            string = string + (char)(c + x % 26);
        }
        return string;
    }

    private static String generateRandomAscii(int min, int range) {
        int rand = (int) (Math.random() * 100);
        String string = "";
        for (int i = 0; i < rand; i++) {
            char c = (char)(Math.random() * range + min);
            string = string + c;
        }
        return string;
    }
}
