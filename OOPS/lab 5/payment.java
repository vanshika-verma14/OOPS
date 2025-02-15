//Define a Worker class with DailyWorker and SalariedWorker as its subclasses. Each worker has a name and salary rate. Implement a method computePay(int hours) to compute weekly pay. DailyWorker is paid based on the number of days worked (assuming 8 hours per day), whereas SalariedWorker receives a fixed wage for 40 hours per week, regardless of actual hours worked. Use polymorphism to implement this program and test worker salary calculations. 
class Worker {
     String name;
     double salrate;
    public Worker(String name, double srate) { 
        this.name = name;
        this.salrate = srate;
}
    public double computePay(int hours) {
        return 0;
    }
  }
class DailyWorker extends Worker {
    public DailyWorker(String name, double srate) {
        super(name, srate);
    }
    @Override
    public double computePay(int hrs) {
        int workdays = hrs / 8;
        return workdays * salrate;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double srate) {
        super(name, srate);
    }
      @Override
    public double computePay(int hours) {
        return salrate * 40;
    }
}
public class payment {
    public static void main(String[] args) {
        Worker dailyWorker = new DailyWorker("Karan", 110);
        System.out.println("Salary of "+ dailyWorker.name + " is: " + dailyWorker.computePay(48));
        Worker salariedWorker = new SalariedWorker("Rahul", 44);
        System.out.println("Salary of "+salariedWorker.name + " is:- " + salariedWorker.computePay(45));
    }
}

