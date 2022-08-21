package Assignment1;

import java.util.Scanner;

public class Odd_and_Even_back_in_Delhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int num = sc.nextInt();

            int evenSum = 0;
            int oddSum = 0;
            while (num > 0) {
                int rem = num%10;
                if (rem % 2 == 0)
                    evenSum+=rem;
                else
                    oddSum += rem;
                num /= 10;
            }

            if (evenSum % 4 == 0 || oddSum % 3 == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
