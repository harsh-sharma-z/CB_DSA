package lec6;

import java.util.Scanner;

public class Square_Root_Floor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(root(sc.nextInt()));
    }

    // program to find the largest perfect square under n.
    // given n in x^2 <= n, find the largest x.
    public static int root(int n) {
        int low = 1;
        int high = n;

        int ans = 0;
        while (low <= high) {
            int mid = low + (high-low)/2;

            if (Math.pow(mid, 2) <= n) {
                ans = mid;
                low = mid + 1;
            }

            else
                high = mid - 1;
        }

        return ans;
    }

}
