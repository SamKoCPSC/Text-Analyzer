//package ui;
//
//import network.WebBot;
//import superawesomepackage.Observer;
//import superawesomepackage.Subject;
//import superawesomepackage.RepeatBot;
//import superawesomepackage.ReverseBot;
//
//import java.io.IOException;
//import java.util.Scanner;
//
//public class RunBots extends Subject {
//    private static RepeatBot repeat = new RepeatBot();
//    private static ReverseBot reverse = new ReverseBot();
//    private static WebBot web = new WebBot();
//    private static Scanner scanner = new Scanner(System.in);
//    private static String input = "";
//
//    public RunBots() {
//        addObserver(web);
//    }
//
//    public void run() throws IOException {
//        //repeat.load("C:\\Users\\samk3\\Documents\\project_m2z2b\\src\\main\\ui\\RepeatFile.txt");
//        //reverse.load("C:\\Users\\samk3\\Documents\\project_m2z2b\\src\\main\\ui\\ReverseFile.txt");
//        while (!input.equals("exit")) {
//            System.out.println("Hello, type 1, 2, or 3");
//            input = scanner.nextLine();
//            if (input.equals("1")) {
//                useRepeatBot();
//            } else if (input.equals("2")) {
//                useReverseBot();
//            } else if (input.equals("3")) {
//                useWebBot();
//            } else if (input.equals("exit")) {
//                System.out.println("Program stopping");
//            } else {
//                System.out.println("Sorry I don't understand, please try again");
//            }
//        }
//        //repeat.save("C:\\Users\\samk3\\Documents\\project_m2z2b\\src\\main\\ui\\RepeatFile.txt");
//        //reverse.save("C:\\Users\\samk3\\Documents\\project_m2z2b\\src\\main\\ui\\ReverseFile.txt");
//    }
//
//    public void useRepeatBot() {
//        System.out.println(repeat.greeting());
//        while (!input.equalsIgnoreCase("quit")) {
//            input = scanner.nextLine();
//            System.out.println(repeat.reply(input));
//            System.out.println();
//        }
//    }
//
//    public void useReverseBot() {
//        System.out.println(reverse.greeting());
//        while (!input.equalsIgnoreCase("quit")) {
//            input = scanner.nextLine();
//            System.out.println(reverse.reply(input));
//            System.out.println();
//        }
//    }
//
//    public void useWebBot() throws IOException {
//        System.out.println(web.greeting());
//        System.out.println("Type anything to see the CPSC 210 welcome message");
//        while (!input.equalsIgnoreCase("quit")) {
//            input = scanner.nextLine();
//            notifyObserver();
//            web.reply();
//        }
//        System.out.println("Number of messages printed: " + web.counter);
//    }
//
//    @Override
//    public void addObserver(Observer o) {
//        list.add(o);
//    }
//
//    @Override
//    public void notifyObserver() {
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).update();
//        }
//    }
//}
