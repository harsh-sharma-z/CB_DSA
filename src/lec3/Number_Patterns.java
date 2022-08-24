package lec3;

import java.util.Scanner;

public class Number_Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row, star, space, val;

        System.out.println("---------- 1. ---------- ");

        row = 1;
        star = 1;
        space = n-1;
        val = 1;

        while (row <= n) {
            int sp = 1;
            while (sp <= space) {
                System.out.print(" \t");
                sp++;
            }

            int st = 1;
            while (st <= star) {
                System.out.print(val++ + "\t");
                st++;
            }

            //nextRow
            System.out.println();
            space--;
            star+=2;
            row++;
        }

        System.out.println("\n\n---------- 2. ---------- ");

        row = 1;
        star = 1;
        space = n-1;

        while (row <= n) {
            int sp = 1;
            while (sp <= space) {
                System.out.print(" \t");
                sp++;
            }

            int st = 1;
            val = 1;
            while (st <= star) {
                System.out.print(val++ + "\t");
                st++;
            }

            //nextRow
            System.out.println();
            space--;
            star+=2;
            row++;
        }

        System.out.println("\n\n---------- 3. ---------- ");

        row = 1;
        star = 1;
        space = n-1;

        while (row <= n) {
            int sp = 1;
            while (sp <= space) {
                System.out.print(" \t");
                sp++;
            }

            int st = 1;
            val = 1;
            while (st <= star) {
                System.out.print(val + "\t");
                val = st < row ? val + 1 : val - 1;
                st++;
            }

            //nextRow
            System.out.println();
            space--;
            star+=2;
            row++;
        }

        System.out.println("\n\n---------- 4. ---------- ");

        row = 1;
        star = 1;
        int space1 = n-1;
        int space2 = -1;
        int num;

        while (row <= n) {

            int sp = 1;
            while (sp <= space1) {
                System.out.print("  ");
                sp++;
            }

            int st = 1;
            if (row == n || row == 1) st = 2;

            num = row <= row/2 ? row : n - row + 1 ;

            while (st <= star) {
                System.out.print(num-- + " ");
                st++;
            }

            int k = 1;
            while (k <= space2) {
                System.out.print("  ");
                k++;
            }

            int l = 1;
            while(l <= star) {
                System.out.print(++num + " ");
                l++;
            }

            // nextRow
            System.out.println();
            if (row <= n/2) {
                space1 -= 2;
                star ++;
                space2 += 2;
            }
            else {
                space1 += 2;
                star --;
                space2 -= 2;
            }
            row ++;
        }
    }
}
