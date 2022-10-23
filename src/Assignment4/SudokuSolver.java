package Assignment4;

import java.util.Scanner;

public class SudokuSolver {
	static boolean isSolved;

	public static void main(String[] args) {
		isSolved = false;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] sudoku = new int[n][n];

		for (int i = 0; i < n; i ++)
			for (int j = 0; j < n; j ++)
				sudoku[i][j] = sc.nextInt();

		solveSudoku(sudoku, 0, 0);
	}

	public static void solveSudoku(int[][] sudoku, int x, int y) {
		if (y == sudoku.length) {
			x ++;
			y = 0;
		}

		if (x == sudoku.length && y == 0) {
			display(sudoku);
			return;
		}

		if (sudoku[x][y] != 0)
			solveSudoku(sudoku, x, y + 1);

		else {
			for (int i = 1; i <= 9; i ++) {
				if (isSafe(sudoku, x, y, i)) {
					sudoku[x][y] = i;
					solveSudoku(sudoku, x, y + 1);
					sudoku[x][y] = 0;
				}
			}
		}
	}

	static int[] st = new int[]{0, 0, 0, 3, 3, 3, 6, 6, 6};
	public static boolean isSafe(int[][] sudoku, int row, int col, int val) {
		for (int i = 0; i < sudoku.length; i ++)
			if (i != row && sudoku[i][col] == val)
				return false;

		for (int i = 0; i < sudoku.length; i ++)
			if (i != col && sudoku[row][i] == val)
				return false;

		int sr = st[row];
		int sc = st[col];

		for (int i = sr; i < sr + 3; i ++)
			for (int j = sc; j < sc + 3; j ++)
				if (i != row && j != col && sudoku[i][j] == val)
					return false;

		return true;
	}

	private static void display(int[][] sudoku) {
		for (int[] ints : sudoku) {
			for (int val : ints)
				System.out.print(val + " ");
			System.out.println();
		}
	}

}
