import java.util.Scanner;

class sclass {
    private double balance = 5698;
    public  double getbalance() {
        return balance;
    }
}
class subclass extends sclass{
   void checkbal()  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your password: ");
    int pass = sc.nextInt();
    if(pass == 1234)
   { 
    System.out.println("Your current balance is: " + getbalance());
   }
  else{
        System.out.println("Invalid password.");
    }
   }     
    }
public class pass{
    public static void main(String[] args) {
        subclass obj = new subclass();
        obj.checkbal();
    }
}

