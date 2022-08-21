package Assignment1;

import java.util.Scanner;

public class Shopping_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();

            int ph = 0;
            while (true) {
                if (ph + 1 < p1)
                    p1 -= ++ph;
                else
                    break;

                if (ph + 1 < p2)
                    p2 -= ++ph;
                else
                    break;
            }
            System.out.println(ph % 2 != 0 ? "Aayush" : "Harshit");
       }
    }
}
