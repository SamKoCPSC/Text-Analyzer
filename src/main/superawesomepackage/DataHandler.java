package superawesomepackage;

import java.io.*;

public class DataHandler {

    // EFFECTS: Saves and appends the input string to a file with name filename,
    // new file will be created if it does not exist
    public static void save(String input, String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\samk3\\"
                + "Documents\\project_m2z2b(2)\\src\\main\\ui\\" + filename + ".txt"));
        writer.append(input);
        writer.close();
    }

    // REQUIRES: .txt file name to exist in directory C:\\Users\\samk3\\Documents\\project_m2z2b(2)\\src\\main\\ui\\
    // EFFECTS: returns a string with data inside filename.txt, throws FileNotFoundException when file is not found
    public static String load(String filename) throws IOException {
        File file = new File("C:\\Users\\samk3\\"
                + "Documents\\project_m2z2b(2)\\src\\main\\ui\\" + filename + ".txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String output = "";
        String string;
        while ((string = reader.readLine()) != null) {
            output += string + '\n';
        }
        reader.close();
        return output;
    }

    // REQUIRES: .txt file name to exist in directory C:\\Users\\samk3\\Documents\\project_m2z2b(2)\\src\\main\\ui\\
    // EFFECTS: clears all data in filename.txt, throws FileNotFoundException when file is not found
    public static void clear(String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\samk3\\"
                + "Documents\\project_m2z2b(2)\\src\\main\\ui\\" + filename + ".txt"));
        writer.write("");
        writer.close();
    }

    // REQUIRES: .txt file name to exist in directory C:\\Users\\samk3\\Documents\\project_m2z2b(2)\\src\\main\\ui\\
    // EFFECTS: clears all data in filename.txt, throws FileNotFoundException when file is not found
    public static void delete(String filename) throws FileNotFoundException {
        File file = new File("C:\\Users\\samk3\\"
                + "Documents\\project_m2z2b(2)\\src\\main\\ui\\" + filename + ".txt");
        boolean deleted = file.delete();
        if (!deleted) {
            throw new FileNotFoundException();
        }
    }
}

