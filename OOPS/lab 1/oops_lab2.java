import java.util.Scanner;
public class oops_lab2 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the base of triangle - ");
    double base = sc.nextDouble();
    System.out.print("Enter the height of triangle - ");
    double height = sc.nextDouble();
    System.out.println("Area of triangle - " + tri_area(base, height));
   }
   public static double tri_area(double base, double height){
     return 0.5 * base * height;
   }

}
