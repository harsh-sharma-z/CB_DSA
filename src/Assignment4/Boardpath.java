package Assignment4;

import java.util.Scanner;

public class Boardpath {

	static int count = 0;

	public static void main(String[] args) {
		count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), d = sc.nextInt();

		countPath(n, d, "");
		System.out.print("\n" + count);
	}

	public static void countPath (int n, int d, String res) {
		if (n < 0)
			return;

		if (n == 0) {
			System.out.print(res + " ");
			count++;
			return;
		}

		for (int i = 1; i <= d; i ++)
			countPath(n - i, d, res + i);
	}
}
