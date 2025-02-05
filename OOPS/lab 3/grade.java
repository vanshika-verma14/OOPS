import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int num = sc.nextInt();
        double sum = 0.0;
        for (int i = 0; i < num;i++) {
            System.out.println("Enter marks in subject " +  (i+1) + " :- ");
            double sub = sc.nextDouble(); 
            sum += sub; 
        }
        double grade = (sum/(num*100))*100;
        if(grade>=90)
        System.out.println("Grade A :-" + grade);
        else if(grade>=75 && grade < 90)
        System.out.println("Grade B :-" + grade);
        else if(grade>=50 && grade < 75)
        System.out.println("Grade C :-" + grade);
        else
        System.out.println("Grade F :-" + grade);
    }
}
