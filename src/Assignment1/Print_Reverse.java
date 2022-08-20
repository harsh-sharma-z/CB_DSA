package Assignment1;

import java.util.Scanner;

public class Print_Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev = 0;
        while (n > 0) {
            rev = rev*10 + n%10;
            n /= 10;
        }

        System.out.println(rev);
    }
}
