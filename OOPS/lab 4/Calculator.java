public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c ) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("Sum of two integers: " + cal.add(5, 10));
        System.out.println("Sum of two doubles: " + cal.add(5.5, 2.3));
        System.out.println("Sum of integers: " + cal.add(1, 2, 3));
    }
}
