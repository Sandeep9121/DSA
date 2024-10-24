package Striver79;

public class KadanesAlgo {

    public static long maxSubarraySum(int[] arr, int n){
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            // If sum < 0: make it  the sum =0 negatives are eleminated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray;

     if (max < 0) {
         max = 0;
     }

        return max;
    }

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is " + maxSum);

    }


}
