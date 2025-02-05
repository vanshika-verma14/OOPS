public class uninumber {
  public static void main(String[] args) {
    int[] arr = {1, 5, 6, 2, 4};
        int n = 6;
        int missnum = find(arr, n);
        System.out.println("The missing number is: " + missnum);
  }  
  public static int find(int[] arr, int n) {
    int sum = n * (n + 1) / 2;
    int orisum = 0;
    for (int num : arr) {
        orisum += num;
    }
    return sum - orisum;
}
}
