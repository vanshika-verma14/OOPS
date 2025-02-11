abstract class Shape {
    String name;
    Shape(String name) {
        this.name = name;
    }
    
    abstract double area();
    public void displayName() {
        System.out.println("Shape: " + name);
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    double side;   
    Square(double side) {
        super("Square");
        this.side = side;
    }
    
    @Override
    double area() {
        return side * side;
    }
}

public class AbstractShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        
        circle.displayName();
        System.out.println("Area: " + circle.area());
        
        square.displayName();
        System.out.println("Area: " + square.area());
    }
}
