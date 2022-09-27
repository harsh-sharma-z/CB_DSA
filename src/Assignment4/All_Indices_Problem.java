package Assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class All_Indices_Problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] nums = new int[count];
		for (int i = 0; i < count; i ++)
			nums[i] = sc.nextInt();

		int find = sc.nextInt();
		int[] res = getAllIndices(nums, find, 0, new ArrayList<>());

		for(int val : res)
			System.out.print(val + " ");
	}

	private static int[] getAllIndices(int[] nums, int find, int i, ArrayList<Integer> integers) {
		if (i == nums.length) {
			int[] res = new int[integers.size()];
			int pos = 0;

			for (int val : integers)
				res[pos++] = val;

			return res;
		}

		if (nums[i] == find)
			integers.add(i);

		return getAllIndices(nums, find, i + 1, integers);
	}
}
