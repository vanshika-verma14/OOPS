class MathConstants {
    final double PI = 3.14159;
    final void displayPI() {
        System.out.println("PI is  " + PI);
    }
}

class Circle extends MathConstants {
    void calculateArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area: " + area);
    }
}

public class finalcheck {
    public static void main(String[] args) 
    {
        Circle c = new Circle();
        c.displayPI();
        c.calculateArea(5) ;
        // c.PI = 3.14;  //error
        // @Override
        // void displayPI() { System.out.println("New PI"); } // error
    }
}
