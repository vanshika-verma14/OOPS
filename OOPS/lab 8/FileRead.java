import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    
    // Method that throws FileNotFoundException
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);
        
        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
        }
        fileScanner.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        try {
            readFile(fileName);  // Calling the method that may throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file path.");
        } finally {
            System.out.println("File operation attempted.");
        }

        sc.close();
    }
}
