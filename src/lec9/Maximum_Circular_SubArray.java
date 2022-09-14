// This question uses Kadane's Algo
package lec9;

import java.util.Scanner;

public class Maximum_Circular_SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int noe = sc.nextInt();
            int[] arr = new int[noe];

            for (int i = 0; i < noe; i++) {
                arr[i] = sc.nextInt();
            }

            int ls = kadaneAlgoMax(arr);
            int cs = kadaneAlgoCir(arr);
            if (cs == 0)
                System.out.println(ls);
            else
                System.out.println(Math.max(ls, cs));
        }
    }

    public static int kadaneAlgoMax (int[] arr) {
        int ans = 0;
        int currSum = 0;

        for (int j : arr) {
            currSum = Math.max(j, currSum + j);
            ans = Math.max(currSum, ans);
        }

        return ans;
    }

    public static int kadaneAlgoCir (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = -arr[i];
            sum += arr[i];
        }

        int max = kadaneAlgoMax(arr);

        return -(sum - max);
    }
}
