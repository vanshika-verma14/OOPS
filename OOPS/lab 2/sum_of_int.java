import java.util.ArrayList;
import java.util.List;
public class sum_of_int {
public static void main(String[] args) {
    System.out.println("Sum is - " + sum());  
    }


public static int sum() {
    int sum = 0;
    List<Integer> list = new ArrayList<>();

    for (int i = 10; i <= 950; i++) {
        if(i % 6 == 0 && i % 9 == 0) {
            sum += i;
            list.add(i);
        }
        
    }
    System.out.println("Numbers divisible by both 6 and 9: " + list);
    return sum;
}
}