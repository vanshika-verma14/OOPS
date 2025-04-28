import java.util.ArrayList;

public class PrimeCheck {
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(9);
        numbers.add(11);
        
        for (Integer num : numbers) {
            int unboxedNum = num;
            if (isPrime(unboxedNum)) {
                System.out.println(unboxedNum + " is a prime number.");
            } else {
                System.out.println(unboxedNum + " is not a prime number.");
            }
        }
    }
}
