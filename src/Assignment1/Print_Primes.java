package Assignment1;

import java.util.Scanner;

public class Print_Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int val = 2;
        while (val <= num) {
            boolean isPrime = true;

            for (int i = 2; i*i <= val; i++)
                if (val % i == 0) {
                    isPrime = false;
                    break;
                }

            if (isPrime)
                System.out.println(val);

            val++;
        }
    }
}
