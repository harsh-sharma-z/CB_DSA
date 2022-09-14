// Studying Kadane's ALgo with Maximum Sum Subarray, Leetcode 53

package lec9;

public class KadaneAlgo {
    /* Whenever we add some positive value inside an already negative sum subarray it's result would always be smaller
        than just keeping the number itself inside the subarray from start.

        So whenever our result becomes negative we start our sum from that number itself.
     */

    public int maxSum (int[] arr) {
        int ans = Integer.MIN_VALUE;
        int currSum = Integer.MIN_VALUE;
        for (int j : arr) {
            currSum = Math.max(currSum, currSum + j);
            ans = Math.max(currSum, ans);
        }

        return ans;
    }

}
