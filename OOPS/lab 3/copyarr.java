import java.util.Arrays;
public class copyarr {
    public static void main(String[] args) {
        int[] arror = {1, 2, 3, 4, 5};
        int[] cparr = new int[arror.length];
        for (int i = 0; i < arror.length; i++) {
            cparr[i] = arror[i];
        }
        System.out.println("Original Array:- " + Arrays.toString(arror));
        
        System.out.println("Copied Array:- " + Arrays.toString(cparr));
    }
}

