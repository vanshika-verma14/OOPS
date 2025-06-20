// Write a Java program to create an abstract class Shape with an abstract method calculateArea(). Derive two classes Rectangle and Circle from Shape and override the calculateArea() method to calculate and print the area of a rectangle and a circle, respectively. Use the main() method to create objects of Rectangle and Circle and test their calculateArea() methods.

abstract class Shape {
    abstract void getArea();
}

class Box extends Shape {
    double length, width;
    Box(double l, double w) {
        length = l;
        width = w;
    }
    void getArea() {
        System.out.println("Box Area: " + (length * width));
    }
}

class Round extends Shape {
    double radius;
    Round(double r) {
        radius = r;
    }
    void getArea() {
        System.out.println("Round Area: " + (Math.PI * radius * radius));
    }
}

public class Main1 {
    public static void main(String[] args) {
        Box box = new Box(5, 10);
        Round round = new Round(7);
        box.getArea();
        round.getArea();
    }
}
