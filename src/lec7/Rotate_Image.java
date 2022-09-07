/*
    In this program we first do the transpose of all the elements, then we row-wise rotate the elements.
    &
    and thus we find the solution.
 */

package lec7;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Image {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr =  new int[3][3];

        int pos = 0;
        for (int[] i : arr) for (int j = 0; j < i.length; j ++) i[j] = pos++;

        for (int[] i : arr)
            System.out.println(Arrays.toString(i));

        System.out.println("\n----------------------\n");
        transpose(arr);
        rowWiseRotate(arr);

        for (int[] i : arr)
            System.out.println(Arrays.toString(i));
    }

    public static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i ++)
            for (int j = 0; j < i; j ++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
    }

    public static void rowWiseRotate(int[][] arr) {
        int rowLen = arr[0].length - 1;
        for (int i = 0; i < arr.length; i ++)
            for (int j = 0; j < arr[0].length/2; j ++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][rowLen - j];
                arr[i][rowLen - j] = temp;
            }
    }
}
