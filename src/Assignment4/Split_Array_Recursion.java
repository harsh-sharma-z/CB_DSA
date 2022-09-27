package Assignment4;

import java.util.Scanner;

public class Split_Array_Recursion {
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i ++) nums[i] = sc.nextInt();
		printPerms(nums, 0, "", 0, "", 0);
		System.out.println(count);
	}

	public static void printPerms(int[] nums, int i, String ar1, int sum1, String ar2, int sum2) {
		if (i == nums.length) {
			if (sum1 == sum2) {
				String res = ar1 + " and" + ar2;
				System.out.println(res.substring(1) + " ");
				count++;
			}
			return;
		}

		printPerms(nums, i + 1, ar1 + " " + nums[i], sum1 + nums[i], ar2, sum2);
		printPerms(nums, i + 1, ar1, sum1, ar2 + " " + nums[i], sum2 + nums[i]);
	}
}

