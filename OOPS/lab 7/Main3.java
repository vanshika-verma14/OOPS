// Write a Java program to create an interface Bank with methods deposit(double amount) and withdraw(double amount). Implement this interface in a class Account that overrides these methods to perform deposit and withdrawal operations on a balance variable. Create another class BankDemo with a main() method to test the functionality by depositing and withdrawing amounts and displaying the updated balance.
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

class Account implements Bank {
    double bal = 0;
    public void deposit(double amount) {
        bal += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + bal);
    }
    public void withdraw(double amount) {
        if (amount <= bal) {
            bal -= amount;
            System.out.println("Withdrawn: " + amount + ", Balance: " + bal);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(100);
        a.withdraw(30);
        a.withdraw(80);
    }
}
