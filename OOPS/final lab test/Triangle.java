import java.util.Scanner;
public class Triangle {
    private double base;
    private double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }

    public void calculateArea() {
        System.out.println("The Area is - " + 0.5*base*height);;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter positive base and height : ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        if (b < 0 && h < 0) {
            System.out.println("INVALID INPUT");
        }
           else{           }
        Triangle t = new Triangle(b, h);
            t.calculateArea();
        } 
    }