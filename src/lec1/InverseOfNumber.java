// https://hack.codingblocks.com/app/contests/3446/698/problem
package lec1;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int res = 0;
        int place = 0;
        while (num > 0) {
            int pos = num % 10;
            place++;
            res += place * Math.pow(10, pos-1);
            num /= 10;
        }

        System.out.println(res);
    }
}
