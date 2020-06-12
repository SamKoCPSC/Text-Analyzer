//package placeholder;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import superawesomepackage.RepeatBot;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Scanner;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class RepeatBotTest {
//    private RepeatBot repeat;
//
//    @BeforeEach
//    void runBefore() {
//        repeat = new RepeatBot();
//    }
//
//    @Test
//    void testRepeatBot() {
//        RepeatBot r = new RepeatBot();
//        assertEquals("Repeat", r.getName());
//        r = new RepeatBot("asdf");
//        assertEquals("asdf", r.getName());
//    }
//
//    @Test
//    void testGetName() {
//        assertEquals("Repeat", repeat.getName());
//        repeat.setName("Fred");
//        assertEquals("Fred", repeat.getName());
//        repeat.setName("123");
//        assertEquals("123", repeat.getName());
//        repeat.setName("");
//        assertEquals("", repeat.getName());
//        repeat.setName("qwertyuiopasdfghjklzxcvbnm");
//        assertEquals("qwertyuiopasdfghjklzxcvbnm", repeat.getName());
//    }
//
//    @Test
//    void testSetName() {
//        repeat.setName("name");
//        assertEquals("name", repeat.getName());
//        repeat.setName("");
//        assertEquals("", repeat.getName());
//        repeat.setName("!@#$%^&*()");
//        assertEquals("!@#$%^&*()", repeat.getName());
//    }
//
//    @Test
//    void testGreeting() {
//        assertEquals("Hello, my name is " + repeat.getName()
//                + " I will repeat whatever you say to me (type quit to exit program)", repeat.greeting());
//        assertNotEquals("HELLO, MY NAME IS " + repeat.getName()
//                + " I WILL REPEAT WHATEVER YOU SAY TO ME (TYPE QUIT TO EXIT PROGRAM)", repeat.greeting());
//    }
//
//    /*@Test
//    void testReply() {
//        assertEquals("hi", repeat.reply("hi"));
//        assertEquals("", repeat.reply(""));
//        assertEquals("agrasafdsafbdhuaofdshabfd", repeat.reply("agrasafdsafbdhuaofdshabfd"));
//        assertEquals("1234567890", repeat.reply("1234567890"));
//        assertEquals("a1s2d3f4g5h6j7k8l9", repeat.reply("a1s2d3f4g5h6j7k8l9"));
//        assertEquals("Hi there, how are you?", repeat.reply("Hi there, how are you?"));
//        assertEquals(":(" , repeat.reply("I don't like you"));
//    }
//
//    @Test
//    void testLoad() {
//        RepeatBot test = new RepeatBot();
//        test.load("C:\\Users\\samk3\\Documents\\project_m2z2b(2)\\src\\main\\ui\\RepeatFile.txt");
//        assertEquals(test.lines.get(0), "hello");
//        assertEquals(test.lines.get(1), "world");
//    }
//
//    @Test
//    void testLoadException() {
//        RepeatBot test = new RepeatBot();
//        test.load("SuperNotAwesomeFileName.txt");
//        assertEquals(test.lines.size(), 0);
//    }
//
//    @Test
//    void testSave() throws IOException {
//        RepeatBot test = new RepeatBot();
//        test.reply("good bye");
//        test.save("C:\\Users\\samk3\\Documents\\project_m2z2b(2)\\src\\main\\ui\\RepeatFile.txt");
//        File file = new File("C:\\Users\\samk3\\Documents\\project_m2z2b(2)\\src\\main\\ui\\RepeatFile.txt");
//        Scanner scanner = new Scanner(file);
//        assertEquals(scanner.nextLine(), "good bye");
//    }
//
//    @Test
//    void testSaveException() throws FileNotFoundException {
//        RepeatBot test = new RepeatBot();
//        test.reply("hello");
//        test.save("SuperNotAwesomeFileName.txt");
//        File file = new File("C:\\Users\\samk3\\Documents\\project_m2z2b(2)\\src\\main\\ui\\RepeatFile.txt");
//        Scanner scanner = new Scanner(file);
//        assertEquals(scanner.nextLine(), "good bye");
//    }
//
//    @Test
//    void testAddRemove() {
//        RepeatBotList a = new RepeatBotList();
//        RepeatBot b = new RepeatBot();
//        a.addBot(b);
//        assertTrue(b.lists.contains(a));
//        a = new RepeatBotList();
//        b = new RepeatBot();
//        b.addList(a);
//        assertTrue(b.lists.contains(a));
//        a.removeBot(b);
//        assertTrue(!a.bots.contains(b));
//    }*/
//}