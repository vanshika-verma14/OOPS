
public class constructor_301 {
    public static void main(String[] args) {
        // student s1 = new student("vanshika" , 14);
        // student s2 = new student("jahanvi" , 23);
        // System.out.println(s1.name + " " + s1.roll_no);
        // System.out.println(s2.name + " " +s2.roll_no);
        test t = new test(22.7);
    }
}
 class student{
    String name ;
    int roll_no;
   student(String name , int num){
    this.name = name;
    this.roll_no = num;
   }
 }
 class test{
   test(double d){
   this(10);// int in braket so passed on to int constructor
   System.out.println("double given");
   }
   test(int i){
    this(); // on coming heree since this has nothing in bracket it will go down to default constructor
    System.out.println("int given");
    }
    test(){
        System.out.println("no given"); // finally first this constructor gets printed out
        }
 }