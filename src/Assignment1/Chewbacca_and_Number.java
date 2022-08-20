package Assignment1;

import java.util.Scanner;

public class Chewbacca_and_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long invert = 0;
        int pos = 0;
        while (n > 10) {
            int rem = (int) (n%10);
            invert += (rem < 5 ? rem : 9 - rem)%10*Math.pow(10, pos++);
            n/=10;
        }

        if (n == 9)
            invert += 9*Math.pow(10, pos);
        else
            invert += (n < 5 ? n : 9 - n)*Math.pow(10, pos);

        System.out.println(invert);
    }
}
