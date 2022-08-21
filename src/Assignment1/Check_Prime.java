package Assignment1;

import java.util.Scanner;

public class Check_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}
