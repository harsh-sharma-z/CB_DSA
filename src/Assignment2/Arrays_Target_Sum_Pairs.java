package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Target_Sum_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfDigit = sc.nextInt();

        int[] nums = new int[numOfDigit];
        for (int i = 0; i < numOfDigit; i++) nums[i] = sc.nextInt();

        int targetSum = sc.nextInt();

        // computation
        Arrays.sort(nums);
        printResult(nums, targetSum);
    }

    public static void printResult(int[] nums, int targetSum) {
        int lo = 0;
        int hi = nums.length - 1;

        int diff = Integer.MAX_VALUE;
        while (lo <= hi) {

            int h = nums[hi];
            int l = nums[lo];

            if (h + l == targetSum) {
                System.out.println(l + " and " + h);
                lo ++;
                hi --;
            }

            else if (h + l > targetSum)
                hi --;

            else
                lo ++;
        }
    }
}
