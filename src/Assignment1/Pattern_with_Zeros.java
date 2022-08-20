package Assignment1;

import java.util.Scanner;

public class Pattern_with_Zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int num = 1;
        while (row <= n) {

            for (int i = 1; i <= num; i++) {
                if (i == 1 || i == row)
                    System.out.print(row + " ");
                else
                    System.out.print("0 ");
            }

            //nextRow
            System.out.println();
            num++;
            row++;
        }
    }
}
