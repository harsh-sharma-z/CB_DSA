package lec2;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source Base : ");
        int sourceBase = sc.nextInt();
        System.out.print("Enter number : ");
        int num = sc.nextInt(sourceBase);

        System.out.print("Enter destination base : ");
        int base = sc.nextInt();

        int sum = 0;
        int mul = 1;

        while(num > 0) {
            int rem = num%base;
            sum += rem*mul;
            num /= base;
            mul*=10;
        }

        System.out.println(sum);
    }
}
