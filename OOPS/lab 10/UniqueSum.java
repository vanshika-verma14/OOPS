import java.util.ArrayList;
import java.util.HashSet;

public class UniqueSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(5);
        
        // Convert ArrayList to HashSet to remove duplicates
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
        
        // Calculate the sum of unique numbers
        int sum = 0;
        for (int num : uniqueNumbers) {
            sum += num;
        }
        
        // Output unique numbers and the sum
        System.out.println("Unique values: " + uniqueNumbers);
        System.out.println("Sum: " + sum);
    }
}
