package Assignment4;

import java.util.Scanner;

public class First_Index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];

		for (int i = 0; i < n; i ++) {
			nums[i] = sc.nextInt();
		}

		int find = sc.nextInt();

		System.out.println(lastIndex(nums, find, 0));
	}

	private static int lastIndex(int[] nums, int find, int index) {
		if (index >= nums.length)
			return -1;
		if (nums[index] == find)
			return index;
		return lastIndex(nums, find, index + 1);
	}
}

