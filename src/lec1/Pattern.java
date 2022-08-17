package lec1;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(1.);

        int row = 1;
        int star = 1;

        while (row <= n) {
            int s = 1;
            while (s <= star) {
                System.out.print("* ");
                s++;
            }

            //nextRow
            System.out.println();
            row++;
            star++;
        }

        System.out.println("\n\n2.");

        row = 1;
        star = n;

        while (row <= n) {
            int starCount = 1;
            while (starCount <= star) {
                System.out.print("* ");
                starCount++;
            }

            // nextRow
            System.out.println();
            row++;
            star--;
        }

        System.out.println("\n\n3.");

        row = 1;
        star = 1;
        int space = n - 1;

        while (row <= n) {
            int sp = 1;
            while (sp <= space) {
                System.out.print("  ");
                sp++;
            }

            int st = 1;
            while (st <= star) {
                System.out.print("* ");
                st++;
            }

            // nextRow
            System.out.println();
            row++;
            star++;
            space--;
        }

        System.out.println("\n\n4.");

        row = 1;
        star = n;
        space = 0;

        while(row <= n) {
            int sp = 0;
            while (sp < space) {
                System.out.print("  ");
                sp++;
            }

            int st = 1;
            while (st <= star) {
                System.out.print("* ");
                st++;
            }

            // nextRow
            System.out.println();
            space++;
            star--;
            row++;
        }

        System.out.println("\n\n6.");

        row = 1;
        star = n;
        space = 0;

        while (row <= n) {
            int sp = 0;
            while(sp < space) {
                System.out.print("  ");
                sp++;
            }

            int st = 1;
            while(st <= star) {
                System.out.print("* ");
                st++;
            }

            // nextRow
            System.out.println();
            space += 2;
            star--;
            row++;

        }

        System.out.println("\n\n7.");

        row = 1;
        star = 1;
        space = n-1;

        while (row <= n) {
            int sp = 1;
            while (sp <= space) {
                System.out.print("  ");
                sp++;
            }

            int st = 1;
            while (st <= star) {
                System.out.print("* ");
                st++;
            }

            //nextRow
            System.out.println();
            space--;
            star+=2;
            row++;
        }

        System.out.println("\n\n11.");

        row = 1;
        star = 1;
        space = n-1;

        while (row <= n) {
            int sp = 1;
            while(sp <= space) {
                System.out.print("  ");
                sp++;
            }

            int st = 1;
            while(st <= star) {
                if (st%2!=0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                st++;
            }

            //nextRow
            space--;
            star+=2;
            row++;
            System.out.println();
        }

        System.out.println("\n\n12.");

        row = 1;
        star = 1;
        space = n-1;

        while (row <= n) {
            int sp = 1;
            while(sp <= space) {
                System.out.print("  ");
                sp++;
            }

            int st = 1;
            while(st <= star) {
                if (st%2!=0)
                    System.out.print("* ");
                else
                    System.out.print("! ");
                st++;
            }

            //nextRow
            space--;
            star+=2;
            row++;
            System.out.println();
        }

        System.out.println("\n\n13.");

        row = 1;
        star = 1;

        while (row <= 2*n-1) {
            int starCount = 1;
            while (starCount <= star) {
                System.out.print("* ");
                starCount++;
            }

            // nextRow
            System.out.println();
            // horizontal mirror : -- :
            star = row < 5 ? star + 1 : star - 1;
            row++;
        }

        System.out.println("\n\n15.");

        row = 1;
        star = n;
        space = 0;

        while (row <= 2*n-1) {
            int sp = 0;
            while(sp < space) {
                System.out.print("  ");
                sp++;
            }

            int st = 1;
            while(st <= star) {
                System.out.print("* ");
                st++;
            }

            // nextRow
            System.out.println();
            if (row < n) {
                space += 2;
                star--;
            }
            else {
                space-=2;
                star++;
            }
            row++;
        }

        System.out.println("\n\n16.");

        row = 1;
        star = n;
        space = n;

        while (row <= 2*n-1) {
            int sp = 1;
            while(sp < space) {
                System.out.print("  ");
                sp++;
            }

            int st = 1;
            while(st <= star) {
                System.out.print("* ");
                st++;
            }

            // nextRow
            System.out.println();
            if (row < n) {
                space--;
                star--;
            }
            else {
                space++;
                star++;
            }
            row++;
        }


    }
}
