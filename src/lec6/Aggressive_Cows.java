package lec6;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int stall = sc.nextInt(), cow = sc.nextInt();
            int[] stalls = new int[stall];
            int i = 0;
            while (i < stall) stalls[i++] = sc.nextInt();
            System.out.println(Largest_minimum_diff(stalls, cow));
        }
    }

    public static int Largest_minimum_diff(int[] stalls, int cow) {
        Arrays.sort(stalls);
        int maxStall = stalls[stalls.length - 1];

        int maxDist = (maxStall) / cow;
        int minDist = 1;

        int answer = 0;
        while (minDist <= maxDist ) {
            int mid = minDist + (maxDist - minDist)/2;
            if (isFittable(stalls, mid, cow)) {
                answer = mid;
                minDist = mid + 1;
            }

            else {
                maxDist = mid - 1;
            }
        }
        return answer;
    }

    public static boolean isFittable(int[] stalls, int diff, int cow) {
        int cowCount = 0;
        int prevStall = 0;

        for (int i = 1; i < stalls.length; i ++) {
            if (stalls[i] - stalls[prevStall] >= diff) {
                prevStall = i;
                cowCount ++;
                if (cowCount+1 >= cow) return true;
            }
        }

        return false;
    }

}
