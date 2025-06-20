import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an index (0-4) to access: ");
        int index = sc.nextInt();

        try {
            System.out.println("Element at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Please enter a valid index between 0 and 4.");
        } finally {
            System.out.println("Array access attempted.");
        }

        sc.close();
    }
}
