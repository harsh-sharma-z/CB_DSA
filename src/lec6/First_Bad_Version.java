package lec6;

import java.util.Scanner;

public class First_Bad_Version {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(firstBadVersion(sc.nextInt()));
    }

    public static int firstBadVersion(int n) {
        int si = 1;
        int ei = n;

        int lastBad = 0;

        while (si <= ei) {

            int mid = si + (ei - si) / 2;

            if (isBadVersion(mid)) {
                lastBad = mid;
                ei = mid - 1;
            }

            else
                si = mid + 1;
        }

        return lastBad;
    }

    private static boolean isBadVersion(int mid) {
        return true;
    }
}
