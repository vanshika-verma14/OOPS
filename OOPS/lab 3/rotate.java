public class rotate {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int k = 2;
            k = k % arr.length;
    
            int[] temp = new int[arr.length];
            for (int i = 0; i < k; i++) {
                temp[i] = arr[arr.length - k + i];
            }
            for (int i = k; i < arr.length; i++) {
                temp[i] = arr[i - k];
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = temp[i];
            }
            System.out.print("Rotated Array: [");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }