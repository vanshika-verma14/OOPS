abstract class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    abstract void getSalary();
    abstract void showDetails();
}

class Manager extends Employee {
    double salary;
    Manager(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    void getSalary() {
        System.out.println("Salary: " + salary);
    }
    void showDetails() {
        System.out.println("Name: " + name + ", Role: Manager, Salary: " + salary);
    }
}

class Developer extends Employee {
    double rate;
    int hours;
    Developer(String name, double rate, int hours) {
        super(name);
        this.rate = rate;
        this.hours = hours;
    }
    void getSalary() {
        System.out.println("Salary: " + (rate * hours));
    }
    void showDetails() {
        System.out.println("Name-  " + name + ", Role: Developer, Salary: " + (rate * hours));
    }
}

public class Main2 {
    public static void main(String[] args) {
        Manager alice = new Manager("vanshika", 70000);
        Developer bob = new Developer("anu", 50, 160);
        alice.showDetails();
        alice.getSalary();
        bob.showDetails();
        bob.getSalary();
    }
}
