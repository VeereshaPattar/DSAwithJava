package DSAwithJava.CodeSnippets;
import java.util.Arrays;

//two pointer we can use when array is sorted.
public class TwoPointers {
    public static boolean isTargetValFoundInArr(int[]arr,int target){
        int left = 0,right=arr.length-1;
        while(left< right){
            int sum = arr[left]+arr[right];
            if(sum == target)
            {
                return true;
            }
            else if(sum<target){
                left++;
            }
            else{
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,2,3,6,7,8,9};
        int target = 10;
        if(isTargetValFoundInArr(arr,target))
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

/* when to use two pointer
Sorted Input : If the array or list is already sorted (or can be sorted), two pointers can efficiently find pairs or ranges. Example: Find two numbers in a sorted array that add up to a target.
Pairs or Subarrays : When the problem asks about two elements, subarrays, or ranges instead of working with single elements. Example: Longest substring without repeating characters, maximum consecutive ones, checking if a string is palindrome.
Sliding Window Problems : When you need to maintain a window of elements that grows/shrinks based on conditions. Example: Find smallest subarray with sum ≥ K, move all zeros to end while maintaining order.
Linked Lists (Slow–Fast pointers) : Detecting cycles, finding the middle node, or checking palindrome property. Example: Floyd’s Cycle Detection Algorithm (Tortoise and Hare). */

