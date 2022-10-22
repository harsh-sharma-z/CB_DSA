package Assignment4;

import java.util.Scanner;

public class Mazepath_D {

	static int count;

	public static void main(String[] args) {
		count = 0;
		Scanner sc= new Scanner(System.in);
		int r = sc.nextInt() - 1, c = sc.nextInt() - 1;

		mazepath(r, c, "");
		System.out.println("\n" + count);
	}

	public static void mazepath(int r, int c, String res) {
		if (r < 0 || c < 0)
			return;

		if (r == 0 && c == 0) {
			System.out.print(res + " ");
			count ++;
			return;
		}

		mazepath(r - 1, c, res + "V");
		mazepath(r, c - 1, res + "H");
		mazepath(r - 1, c - 1, res + "D");
	}
}
