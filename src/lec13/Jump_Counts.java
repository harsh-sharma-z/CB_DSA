package lec13;

import java.util.Scanner;

public class Jump_Counts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diceFace = sc.nextInt();
		int target = sc.nextInt();

		System.out.println("Total Paths : " + countPaths(diceFace, target, ""));
	}

	public static int countPaths(int diceFace, int target, String res) {
		if (target < 0)
			return 0;

		if (target == 0) {
			System.out.println(res);
			return 1;
		}

		int paths = 0;
		for (int i = 1; i <= diceFace; i ++)
			paths += countPaths(diceFace, target - i, res + i);

		return paths;
	}

}
