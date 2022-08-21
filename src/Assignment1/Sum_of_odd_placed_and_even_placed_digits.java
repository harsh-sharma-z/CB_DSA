package Assignment1;

import java.util.Scanner;

public class Sum_of_odd_placed_and_even_placed_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int oddSum = 0;
        int evenSum = 0;
        int pos = 1;
        while (num > 0) {
            int rem = num%10;
            if (pos%2 == 1)
                oddSum += rem;
            else
                evenSum += rem;
            pos ++;
            num /= 10;
        }
        System.out.println(oddSum + "\n" + evenSum);
    }
}
