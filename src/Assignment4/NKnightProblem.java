package Assignment4;

import java.util.Scanner;

public class NKnightProblem {

	static int count = 0;

	public static void main(String[] args) {
		count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean[][] board = new boolean[n][n];

		placeKnights(n, board, 0, 0, "");
		System.out.println("\n" + count);
	}

	public static void placeKnights(int n, boolean[][] board, int x, int y, String res) {
		if (n == 0) {
			System.out.print(res + " ");
			count ++;
			return;
		}

		for (int i = x; i < board.length; i ++) {
			for (int j = y; j < board.length; j ++) {
				if (isSafe(board, i, j)) {
					board[i][j] = true;
					placeKnights(n - 1, board, i, j + 1, res + "{" + i + "-" + j + "} ");
					board[i][j] = false;
				}
			}
			y = 0;
		}

	}

	static int[][] posToCheck = new int[][] {{-2, -1}, {-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}};

	public static boolean isSafe (boolean[][] board, int row, int col) {
		for (int[] cor : posToCheck) {
			if (!isCoordinateInsideAndSafe(board, row + cor[0], col + cor[1]))
				return false;
		}

		return true;
	}

	public static boolean isCoordinateInsideAndSafe(boolean[][] board, int row, int col) {
		return row < 0 || col < 0 || row >= board.length || col >= board.length || !board[row][col];
	}
}
