package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_of_Roses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            // input
            int numOfRoses = sc.nextInt();

            int[] prices = new int[numOfRoses];
            for (int i = 0; i < numOfRoses; i++) prices[i] = sc.nextInt();
            int amount = sc.nextInt();

            // computation
            Arrays.sort(prices);
            printResult(prices, amount);
            sc.nextLine();
        }
    }

    private static void printResult(int[] prices, int amount) {
        int lo = 0;
        int hi = prices.length - 1;

        int diff = Integer.MAX_VALUE;
        int[] ans = new int[2];
        while (lo <= hi) {

            int h = prices[hi];
            int l = prices[lo];

            if (h + l == amount) {
                if (h - l < diff) {
                    ans[0] = l;
                    ans[1] = h;
                    diff = h - l;
                }
                lo ++;
                hi --;
            }

            else if (h + l > amount)
                hi --;

            else
                lo ++;
        }

        System.out.println("Deepak should buy roses whose prices are " + ans[0] + " and " + ans[1] + ".");
    }
}
