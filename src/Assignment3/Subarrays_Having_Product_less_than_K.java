package Assignment3;

import java.util.Scanner;

class Subarrays_Having_Product_less_than_K {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];

		for (int i = 0; i < n; i ++) nums[i] = sc.nextInt();

		int l = 0;
		int h = 0;
		int prod = 1;
		int count = 0;

		while (h < nums.length) {
			prod *= nums[h];

			while (prod >= k && l <= h) {
				prod /= nums[l];
				l++;
			}

			count += h - l + 1;
			h++;
		}

		System.out.println(count);
	}
}

/*
4
10
1
2
3
4

 */