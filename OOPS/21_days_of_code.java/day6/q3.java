// Find the Length of the Longest Consecutive Increasing Subarray
// A problem that introduces subarray analysis and consecutive pattern tracking.
// Problem Statement: Given an array nums of size n, find the length of the longest contiguous subarray where each element is strictly greater than the previous one (by 1).
// This problem introduces you to subarray analysis and teaches you how to track consecutive increasing patterns, which is essential for sequence recognition and dynamic programming techniques.
// Your task: Find the length of the longest contiguous subarray with consecutive increasing elements.
// Examples
// Input: nums = [1, 2, 2, 3, 4, 1, 2, 3, 4, 5] Output: 5 (subarray: [1, 2, 3, 4, 5])
// Input: nums = [5, 4, 3, 2] Output: 1
// Input: nums = [1, 2, 3, 5, 6, 7] Output: 3 (subarray: [5, 6, 7])
public class q3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7,8,9,10};
       System.out.println(check(arr));
}
public static int check(int[] arr){
    if (arr == null || arr.length == 0) 
    return 0;
    int c = 1;
    int i = 0;
    int max = 1;
    while ( i < arr.length-1) {
        if(arr[i]== arr[i+1]-1 ){
         c++;
        }
        else {
        max = Math.max(max, c);
        c = 1;
        }
        i++; 
    }
    return max = Math.max(max, c);
}
}
