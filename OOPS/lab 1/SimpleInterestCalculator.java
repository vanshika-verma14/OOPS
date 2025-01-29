import java.util.Scanner;

public class  SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount - ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate - ");
        double r = sc.nextDouble();
        System.out.print("Enter the time in years - ");
        double time = sc.nextDouble();
        SimpleInterestCalculator ob = new SimpleInterestCalculator();
        System.out.println("Interest is - " + ob.calculateInterest(p, r, time));
        sc.close();
       }
    public  double calculateInterest(double p, double r, double t) {         
    return (p*r*t)/100;
    }
}
   