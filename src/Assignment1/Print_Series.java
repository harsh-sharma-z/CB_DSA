package Assignment1;

import java.util.Scanner;

public class Print_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int mul = 1;
        while (n1 > 0) {

            int res = 3*mul + 2;
            if (res % n2 != 0) {
                System.out.println(res);
                n1--;
            }

            mul++;
        }
    }
}
