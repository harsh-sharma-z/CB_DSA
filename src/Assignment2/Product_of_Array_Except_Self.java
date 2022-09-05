package Assignment2;

import java.util.Scanner;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num];

        for (int i = 0; i < num; i ++) nums[i] = sc.nextInt();

        long[] mul = new long[num];
        mul[0] = 1;
        for (int i = 1; i < num; i ++) mul[i] = mul[i - 1] * nums[i - 1];

        long rightMul = 1;
        for (int i = num - 1; i >= 0; i --) {
            mul[i] *= rightMul;
            rightMul *= nums[i];
        }

        for (long val : mul) System.out.print(val + " ");
    }
}
