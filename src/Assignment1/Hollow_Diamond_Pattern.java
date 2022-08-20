package Assignment1;

import java.util.Scanner;

public class Hollow_Diamond_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int star = n-1;
        int space = 1;

        while (row <= n) {

            int st = 1;
            if (row == 1 || row == n) {
                while (st <= n) {
                    System.out.print("*\t");
                    st++;
                }
                System.out.println();
            }
            else {
                while(st <= star/2) {
                    System.out.print("*\t");
                    st++;
                }

                int sp = 1;
                while (sp <= space) {
                    System.out.print(" \t");
                    sp++;
                }

                st = 1;
                while(st <= star/2) {
                    System.out.print("*\t");
                    st++;
                }

                // nextRow
                System.out.println();
                if (row <= n/2) {
                    star -= 2;
                    space += 2;
                }
                else {
                    star += 2;
                    space -= 2;
                }
            }

            row++;
        }
    }

}
