package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Inverse_of_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] nums = new int[num];
        for (int i = 0; i < num; i ++) nums[i] = sc.nextInt();

        int[] res = new int[num];
        int ind = 0;
        for (int val : nums) res[val] = ind++;

        for (int val : res) System.out.print(val + " ");
    }
}
