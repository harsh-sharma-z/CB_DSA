package lec11;

import java.util.Scanner;

public class RecursionBasics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input : ");
		print_Decreasing_then_Increasing(sc.nextInt());
	}

	public static int fact(int n) {
		if (n == 0)
			return 1;
		int fn = fact(n - 1);
		return n * fn;
	}

	public static void print_Increasing(int n) {
		if (n == 0)
			return;
		print_Increasing(n - 1);
		System.out.println(n);
	}

	public static void print_Decreasing(int n) {
		if (n == 0)
			return;
		System.out.println(n);
		print_Decreasing(n - 1);
	}

	public static void print_Decreasing_then_Increasing (int n) {
		if (n == 0)
			return;
		print_Decreasing_then_Increasing(n - 1);
		System.out.println(n);
		print_Decreasing_then_Increasing(n - 1);
	}
}
