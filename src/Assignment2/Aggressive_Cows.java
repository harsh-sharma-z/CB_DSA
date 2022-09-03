package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfStalls = sc.nextInt();
        int numOfCows = sc.nextInt();

        long[] stalls = new long[numOfStalls];
        for (int i = 0; i < numOfStalls; i++) stalls[i] = sc.nextLong();

        Arrays.sort(stalls);

        long minDist = 1;
        long maxDist = stalls[numOfStalls - 1];

        long answer = 1;
        while (minDist <= maxDist) {
            long mid = minDist + (maxDist - minDist) / 2;

            if (isFittable(stalls, mid, numOfCows, numOfStalls)) {
                answer = mid;
                minDist = mid + 1;
            }
            else
                maxDist = mid - 1;

        }

        System.out.println(answer);
    }

    private static boolean isFittable(long[] stalls, long mid, int numOfCows, int numOfStalls) {
        long cow = 1;
        int prev = 0;

        for (int i = 1; i < numOfStalls; i++) {
            if (stalls[i] - stalls[prev] >= mid) {
                prev = i;
                cow++;
            }
        }

        return cow >= numOfCows;
    }
}

/*
5 3
1 2 8 4 9

 */