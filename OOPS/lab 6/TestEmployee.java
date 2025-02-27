class Employee {
    private String name;
    private int empid;
    private double salary;

    public Employee() {
        this.name = "";
        this.empid = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * percentage / 100;
        }
    }
}

class Manager extends Employee {
    private String department;

    public Manager() {
        super();
        this.department = "";
    }

    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee("vanshika", 101, 40000);
        System.out.println("Employee Name: " + e.getName());
        System.out.println("Employee Salary: " + e.getSalary());
        e.increaseSalary(10);
        System.out.println("Updated Salary: " + e.getSalary());

        Manager m = new Manager("priya", 102, 70000, "HR");
        System.out.println("Manager Name: " + m.getName());
        System.out.println("Manager Salary: " + m.getSalary());
        System.out.println("Manager Department: " + m.getDepartment());
        m.increaseSalary(15);
        System.out.println("Updated Manager Salary: " + m.getSalary());
    }
}
