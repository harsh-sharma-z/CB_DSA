package lec3;

import java.util.Scanner;

// How to solve pascal's triangle without using extra space & factorial.
public class Pascal_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 0;
        int star = 1;
        while (row < n) {

            // nCr = n! / ( (n-r)! * r! )
            // Using combinatorics formula of nCr+1 / nCr = (n-r) / (r+1)

            int val = 1;
            int st = 0;
            while (st < star) {
                System.out.print(val + " ");
                val = val * (row - st) / (st + 1);
                st++;
            }

            // nextRow
            System.out.println();
            row++;
            star++;
        }
    }
}
