package lec2;

import java.util.Scanner;

public class Conversion_Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minFhr = sc.nextInt();
        int maxFhr = sc.nextInt();
        int step = sc.nextInt();

        int currFhr = minFhr;
        while (currFhr <= maxFhr) {
            int cel =(int) ((5.0/9)*(currFhr-32));
            System.out.println(currFhr + "\t" + cel);
            currFhr += step;
        }
    }
}
