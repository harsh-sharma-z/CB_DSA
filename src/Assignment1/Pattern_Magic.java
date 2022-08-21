package Assignment1;

import java.util.Scanner;

public class Pattern_Magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int star = n;
        int space = 1;
        while (row <= 2*n - 1) {
            if (row == 1 || row == 2*n - 1) {
                int sp = 2*n - 1;
                while (sp-- > 0)
                    System.out.print("* ");
            }
            else {
                int sp = 1;
                while (sp++ <= star)
                    System.out.print("* ");

                space = (2*n - 1) - 2*star;
                int st = 1;
                while (st++ <= space)
                    System.out.print("  ");

                sp --;
                while (sp-- > 1)
                    System.out.print("* ");
            }

            // nextRow
            System.out.println();
            if (row < n) {
                star --;
                space += 2;
            }
            else {
                star ++;
                space -= 2;
            }
            row++;
        }
    }
}
