package Assignment1;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int res = Math.max(n1, n2);
        while (res % n1 != 0 || res % n2 != 0)
            res++;
        System.out.println(res);
    }
}
