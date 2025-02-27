import java.util.Scanner;
abstract class call {
    int d;
    abstract double getCharge();
}
class Ordinary extends call {
    Ordinary(int d) { this.d = d; }
    double getCharge() {
         return d * 1.0;
         }
}
class Urgent extends call {
    Urgent(int d) { this.d = d; }
    double getCharge() { 
        return d * 1.5; 
    }
}
class Lightning extends call {
    Lightning(int d) { 
        this.d = d;
     }
    double getCharge() { 
        return d * 2.0;
     }
}
public class TrunkCall {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter duration: ");
        int d = s.nextInt();
        System.out.print("Enter type (O/U/L): ");
        char t = s.next().charAt(0);
        call c;
        if (t == 'O' || t == 'o') c = new Ordinary(d);
        else if (t == 'U' || t == 'u') c = new Urgent(d);
        else c = new Lightning(d);
        System.out.println("Total charge: " + c.getCharge());
      
    }
}
