package Assignment2;

import java.util.Scanner;

public class Help_Ramu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int c1 = sc.nextInt(), c2 = sc.nextInt(), c3 = sc.nextInt(), c4 = sc.nextInt();
            int numOfRick = sc.nextInt(), numOfCabs = sc.nextInt();
            int[] ricks = new int[numOfRick];

            for (int i = 0; i < numOfRick; i++) ricks[i] = sc.nextInt();

            int[] cabs = new int[numOfCabs];
            for (int i = 0; i < numOfCabs; i++) cabs[i] = sc.nextInt();

            int minRickCost = Math.min(minRickCost(ricks, c1, c2), c3);
            int minCabCost = Math.min(minCabCost(cabs, c1, c2), c3);

            int totalMinimumCost = Math.min(minCabCost + minRickCost, c4);

            System.out.println(totalMinimumCost);
        }
    }

    private static int minCabCost(int[] cabs, int c1, int c2) {
        int amount1 = 0;
        for(int rides : cabs) {
            amount1 += Math.min(rides*c1, c2);
        }

        return amount1;
    }

    private static int minRickCost(int[] ricks, int c1, int c2) {
        int amount1 = 0;
        for(int rides : ricks) {
            amount1 += Math.min(rides*c1, c2);
        }

        return amount1;
    }
}
