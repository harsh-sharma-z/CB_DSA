package Assignment2;

import java.util.Scanner;

public class Murthal_Parantha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parantha = sc.nextInt();
        int chef = sc.nextInt();

        int[] chefR = new int[chef];
        for (int i = 0; i < chef; i++) chefR[i] = sc.nextInt();

        int maxRank = Integer.MIN_VALUE;
        int minRank = Integer.MAX_VALUE;
        for (int rank : chefR) {
            maxRank = Math.max(maxRank, rank);
            minRank = Math.min(minRank, rank);
        }

        int maxTime = maxRank * parantha * (parantha + 1) / 2;
        int minTime = 1;

        int answer = 0;
        while (minTime <= maxTime) {
            int mid = minTime + (maxTime - minTime) / 2;

            if (isValidTime(chefR, mid, parantha)) {
                answer = mid;
                maxTime = mid - 1;
            }

            else
                minTime = mid + 1;
        }

        System.out.println(answer);

    }

    private static boolean isValidTime(int[] chefR, int mid, int parantha) {
        int totalParanthas = 0;
        for (int rank : chefR) {
            totalParanthas += howManyParanthas(rank, mid);
            if (totalParanthas >= parantha)
                return true;
        }
        return false;
    }

    private static int howManyParanthas(int rank, int mid) {
        int minN = 1;
        int maxN = mid / rank;

        int answer = 0;
        while (minN <= maxN) {
            int midN = minN + (maxN - minN) / 2;

            int timeReq = rank * midN * (midN+1) / 2;
            if (timeReq <= mid) {
                answer = midN;
                minN = midN + 1;
            }
            else
                maxN = midN - 1;
        }

        return answer;
    }
}
