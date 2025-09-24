package DSAwithJava.CodeSnippets;

//when we need to find the largest or smallest sum of k wee need to go with sliding window

public class SlidingWindow {
    static int maxSum(int arr[],int n,int k){
        int maxSum = 0;
        for(int i=0;i<k;i++)
        {
            maxSum += arr[i];
        }
        int windowSum = maxSum;
        for(int i=k;i<n;i++)
        {
            windowSum += arr[i]- arr[i-k];
            maxSum = Math.max(windowSum,maxSum);
        }
     return maxSum;
    }
     public static void main(String[] args){
        int arr[] = {5, 2, -1, 0, 3};
        int k = 3;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}
