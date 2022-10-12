package lec15;

import java.util.Scanner;

public class QueenCombination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Boxes : ");
		int boxLen = sc.nextInt();
		System.out.print("Enter number of Queens : ");
		int queenNum = sc.nextInt();

		boolean[] boxes = new boolean[boxLen];
		printCombination(boxes, queenNum, "", 0, 0);
	}

	public static void printCombination(boolean[] boxes, int tq, String ans, int qPSF, int currQ) {
		if (qPSF == tq) {
			System.out.println(ans);
			return;
		}

		for (int i = currQ; i < boxes.length; i ++) {
			boxes[i] = true;
			printCombination(boxes, tq, ans + "b" + i + "q" + qPSF + " ", qPSF + 1, i + 1);
			boxes[i] = false;
		}
	}
}
