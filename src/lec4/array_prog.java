package lec4;

import java.util.Arrays;

public class array_prog {

    static int linearSearch(int[] arr,int item) {
        for (int i : arr)
            if (i == item)
                return i;

        return -1;
    }

    static int maxIndex(int[] arr) {
        if (arr.length == 0) return -1;

        int max = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > arr[max])
                max = i;

        return max;
    }

    static int minIndex(int[] arr) {
        if (arr.length == 0)
            return -1;

        int min = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < arr[min])
                min = i;

        return min;
    }

    static void reverse(int[] arr) {
        int len = arr.length - 1;

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - i];
            arr[len - i] = temp;
        }
    }

    static void reverseRange(int[] arr, int i, int j) {
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i ++;
            j --;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,3,-1,4,9,7,11,9};

        System.out.println(Arrays.toString(arr));
        reverseRange(arr, 2, 6);
        System.out.println(Arrays.toString(arr));
    }
}
