// 1. Find Duplicates in Array
// A problem that teaches duplicate detection using mathematical constraints and the pigeonhole principle.
// Problem Statement: Given an integer array of n+1 integers where each integer is between 1 and n (inclusive), find one duplicate number that appears in the array.
// By the pigeonhole principle, at least one duplicate must exist since we have n+1 numbers in the range 1 to n. This problem teaches you about detecting duplicates and understanding mathematical constraints in array problems.
// Your task: Find one duplicate number that appears in the array.
// Examples
// Input: nums = [1, 3, 4, 2, 2]
// Output: 2 Explanation: The number 2 appears twice in the array.
// Input: nums = [3, 1, 3, 4, 2] 
// Output: 3 Explanation: The number 3 appears twice in the array.

import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
       System.out.println(dupli(arr));
    }
    public static int dupli(int[] arr){
        int i=0; 
        while(i < arr.length){
            int cor =arr[i]-1;
            if(arr[i] != arr[cor]){
                int temp = arr[i];
                arr[i] = arr[cor];
                arr[cor] = temp;
            }
            else 
                i++;
        }  
    for (int j = 0; j < arr.length; j++) {
        if(arr[j] != j+1)
        return arr[j];
    }
    return -1;
}
}
