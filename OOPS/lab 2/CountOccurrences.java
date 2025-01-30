class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5, 6};
        int target = 2;
        int cnt = 0;       
        for (int i : arr) {
            if (i == target) {
                cnt++;
            }
        }
        System.out.println("The number " + target + " appears " + cnt + " times");
    }
}