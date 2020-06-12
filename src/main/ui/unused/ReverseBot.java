//package superawesomepackage;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ReverseBot extends Bot {
//    public ArrayList<String> lines;
//
//    // EFFECTS: name is initialized as ReverseBot
//    public ReverseBot() {
//        name = "Reverse";
//        lines = new ArrayList<String>(0);
//    }
//
//    // EFFECTS: name is initialized to n
//    public ReverseBot(String n1) {
//        name = n1;
//        lines = new ArrayList<String>(0);
//    }
//
//    // Outputs a greeting to the user, and asks for user input
//    // EFFECTS: returns a String stating the name field
//    public String greeting() {
//        return "Hello, my name is " + getName() + " I will reverse whatever you say to me (type quit to exit program";
//    }
//
//    // Outputs a reversed String of whatever the user has typed
//    // EFFECTS: returns a reversed String
//    public String reply(String input) {
//        try {
//            if (input.equalsIgnoreCase("I don't like you")) {
//                throw new FeelsBadException("):");
//            }
//            String reverse = "";
//            for (int i = input.length() - 1; i >= 0; i--) {
//                reverse = reverse + input.charAt(i);
//            }
//            lines.add(reverse);
//            return reverse;
//        } catch (FeelsBadException e) {
//            return e.getMessage();
//        } finally {
//            System.out.println();
//        }
//    }

    //public void save(String filename) throws FileNotFoundException {
    //    File file = new File(filename);
    //   PrintWriter output = new PrintWriter(file);
    //    printToFile(file,output);
    //    /*for (int i = 0; i < lines.size(); i++) {
    //        output.println(lines.get(i));
    //    }*/
    //    output.close();
    //}

    /*public void printToFile(File f, PrintWriter out) {
        for (int i = 0; i < lines.size(); i++) {
            out.println(lines.get(i));
        }
    }*/

    //public void load(String filename) {
    //    try {
    //        File file = new File(filename);
    //        Scanner scanner = new Scanner(file);
    //        addInLines(file, scanner);
    //        /*while (scanner.hasNextLine()) {
    //            lines.add(scanner.nextLine());
    //        }*/
    //    } catch (FileNotFoundException e) {
    //        e.getMessage();
    //    }
    //}

    /*public void addInLines(File f, Scanner s) {
        while (s.hasNextLine()) {
            lines.add(s.nextLine());
        }
    }*/
//}
