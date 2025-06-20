import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        // Try to read the file
        try (FileReader reader = new FileReader("student.txt")) {
            int character;
            // Reading and displaying file content character by character
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file path.");
        } catch (IOException e) {
            System.out.println("Error: An issue occurred while reading the file.");
        }
    }
}

