package Assignment1;

import java.util.Scanner;

public class Pattern_Double_Sided_Arrow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int num = 1;
        int space = n-1;
        int midSpace = 0;
        while (row <= n) {

            int sp = 1;
            while (sp <= space) {
                System.out.print("  ");
                sp++;
            }

            int curNum = num;
            while (curNum >= 1) {
                System.out.print(curNum + " ");
                curNum --;
            }

            int midSp = 1;
            while (midSp <= midSpace) {
                System.out.print("  ");
                midSp++;
            }

            if (num > 1)
                while (curNum++ < num)
                    System.out.print(curNum + " ");

            // nextRow
            System.out.println();
            if(row <= n/2) {
                midSpace = n - space;
                num ++;
                space -=2;
            }
            else {
                num --;
                space += 2;
                midSpace -= 2;
            }
            row++;
        }
    }

}
