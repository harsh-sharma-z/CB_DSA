package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Next_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int numOfDigit = sc.nextInt();
            int[] digits = new int[numOfDigit];

            // getting the digits in the array.
            for (int i = 0; i < numOfDigit; i++) digits[i] = sc.nextInt();

            // if there is only 1 digit then we can just print the digit again.
            if(numOfDigit == 1) {
                System.out.println(digits[0]);
                continue;
            }

            nextPermutation(digits);
            for (int el : digits) System.out.print(el + " ");

            // moving to next line
            System.out.println();
        }
    }

    public static void nextPermutation(int[] nums) {
        boolean isPermutationFound = false;
        int len = nums.length;
        for (int i = len-2; i>=0 && !isPermutationFound ; i--) {
            if (nums[i] < nums[i+1]) {
                int swapIndex = nextJustLargerIndex(nums, nums[i], i+1, len-1);
                swap(nums, i, swapIndex);
                Arrays.sort(nums, i+1, len);
                isPermutationFound = true;
            }
        }

        if(!isPermutationFound) {
            reverseArray(nums);
        }
    }

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void reverseArray(int[] nums) {
        int len = nums.length;
        for(int i=0; i<len/2; i++) {
            swap(nums, i, len-i-1);
        }
    }

    public static int nextJustLargerIndex(int[] arr, int key, int startIndex, int endIndex) {
        int justLarge = Integer.MAX_VALUE;
        int justLargeIndex = startIndex;
        for (int i = startIndex; i <= endIndex; i++) {
            if(key < arr[i] && arr[i] < justLarge) {
                justLarge = arr[i];
                justLargeIndex = i;
            }
        }
        return justLargeIndex;
    }

}

/*
2
3
1 2 3
3
3 2 1

 */