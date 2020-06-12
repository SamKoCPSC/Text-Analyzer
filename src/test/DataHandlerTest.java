import org.junit.jupiter.api.Test;
import superawesomepackage.DataHandler;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class DataHandlerTest {

    @Test
    void testSaveLoadClearDelete() {
        try {
            DataHandler.save("test", "testFile");
        } catch (IOException e) {
            fail();
        }

        try {
            String string = DataHandler.load("testFile");
            assertEquals("test\n", string);
        } catch (IOException e) {
            fail();
        }

        try {
            DataHandler.clear("testFile");
            String string = DataHandler.load("testFile");
            assertEquals(string, "");
        } catch (IOException e) {
            fail();
        }
    }
}
