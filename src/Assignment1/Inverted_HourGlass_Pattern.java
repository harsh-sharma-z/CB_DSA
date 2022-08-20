package Assignment1;

import java.util.Scanner;

public class Inverted_HourGlass_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int num = n;
        int space = n-1;
        while (row <= 2*n + 1) {

            int cNum = n;
            while (cNum >= num)
                System.out.print(cNum-- + " ");

            int sp = 1;
            while (sp++ <= space)
                System.out.print("  ");

            if (row != n+1)
                System.out.print("  ");
            else
                cNum++;

            sp-=1;
            while (--sp > 0)
                System.out.print("  ");

            while (cNum++ < n)
                System.out.print(cNum + " ");

            // nextRow
            System.out.println();
            if (row <= n) {
                space --;
                num --;
            }
            else {
                space ++;
                num ++;
            }
            row ++;
        }
    }
}
