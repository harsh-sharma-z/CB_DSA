package Assignment2;

import java.util.Scanner;

public class Arrays_Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] nums = new long[N];

        for (int i = 0; i < N; i++) nums[i] = sc.nextLong();
        long M = sc.nextLong();

        int start = 0;
        int end = N - 1;

        boolean isNumFound = false;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == M) {
                System.out.println(mid);
                isNumFound = true;
                break;
            }

            if (nums[mid] > M)
                end = mid - 1;
            else
                start = mid + 1;
        }

        if (!isNumFound) System.out.println(-1);
    }
}
