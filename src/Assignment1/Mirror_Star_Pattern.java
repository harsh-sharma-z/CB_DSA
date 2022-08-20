package Assignment1;

import java.util.Scanner;

public class Mirror_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int star = 1;
        int space = n/2;
        while (row <= n) {

            int sp = 1;
            while (sp++ <= space)
                System.out.print(" \t");

            int st = 1;
            while (st++ <= star)
                System.out.print("*\t");

            //nextRow
            System.out.println();
            if (row <= n/2) {
                star += 2;
                space --;
            }
            else {
                star -= 2;
                space ++;
            }
            row ++;
        }
    }
}
