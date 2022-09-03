package Assignment2;

import java.util.Scanner;

public class Kth_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            long num = sc.nextLong();
            int pow = sc.nextInt();
            System.out.println(calculate_Kth_Root(num, pow));
        }
    }

    public static long calculate_Kth_Root(long num, int pow) {
        long min = 1;
        long max = num;

        long answer = 0;
        while (min <= max) {
            long mid = min + (max - min)/2;

            if (Math.pow(mid, pow) <= num) {
                answer = mid;
                min = mid + 1;
            }
            else
                max = mid - 1;
        }

        return answer;
    }
}

/*
2
10000 1
1000000000000000 10

 */