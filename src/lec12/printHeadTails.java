package lec12;

import java.util.Scanner;

public class printHeadTails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printPossibleOutcomes(sc.nextInt(), "");
		System.out.println();
		printPossibleOutcomes_No_2_Consecutive_Heads(sc.nextInt(), "");
	}

	public static void printPossibleOutcomes(int n, String res) {
		if (n == 0) {
			System.out.println(res);
			return;
		}

		printPossibleOutcomes(n-1, res + "H");
		printPossibleOutcomes(n-1, res + "T");
	}

	public static void printPossibleOutcomes_No_2_Consecutive_Heads(int n, String res) {
		if (n == 0) {
			System.out.println(res);
			return;
		}

		if (res.length() == 0 || res.charAt(res.length() - 1) != 'H')
			printPossibleOutcomes_No_2_Consecutive_Heads(n-1, res + "H");
		printPossibleOutcomes_No_2_Consecutive_Heads(n-1, res + "T");
	}
}
