package Assignment2;

import java.util.Scanner;

public class Sorting_In_LinearTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ballCount = sc.nextInt();
        int[] balls = new int[ballCount];
        int[] count = new int[3];

        for (int i = 0; i < ballCount; i++) {
            int ball = sc.nextInt();
            count[ball]++;
            balls[i] = ball;
        }

        int pos = 0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]-- > 0)
                balls[pos++] = i;
        }

        for(int ball : balls) System.out.print(ball + " ");
    }
}
