import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input for student details
        System.out.print("Enter student's name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter student's roll number: ");
        String rollNumber = sc.nextLine();
        
        System.out.print("Enter student's grade: ");
        String grade = sc.nextLine();
        
        // Writing to the file
        try (FileWriter writer = new FileWriter("student.txt", true)) {
            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            System.out.println("Student data successfully written to file.");
        } catch (IOException e) {
            System.out.println("Error: An error occurred while writing to the file.");
        }

        sc.close();
    }
}
