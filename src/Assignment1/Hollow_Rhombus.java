package Assignment1;

import java.util.Scanner;

public class Hollow_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space = n-1;
        while (row <= n) {

            int sp = 1;
            while (sp++ <= space)
                System.out.print(" ");

            System.out.print("*");

            char ch = (row == 1 || row == n) ? '*' : ' ';
            int p = n - 2;
            while (p-- > 0)
                System.out.print(ch);

            System.out.print("*");

            //nextRow
            System.out.println();
            row ++;
            space--;
        }
    }
}
