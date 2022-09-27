package Assignment3;

import java.util.Scanner;

public class Form_Biggest_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			String[] nums = new String[n];
			for (int i = 0; i < n; i ++) nums[i] = sc.next();

			performBubbleSort(nums);

			for (String val : nums)
				System.out.print(val);
			System.out.println();
		}
	}

	private static void performBubbleSort(String[] nums) {
		for (int i = 0; i < nums.length; i ++)
			for (int j = i; j < nums.length; j ++)
				if (Long.parseLong(nums[i] + nums[j]) < Long.parseLong(nums[j] + nums[i])) {
					String swap = nums[i];
					nums[i] = nums[j];
					nums[j] = swap;
				}
	}
}
