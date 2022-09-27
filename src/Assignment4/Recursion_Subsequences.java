package Assignment4;

import java.util.Scanner;

public class Recursion_Subsequences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		printSubsequences(str, "", 0);
		System.out.println("\n" + (long) Math.pow(2, str.length()));
	}

	public static void printSubsequences(String str, String res, int index) {
		if (index == str.length()) {
			System.out.print(res + " ");
			return;
		}

		printSubsequences(str, res, index + 1);
		printSubsequences(str, res + str.charAt(index), index + 1);
	}
}
