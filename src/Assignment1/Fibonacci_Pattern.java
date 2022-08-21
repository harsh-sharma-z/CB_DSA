package Assignment1;

import java.util.Scanner;

public class Fibonacci_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int firstTerm = 0;
        int secondTerm = 1;
        while (row <= n) {

            for (int i = 0; i < row; i++) {
                System.out.print(firstTerm + "\t");
                int temp = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = temp;
            }

            // nextRow
            System.out.println();
            row++;
        }
    }
}
