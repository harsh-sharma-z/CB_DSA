package Assignment2;

import java.util.Scanner;

public class Maximum_Sum_Path_in_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int l1 = sc.nextInt(), l2 = sc.nextInt();
            int[] nums1 = new int[l1], nums2 = new int[l2];

            // input nums1 array.
            for (int i = 0; i < l1; i++) {
                nums1[i] = sc.nextInt();
            }

            // input nums2 array.
            for (int i = 0; i < l2; i++) {
                nums2[i] = sc.nextInt();
            }

            int res = findMaxSumPath(nums1, nums2);
            System.out.println(res);
        }
    }

    private static int findMaxSumPath(int[] nums1, int[] nums2) {
        int targetSum = 0, sum1 = 0, sum2 = 0;

        int i = 0, j = 0, l1 = nums1.length, l2 = nums2.length;

        // getting the maximum sum until the elements of both arrays are present.
        while (i < l1 && j < l2) {
            if (nums1[i] < nums2[j])
                sum1 += nums1[i++];

            else if (nums1[i] > nums2[j])
                sum2 += nums2[j++];

            else {
                targetSum += Math.max(sum1, sum2) + nums1[i];
                sum1 = sum2 = 0;
                i++;
                j++;
            }
        }

        // calculating the sum of remaining part, if any in nums1
        while(i < l1)
            sum1 += nums1[i++];

        // calculating the sum of remaining part, if any in nums2
        while(j < l2)
            sum2 += nums2[j++];

        // adding the last remaining part sum to the targetSum.
        targetSum += Math.max(sum1, sum2);

        return targetSum;
    }
}
