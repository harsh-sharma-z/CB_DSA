package Assignment2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Arrays_Target_Sum_Triplets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] nums = new int[num];

		for (int i = 0; i < num; i++) {
			nums[i] = sc.nextInt();
		}

		int target = sc.nextInt();

		Arrays.sort(nums);
		printTriplets(nums, target);
	}

	public static void printTriplets(int[] nums, int target) {
		int i = 0;
		int n1;
		HashSet<int[]> set = new HashSet<>();

		while (i < nums.length) {
			n1 = nums[i];

			int l = i + 1;
			int h = nums.length - 1;
			while (l < h) {
				int val = nums[i] + nums[l] + nums[h];
				if (val == target) {
					int[] res = new int[]{n1, nums[l], nums[h]};
					if (!set.contains(res)) {
						set.add(res);
						System.out.println(n1 + ", " + nums[l] + " and " + nums[h]);
					}
					l ++;
					h --;
				}

				else if (val > target)
					h --;

				else
					l ++;
			}

			i ++;
		}
	}
}
