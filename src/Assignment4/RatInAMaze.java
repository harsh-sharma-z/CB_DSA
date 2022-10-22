package Assignment4;

import java.util.Scanner;

public class RatInAMaze {

	static boolean isPathFound;

	public static void main(String[] args) {
		isPathFound = false;
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(), c = sc.nextInt();

		char[][] mat = new char[r][c];

		for (int i = 0; i < r; i ++) {
			String str = sc.next();
			mat[i] = str.toCharArray();
		}

		short[][] ans = new short[r][c];

		findPath(0, 0, mat, ans);

		if (!isPathFound)
			System.out.println(-1);
		else
			for(short[] val : ans) {
				for (short dig : val)
					System.out.print(dig + " ");
				System.out.println();
			}
	}

	static int[][] turn = new int[][] {{0, 1},{1, 0},{-1, 0},{0, -1}};

	public static void findPath(int r, int c, char[][] mat, short[][] ans) {
		if (isPathFound)
			return;

		if (r == mat.length - 1 && c == mat[0].length - 1 && mat[r][c] != 'X') {
			ans[r][c] = 1;
			isPathFound = true;
			return;
		}

		if (r < 0 || c < 0 || c >= mat[0].length || r >= mat.length || mat[r][c] == 'X')
			return;

		mat[r][c] = 'X';
		ans[r][c] = 1;

		for (int[] cord : turn)
			findPath(r + cord[0], c + cord[1], mat, ans);

		if (isPathFound)
			return;

		ans[r][c] = 0;
		mat[r][c] = 'O';
	}
}
