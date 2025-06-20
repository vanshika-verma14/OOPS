public class nestedclass {
    private int amt = 50;

    public static void main(String[] args) {
        nestedclass outer = new nestedclass();
         class inner{
            public static void display(){
                System.out.println("Amount: " + outer.amt);
            }
            public static void getAmt()
            {
                System.out.println(amt);
            }
        }

    }
}
