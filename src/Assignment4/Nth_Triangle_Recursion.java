package Assignment4;

import java.util.Scanner;

public class Nth_Triangle_Recursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();

		System.out.println(printLevelResult(l, 0, 1));
	}

	public static int printLevelResult(int l, int res, int count) {
		if (l == 0)
			return res;

		res += count++;
		return printLevelResult(--l, res, count);
	}
}
