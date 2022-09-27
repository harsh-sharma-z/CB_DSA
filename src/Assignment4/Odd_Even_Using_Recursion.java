package Assignment4;

import java.util.Scanner;

public class Odd_Even_Using_Recursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		printOdd(num);
		printEven(num, 2);
	}

	public static void printOdd(int n) {
		n = n%2 == 0 ? n-1 : n;
		if (n <= 0)
			return;
		System.out.println(n);
		printOdd(n-2);
	}

	public static void printEven(int n, int tp) {
		n = n%2 == 0 ? n : n - 1;
		if (tp > n)
			return;
		System.out.println(tp);
		printEven(n, tp + 2);
	}

}
