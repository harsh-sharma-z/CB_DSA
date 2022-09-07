package lec7;

import java.util.Arrays;
import java.util.Scanner;

class Clockwise_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][5];
        int val = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = val++;
            }
        }

        for (int[] ints : arr)
            System.out.println(Arrays.toString(ints));

        printSpiral(arr);
    }

    private static void printSpiral(int[][] arr) {
        int minR = 0, maxR = arr.length - 1;
        int minC = 0, maxC = arr[0].length - 1;
        int printed = 0;

        int totalPrint = arr.length*arr[0].length;
        while (printed < totalPrint) {
            for (int i = minC; i <= maxC; i++) {
                System.out.print(arr[minR][i] + " ");
                printed++;
            }

            minR++;
            if (printed >= totalPrint)
                break;

            for (int i = minR; i <= maxR; i++) {
                System.out.print(arr[i][maxC] + " ");
                printed++;
            }

            if (printed >= totalPrint)
                break;

            maxC--;

            for (int i = maxC; i >= minC; i--) {
                System.out.print(arr[maxR][i] + " ");
                printed++;
            }

            if (printed >= totalPrint)
                break;

            maxR--;

            for (int i = maxR; i >= minR; i--) {
                System.out.print(arr[i][minC] + " ");
                printed++;
            }

            minC++;
        }
    }
}
