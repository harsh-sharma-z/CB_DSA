package Assignment1;

import java.util.Scanner;

public class Pascal_Triangle_3 {

    public static int fact(int num) {
        if (num == 0)
            return 1;
        return num * fact(num-1);
    }

    public static int calculatePascalCoefficient(int n, int p) {
        return fact(n) / (fact(n-p) * fact(p));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int row = 1;
        System.out.println(1);
        while (row < num) {

            System.out.print("1 ");

            int p = 1;
            while (p <= row)
                System.out.print(calculatePascalCoefficient(row, p++) + " ");

            //nextRow
            System.out.println();
            row++;
        }
    }
}
