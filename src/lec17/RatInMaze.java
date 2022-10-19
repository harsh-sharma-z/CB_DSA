package lec17;

import java.util.Scanner;

public class RatInMaze {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(), N = sc.nextInt();
		char[][] maze = new char[M][N];

		for (int i = 0; i < M; i ++) {
			String row = sc.next();
			for (int j = 0; j < N; j ++)
				maze[i][j] = row.charAt(j);
		}

		int[][] res = new int[M][N];
		hasPath(maze, 0, 0, res);

		if (PATH_NEVER_FOUND)
			System.out.println("NO PATH FOUND");
	}

	static boolean PATH_NEVER_FOUND = true;

	public static void display(int[][] arr) {
		for (int[] ints : arr) {
			for (int j : ints)
				System.out.print(j + " ");
			System.out.println();
		}
	}

	public static void hasPath(char[][] maze, int cc, int cr, int[][] ans) {
		if (cr == maze.length - 1 && cc == maze[0].length - 1 && maze[cr][cc] != 'X') {
			ans[cr][cc] = 1;
			display(ans);
			PATH_NEVER_FOUND = false;
			return;
		}

		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}

		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		int[] r = {-1, 1, 0, 0};
		int[] c = {0, 0, -1, 1};

		// reducing coding time by implementing a loop.
		for (int i = 0; i < c.length; i ++)
			hasPath(maze, cc + c[i], cr + r[i], ans);

		ans[cr][cc] = 0;
		maze[cr][cc] = '0';
	}
}
