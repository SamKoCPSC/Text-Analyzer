//package placeholder;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import superawesomepackage.ReverseBot;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Scanner;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ReverseBotTest {
//    private ReverseBot reverse;
//
//    @BeforeEach
//    void runBefore() {
//        reverse = new ReverseBot();
//    }
//
//    @Test
//    void testReverseBot() {
//        ReverseBot r = new ReverseBot();
//        assertEquals("Reverse", r.getName());
//        r = new ReverseBot("asdf");
//        assertEquals("asdf", r.getName());
//    }
//
//    @Test
//    void testGetName() {
//        assertEquals("Reverse", reverse.getName());
//        reverse.setName("Fred");
//        assertEquals("Fred", reverse.getName());
//        reverse.setName("123");
//        assertEquals("123", reverse.getName());
//        reverse.setName("");
//        assertEquals("", reverse.getName());
//        reverse.setName("qwertyuiopasdfghjklzxcvbnm");
//        assertEquals("qwertyuiopasdfghjklzxcvbnm", reverse.getName());
//    }
//
//    @Test
//    void testSetName() {
//        reverse.setName("name");
//        assertEquals("name", reverse.getName());
//        reverse.setName("");
//        assertEquals("", reverse.getName());
//        reverse.setName("!@#$%^&*()");
//        assertEquals("!@#$%^&*()", reverse.getName());
//    }
//
//    @Test
//    void testGreeting() {
//        assertEquals("Hello, my name is " + reverse.getName()
//                + " I will reverse whatever you say to me (type quit to exit program)", reverse.greeting());
//        assertNotEquals("HELLO, MY NAME IS " + reverse.getName()
//                + " I WILL REVERSE WHATEVER YOU SAY TO ME (TYPE QUIT TO EXIT PROGRAM)", reverse.greeting());
//    }
//
//    @Test
//    void testReply() {
//        assertEquals("ih", reverse.reply("hi"));
//        assertEquals("", reverse.reply(""));
//        assertEquals("dfbahsdfoauhdbfasdfasarga", reverse.reply("agrasafdsafbdhuaofdshabfd"));
//        assertEquals("0987654321", reverse.reply("1234567890"));
//        assertEquals("9l8k7j6h5g4f3d2s1a", reverse.reply("a1s2d3f4g5h6j7k8l9"));
//        assertEquals("?uoy era woh ,ereht iH", reverse.reply("Hi there, how are you?"));
//        assertEquals("):" , reverse.reply("I don't like you"));
//    }
//
//    /*@Test
//    void testLoad() throws IOException {
//        ReverseBot test = new ReverseBot();
//        test.load("C:\\Users\\samk3\\Documents\\project_m2z2b(2)\\src\\main\\ui\\ReverseFile.txt");
//        assertEquals(test.lines.get(0), "olleh");
//        assertEquals(test.lines.get(1), "dlrow");
//    }
//
//    @Test
//    void testLoadException() {
//        ReverseBot test = new ReverseBot();
//        test.load("iLoVeCpSc210!?!?!?!?!.txt");
//        assertEquals(test.lines.size(), 0);
//    }
//
//    @Test
//    void testSave() throws IOException {
//        ReverseBot test = new ReverseBot();
//        test.reply("good bye");
//        test.save("C:\\Users\\samk3\\Documents\\project_m2z2b(2)\\src\\main\\ui\\ReverseFile.txt");
//        File file = new File("C:\\Users\\samk3\\Documents\\project_m2z2b(2)\\src\\main\\ui\\ReverseFile.txt");
//        Scanner scanner = new Scanner(file);
//        assertEquals(scanner.nextLine(), "eyb doog");
//    }
//
//    @Test
//    void testSaveException() throws FileNotFoundException {
//        ReverseBot test = new ReverseBot();
//        test.reply("hello");
//        test.save("iLoVeCpSc210!?!?!?!?!.txt");
//        File file = new File("C:\\Users\\samk3\\Documents\\project_m2z2b(2)\\src\\main\\ui\\ReverseFile.txt");
//        Scanner scanner = new Scanner(file);
//        assertEquals(scanner.nextLine(), "eyb doog");
//    }*/
//}
