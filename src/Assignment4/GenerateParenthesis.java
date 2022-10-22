package Assignment4;

import java.util.Scanner;

public class GenerateParenthesis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 2*sc.nextInt();

		printParenthesis(n, "", 0);
	}

	static public void printParenthesis(int n, String res, int val) {
		if (val < 0 || val > n)
			return;

		if (n == 0) {
			System.out.println(res);
			return;
		}

		printParenthesis(n - 1, res + ")", val - 1);
		printParenthesis(n - 1, res + "(", val + 1);
	}
}
