package Extras;

import java.util.Arrays;

public class Sum_of_All_Odd_Length_Subarrays {
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int[] sum = new int[arr.length + 1];

        int pos = 0;
        sum[pos++] = 0;
        for (int j : arr)
            sum[pos] = sum[pos++ - 1] + j;

        long totSum = 0;
        for (int a = 0; a < arr.length; a ++) {
            for (int b = a + 1; b <= arr.length; b ++) {
                if (a%2 != b%2)
                    totSum += sum[b] - sum[a];
            }
        }

        return (int) totSum;
    }
}
