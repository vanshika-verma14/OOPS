import java.util.ArrayList;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class EmployeeList {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Alice", 101, 50000));
        employees.add(new Employee("Bob", 102, 55000));
        employees.add(new Employee("Charlie", 103, 60000));

        employees.get(1).updateSalary(60000); // Update Bob's salary

        employees.removeIf(emp -> emp.id == 101); // Remove employee with ID 101 (Alice)

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
