abstract class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id) {
        this.name = name ;
        this.id = id;
    }

    public abstract void calculateSalary();
    public abstract void displayDetails();

    public double calculateTax() {
        if (salary <= 50000) {
            return salary * 0.1;
        } 
        else if (salary <= 100000) {
            return salary * 0.2;
        }
         else {
            return salary * 0.3;
        }
    }

    public void upname(String nname) {
        synchronized(this) {
            this.name = nname;
        }
    }
    public void  upid(int nid) {
        synchronized (this) {
            this.id = nid ;
        }}
}

// Manager class with stock options based on team size
class Manager extends Employee {
    private int teamSize;
    public Manager(String name, int id, int teamsize) {
        super(name, id);
        this.teamSize = teamsize;
    }

    @Override
    public void calculateSalary() {
        double bsal = 70000;
        double sopt = teamSize * 1000; // $1000 per team member
        this.salary = bsal + sopt;
    }

    @Override
    public void displayDetails() {
       
        System.out.println("Name: " + name);
        System.out.println("Manager ID: " + id);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Salary: $" + salary);
        System.out.println("Tax: $" + calculateTax());
    }
}

// deloper class 
class deloper extends Employee {
    private int pcomp; 
    public deloper(String name, int id, int pcomp) {
        super(name, id);
        this.pcomp = pcomp;
    }
    @Override
    public void calculateSalary() {
        double bsal = 60000;
        double bonus = pcomp * 1000; 
        this.salary = bsal + bonus;}

    @Override
    public void displayDetails() {
        
        System.out.println("Name: " + name);
        System.out.println("deloper ID: " + id);
        System.out.println("Project Complexity: " + pcomp);
        System.out.println("Salary: $" + salary);
        System.out.println("Tax: $" + calculateTax());
    }}
// Main class
public class Company {
    public static void main(String[] args) {
        Manager m = new Manager("Vanshika", 100, 5);
        m.calculateSalary();
        m.displayDetails();
        deloper d = new deloper("Riya", 202, 7);
        d.calculateSalary();
        d.displayDetails();
        // for  updates
        m.upname("Vanshika verma");
        d.upid(210);
    }
}
