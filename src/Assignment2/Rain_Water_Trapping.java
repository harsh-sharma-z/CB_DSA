package Assignment2;

import java.util.Scanner;

public class Rain_Water_Trapping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int numOfTower = sc.nextInt();
            int[] tower = new int[numOfTower];
            for (int i = 0; i < numOfTower; i++) tower[i] = sc.nextInt();

            System.out.println(calculateTrappedWater(tower, numOfTower));
        }
    }

    private static int calculateTrappedWater(int[] tower, int numOfTower) {

        int[] leftMax = new int[numOfTower];
        int[] rightMax = new int[numOfTower];

        leftMax[0] = tower[0];
        for (int i = 1; i < numOfTower; i++)
            leftMax[i] = Math.max(leftMax[i-1], tower[i]);

        rightMax[numOfTower - 1] = tower[numOfTower - 1];
        for (int j = numOfTower - 2; j >= 0; j--)
            rightMax[j] = Math.max(rightMax[j+1], tower[j]);

        int totalWater = 0;
        for (int i = 0; i < numOfTower; i++)
            totalWater += Math.min(leftMax[i], rightMax[i]) - tower[i];

        return totalWater;
    }
}
/*
2
6
3  0  0  2  0  4
12
0  1  0  2  1  0  1  3  2  1  2  1

 */
