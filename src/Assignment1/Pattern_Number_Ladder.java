package Assignment1;

import java.util.Scanner;

public class Pattern_Number_Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int num = 1;
        while (row <= n) {

            int el = row;
            while (el-- > 0)
                System.out.print(num++ + "\t");

            //nextRow
            System.out.println();
            row++;
        }
    }
}
