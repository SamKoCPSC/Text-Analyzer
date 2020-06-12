//package superawesomepackage;
//
//import ui.unused.RepeatBotList;
//
//import java.util.ArrayList;
//
//public class RepeatBot extends Bot {
//    public ArrayList<String> lines;
//    public ArrayList<RepeatBotList> lists;
//
//    //EFFECTS: name is initialized as RepeatBot
//    public RepeatBot() {
//        name = "Repeat";
//        lines = new ArrayList<String>(0);
//        lists = new ArrayList<>();
//    }
//
//    // EFFECTS: name is initialized to String parameter n
//    public RepeatBot(String n1) {
//        name = n1;
//        lines = new ArrayList<String>(0);
//        lists = new ArrayList<>();
//    }
//
//    // Outputs a greeting to the user, and asks for user input
//    // EFFECTS: returns a String stating the name field
//    public String greeting() {
//        return "Hello, my name is " + getName() + " I will repeat whatever you say to me (type quit to exit program)";
//    }
//
//    // Reflects whatever the user has typed
//    // EFFECTS: returns the input parameter
//    public String reply(String input) {
//        try {
//            if (input.equalsIgnoreCase("I don't like you")) {
//                throw new FeelsBadException(":(");
//            }
//            lines.add(input);
//            return input;
//        } catch (FeelsBadException e) {
//            return e.getMessage();
//        } finally {
//            System.out.println();
//        }
//    }

//    public void save(String filename) throws FileNotFoundException {
//        File file = new File(filename);
//        PrintWriter output = new PrintWriter(file);
//        printToFile(file,output,lines);
//        for (int i = 0; i < lines.size(); i++) {
//            output.println(lines.get(i));
//        }
//        output.close();
//    }
//
//    public static void printToFile(File f, PrintWriter out, ArrayList<String> lines) {
//        for (int i = 0; i < lines.size(); i++) {
//            out.println(lines.get(i));
//        }
//    }
//
//    public void load(String filename) {
//        try {
//            File file = new File(filename);
//            Scanner scanner = new Scanner(file);
//            addInLines(file, scanner);
//            /*while (scanner.hasNextLine()) {
//                lines.add(scanner.nextLine());
//            }*/
//        } catch (FileNotFoundException e) {
//            e.getMessage();
//        }
//    }
//
//    public void addInLines(File f, Scanner s) {
//        while (s.hasNextLine()) {
//            lines.add(s.nextLine());
//        }
//    }
//
//    public void addList(RepeatBotList b) {
//        if (!lists.contains(b)) {
//            lists.add(b);
//            b.addBot(this);
//        }
//    }
//
//    public void removeList(RepeatBotList b) {
//        if (lists.contains(b)) {
//            lists.remove(b);
//            b.removeBot(this);
//        }
//    }
//
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        RepeatBot temp = (RepeatBot) obj;
//        return name.equals(temp.getName());
//    }
//}
