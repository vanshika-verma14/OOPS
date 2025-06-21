// Check if Array is Fully Increasing
// A problem that teaches sequence validation and introduces monotonic array concepts.
// Problem Statement: Given an array of integers nums, return true if each number is strictly greater than the one before it. Otherwise, return false.
// Note: The array must strictly increase — no equal numbers allowed.
// This problem helps you validate monotonic sequences, which are crucial in sorted data analysis and many algorithmic applications.
// Your task: Return true if the array is strictly increasing, otherwise return false.
// Examples
// Input: nums = [1, 2, 3, 4] Output: true
// Input: nums = [1, 2, 2, 3] Output: false
// Input: nums = [5, 4, 3] Output: false
public class q2 {
    public static void main(String[] args) {
            int[] arr = {5, 4, 3};
           System.out.println(incre(arr));
    }
    public static boolean incre(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] >=arr[i+1] )
            return false;
        }
        return true;
    }
}
