// solved some array problems on Leetcode in complete lecture 5.

package lec6;

public class Bin_Search {
    /*
        Binary Search : Which is applied when our search space is sorted.
        It is a Divide & Conquer Algorithm.

        While applying it to an Array, it needs to be sorted.
     */

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,6,7,8,9,11,13,14,18,20,24,27};

        System.out.println(search(arr, 5));
    }

    public static int search(int[] arr, int item) {
        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si)/2;

            if (arr[mid] == item)
                return mid;

            else if (arr[mid] > item)
                ei = mid-1;

            else
                si = mid+1;
        }
        return -1;
    }

}
