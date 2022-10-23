package Assignment4;

import java.util.Scanner;

public class RecursionLexicographicalOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= 9; i ++)
			printNumbers(n, "" + i);
	}

	public static void printNumbers(int n, String res) {
		if (Integer.parseInt(res) > n)
			return;

		System.out.println(res);
		for (int i = 0; i <= 9; i ++)
			printNumbers(n, res + i);
	}
}
