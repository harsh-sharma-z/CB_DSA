// works on pigeonhole principle and cumulative sum
// for negative remainder we take its positive counterpart, for -a remainder, positive counterpart is -a + n = n-a.
// for variation, if given do remainder with K, then make freq array of K size and all the calculation with K.

package Assignment2;

import java.util.Scanner;

public class Divisible_Sub_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            long[] nums = new long[n];

            for(int i = 0; i < n; i ++) nums[i] = sc.nextInt();

            long[] freq = new long[n];
            freq[0] = 1; // adding one zero from initial, sum of no elements.

            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += nums[i];

                int idx = (int) (sum % n);
                if (idx < 0)
                    idx += n;

                freq[idx]+=1;
            }

            long res = 0;
            for (int i = 0; i < n; i ++) {
                if (freq[i] >= 2) {
                    long fq = freq[i];
                    res += fq * (fq - 1) / 2;
                }
            }

            System.out.println(res);
        }
    }
}


