package Assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePath {

	static int count;

	public static void main(String[] args) {
		count = 0;
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt() - 1, c = sc.nextInt() - 1;

		ArrayList<String> result = new ArrayList<>();
		countPaths(r, c, "", result);
		for (String res : result)
			System.out.print(res + " ");
		System.out.print("\n" + count);
	}

	public static void countPaths(int r, int c, String res, ArrayList<String> result) {
		if (r < 0 || c < 0)
			return;

		if (r == 0 && c == 0) {
			result.add(res);
			count++;
			return;
		}

		countPaths(r - 1, c, res + "V", result);
		countPaths(r, c - 1, res + "H", result);
	}
}
