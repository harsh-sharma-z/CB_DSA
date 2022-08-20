package Assignment1;

import java.util.Scanner;

public class Pattern_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int num = 1;
        int numP = 1;
        int space = n-1;
        while (row <= 2*n - 1) {

            int sp = 1;
            while (sp++ <= space)
                System.out.print("\t");

            int pNum = num;
            for (int i = 1; i <= numP; i++) {
                if (i <= numP/2)
                    System.out.print(pNum++ + "\t");
                else
                    System.out.print(pNum-- + "\t");
            }

            //nextRow
            System.out.println();
            if (row < n) {
                space--;
                num++;
                numP += 2;
            }
            else {
                space++;
                num--;
                numP -= 2;
            }
            row++;
        }
    }
}
