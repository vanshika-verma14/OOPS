import java.util.Scanner;
    class SumOfDigits {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();
            int sum = 0;
            while (num != 0) {
                int r = num % 10; 
                sum += r;           
                num /= 10;          
            }
            System.out.println("Sum of digits: " + sum);
        }
    }  

