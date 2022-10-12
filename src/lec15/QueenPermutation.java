package lec15;

import java.util.Scanner;

public class QueenPermutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Boxes : ");
		int boxLen = sc.nextInt();
		System.out.print("Enter number of Queens : ");
		int queenNum = sc.nextInt();

		boolean[] boxes = new boolean[boxLen];
		PrintPermutations(boxes, queenNum, "", 0);
	}

	public static void PrintPermutations (boolean[] boxes, int totalQueens, String ans, int queenPlacedSoFar) {
		if (totalQueens == queenPlacedSoFar) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < boxes.length; i ++) {
			if (!boxes[i]) {
				boxes[i] = true;
				PrintPermutations(boxes, totalQueens, ans + "b" + i + "->q" + queenPlacedSoFar + " ", queenPlacedSoFar + 1);
				boxes[i] = false;
			}
		}

	}
}
