
public class q2 {
    public static void main(String[] args) {
        int[] arr= {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missnum(arr));
    }
    public static int missnum(int[] arr) {
        int sum1 = 0;
        int n = arr.length;
        int sum2 = n*(n+1)/2;
        for (int i : arr) {
            sum1+=i;
        }
       return sum2-sum1;
    }
}
