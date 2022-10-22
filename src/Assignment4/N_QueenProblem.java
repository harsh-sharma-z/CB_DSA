package Assignment4;

import java.util.Scanner;

public class N_QueenProblem {

	static int count;

	public static void main(String[] args) {
		count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean[][] board = new boolean[n][n];

		printQueens(n, board, 0, "");
		System.out.print("\n" + count);
	}

	public static void printQueens(int n, boolean[][] board, int row, String res) {
		if (n == 0) {
			System.out.print(res + " ");
			count ++;
			return;
		}

		for (int i = 0; i < board.length; i ++) {
			if (isSafe(board, row, i)) {
				board[row][i] = true;
				printQueens(n - 1, board, row + 1, res + "{" + (row+1) + "-" + (i+1) + "} ");
				board[row][i] = false;
			}
		}
	}

	public static boolean isSafe(boolean[][] board, int row, int col) {

		// checking row above
		for (int i = 0; i < row; i ++)
			if (board[i][col])
				return false;

		// checking left above diagonal
		int r = row, c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c])
				return false;
			r --;
			c --;
		}

		// checking right above diagonal
		r = row;
		c = col;
		while (r >= 0 && c < board.length) {
			if (board[r][c])
				return false;
			r --;
			c ++;
		}

		return true;
	}
}
