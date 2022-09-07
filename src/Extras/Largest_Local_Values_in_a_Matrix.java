package Extras;

public class Largest_Local_Values_in_a_Matrix {
    public static int[][] largestLocal(int[][] grid) {
        int[][] rowWise3sMax = new int[grid.length][grid.length - 2];

        int cr = 0, cc;
        for (int[] ints : grid) {
            cc = 0;
            for (int j = 1; j < grid.length - 1; j++) {
                rowWise3sMax[cr][cc] = Math.max(ints[j - 1], Math.max(ints[j], ints[j + 1]));
                cc++;
            }
            cr++;
        }

        int[][] res = new int[grid.length - 2][grid.length - 2];

        cc = 0;
        for (int j = 0; j < grid.length - 2; j ++) {
            cr = 0;
            for (int i = 1; i < grid.length - 1; i ++) {
                res[cr][cc] = Math.max(rowWise3sMax[i][j],
                        Math.max(rowWise3sMax[i-1][j], rowWise3sMax[i+1][j]));
                cr ++;
            }
            cc++;
        }

        return res;
    }

}
