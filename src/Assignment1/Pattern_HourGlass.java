package Assignment1;

import java.util.Scanner;

public class Pattern_HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int num = n;
        int space = 0;
        while (row <= 2*n + 1) {

            int sp = 1;
            while(sp++ <= space)
                System.out.print("  ");

            int numP = num;
            while (numP >= 0)
                System.out.print(numP-- + " ");

            numP+=2;
            while(numP <= num)
                System.out.print(numP++ + " ");

            // nextRow
            System.out.println();
            if (row <= n) {
                space ++;
                num --;
            }
            else {
                space --;
                num ++;
            }
            row ++;
        }
    }
}
