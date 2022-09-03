package Assignment2;

import java.util.Scanner;

public class Arrays_Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] nums = new long[N];

        for (int i = 0; i < N; i++) nums[i] = sc.nextLong();
        long M = sc.nextLong();

        boolean isFound = false;
        for (int i = 0; i < N; i++) {
            if (nums[i] != M)
                continue;
            System.out.println(i);
            isFound = true;
        }

        if (!isFound) System.out.println(-1);
    }
}
