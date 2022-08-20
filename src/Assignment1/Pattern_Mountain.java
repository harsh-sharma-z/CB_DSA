package Assignment1;

import java.util.Scanner;

public class Pattern_Mountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int num = 1;
        int space = n + 1;
        while (row <= n) {

            int numP = 1;
            while (numP <= num)
                System.out.print(numP++ + " ");

            int sp = 1;
            while (sp++ <= space)
                System.out.print("  ");

            if (row == n)
                numP--;

            numP--;
            while (numP >= 1)
                System.out.print(numP-- + " ");

            // nextRow
            System.out.println();
            row++;
            num++;
            space-=2;
        }
    }
}
