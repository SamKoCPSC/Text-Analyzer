package superawesomepackage;

public class StringAnalyzer {

    // EFFECTS: returns the input and the length of the input string
    public static String characterCount(String input) {
        return "Input: " + input + "\n" + "There are " + Integer.toString(input.length()) + " characters";
    }

    // EFFECTS: returns the input and the amount of letters in the input string
    public static String letterCount(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                count++;
            }
        }
        return "Input: " + input + "\n" + "There are " + Integer.toString(count) + " letters";
    }

    // EFFECTS: returns the input and the amount of numbers in the input string
    public static String numberCount(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                count++;
            }
        }
        return "Input: " + input + "\n" + "There are " + Integer.toString(count) + " numbers";
    }

    // EFFECTS: returns the input and the amount of spaces in the input string
    public static String spaceCount(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                count++;
            }
        }
        return "Input: " + input + "\n" + "There are " + Integer.toString(count) + " spaces";
    }

    // EFFECTS: returns the input and the amount of punctuations in the input string
    public static String punctuationCount(String input) {
        int count = 0;
        String punctuations = "!?.,;:";
        for (int i = 0; i < input.length(); i++) {
            if (punctuations.contains(Character.toString(input.charAt(i)))) {
                count++;
            }
        }
        return "Input: " + input + "\n" + "There are " + Integer.toString(count) + " punctuations";
    }
}
