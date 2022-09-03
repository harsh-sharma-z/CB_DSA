package Assignment2;

import java.util.Scanner;

public class Painter_Partition_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int painters = sc.nextInt();
        int boardCount = sc.nextInt();
        int[] boards = new int[boardCount];

        for (int i = 0; i < boardCount; i++) boards[i] = sc.nextInt();

        long sum = 0;
        long maxBoard = Integer.MIN_VALUE;
        for (int board : boards) {
            sum += board;
            maxBoard = maxBoard > board ? maxBoard : board;
        }


        long maxT = sum;
        long minT = maxBoard;

        long answer = 0;
        while (minT <= maxT) {
            long mid = minT + (maxT - minT) / 2;

            if (isBoardDivisible(boards, mid, painters)) {
                answer = mid;
                maxT = mid - 1;
            }

            else
                minT = mid + 1;
        }

        System.out.println(answer);
    }

    private static boolean isBoardDivisible(int[] boards, long mid, int painters) {
        int countOfPainter = 1;
        long prevSum = boards[0];
        for (int i = 1; i < boards.length; i++) {
            if (prevSum + boards[i] > mid) {
                prevSum = boards[i];
                countOfPainter++;
            }
            else
                prevSum += boards[i];
        }

        return !(countOfPainter > painters);
    }
}
