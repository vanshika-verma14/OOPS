abstract class Payment {
    abstract void makePayment(double amount);
    
    public void processTransaction(double amount) {
        System.out.println("Processing transaction of: $" + amount);
    }
}
class CreditCardPayment extends Payment {
    @Override
    void makePayment(double amount) {
        processTransaction(amount);
        System.out.println("Payment of $" + amount + " made using Credit Card.");
    }
}
class PayPalPayment extends Payment {
    @Override
    void makePayment(double amount) {
        processTransaction(amount);
        System.out.println("Payment of $" + amount + " made using PayPal.");
    }
}
public class PaymentSystem {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment paypal = new PayPalPayment();
        creditCard.makePayment(100.50);
        paypal.makePayment(200.75);
    }
}
