// Concept here is staircase search
// we can find the item in O(log (m+n)) TC.

/*
    In staircase search we discard a row or a column in 1 iteration.
    This can only work if the array is sorted in both x and y direction.

    When we start from the arr(0, arr[0].length), we first check whether the number present is greater or less than
    target, if greater, then we go leftwards and discard the column because it will have only larger values. If smaller,
    then we go down the column because only smaller values in the row leftwards, so iterating this way we can find the
    element in log(m+n).

    We can only start from either top-right corner or bottom-left corner because only in those two corners we have
    opposite nature of rows & columns [ one increasing and one decreasing ], thus we choose only those two corners.

 */

package lec7;

import java.util.Scanner;

public class Search_a_2D_Matrix_II {
    public static void main(String[] args) {
        // here we are starting from arr(0, arr[0].length) last col in first row.

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), col = sc.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i ++) {
            for (int j = 0; j < col; j ++)
                arr[i][j] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(isTargetFound(arr, target));
    }

    private static boolean isTargetFound(int[][] arr, int target) {
        int row = 0, col = arr[0].length;

        while (row < arr.length && col > 0) {
            if (arr[row][target] == target)
                return true;
            else if (arr[row][target] > target)
                col--;
            else
                row++;
        }

        return false;
    }
}
