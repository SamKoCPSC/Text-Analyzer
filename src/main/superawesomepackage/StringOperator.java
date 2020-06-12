package superawesomepackage;

import java.util.ArrayList;

public class StringOperator {

    // EFFECTS: returns the input string and the reverse of the input
    public static String reverse(String input) {
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        return "Input: " + input + "\n" + "The reverse string is: " + reverse;
    }

    // EFFECTS: returns the input string and a randomized order of the input
    public static String shuffle(String input) {
        String shuffle = "";
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            characters.add(input.charAt(i));
        }
        while (characters.size() != 0) {
            int rand = (int)(Math.random() * characters.size());
            shuffle += characters.remove(rand);
        }
        return "Input: " + input + "\n" + "The shuffled string is: " + shuffle;
    }

    // EFFECTS: returns the input string and a capitalized input, non letter characters are unaffected
    public static String captilize(String input) {
        String capital = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLowerCase(input.charAt(i))) {
                capital += Character.toUpperCase(input.charAt(i));
            } else {
                capital += input.charAt(i);
            }
        }
        return "Input: " + input + "\n" + "The capitalized string is: " + capital;
    }

    // EFFECTS: returns the input string and an uncapitalized input, non letter characters are unaffected
    public static String uncaptilize(String input) {
        String uncapital = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                uncapital += Character.toLowerCase(input.charAt(i));
            } else {
                uncapital += input.charAt(i);
            }
        }
        return "Input: " + input + "\n" + "The uncapitalized string is: " + uncapital;
    }

    // EFFECTS: returns the input string and the same string with alternating uppercase and lowercase letters
    public static String alternate(String input) {
        String sarcasm = "";
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                sarcasm += Character.toLowerCase(input.charAt(i));
            } else {
                sarcasm += Character.toUpperCase(input.charAt(i));
            }
        }
        return "Input: " + input + "\n" + "The alternating string is: " + sarcasm;
    }

}
