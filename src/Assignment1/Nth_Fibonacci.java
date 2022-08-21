package Assignment1;

import java.util.Scanner;

public class Nth_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int term = sc.nextInt();
        int first = 0;
        int second = 1;

        while (term > 0) {
            int sum = first + second;
            first = second;
            second = sum;
            term--;
        }
        System.out.println(first);
    }
}
