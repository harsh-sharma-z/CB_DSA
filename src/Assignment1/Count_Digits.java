package Assignment1;

import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = sc.nextInt();

        int res = 0;
        while (num > 0) {
            if (num%10 == digit)
                res++;
            num /= 10;
        }

        System.out.println(res);
    }
}
