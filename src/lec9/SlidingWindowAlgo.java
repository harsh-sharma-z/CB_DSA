/*
    When do we look for SlidingWindowAlgo

    Conditions to look for ...
        Given :
            - SubArray
            - SubString
        Condition applied :
            - maximum
            - minimum

    Type of window
        1. FIXED SIZE
        2. VARIABLE SIZE

    Prototype :
        - For fixed window :
            1. Create 1st window.
            2. Run a loop, add one value in the window & remove one element.
        - For Variable window :
            1. Grow Window
            2. Shrink (if required)
            3. Calc Ans


    Q (BASIC) :
        Given an array of integers and a variable k, find the subarray of size k with maximum sum.

        Ex: arr = [2,3,7,1,4,11,3,8,15,17,2], k = 3
        Output : 38

 */

package lec9;

public class SlidingWindowAlgo {

  public static void main(String[] args) {
      int[] arr = new int[] {2,3,7,1,4,11,3,8,15,17,2};
      int k = 3;

      System.out.println(maxSlidingWindow(arr, k));
  }

  public static int maxSlidingWindow (int[] arr, int k) {
      int sum = 0;
      int max;

      for(int i = 0; i < k; i++)
          sum += arr[i];

      max = sum;

      for (int i = k; i < arr.length; i ++) {
          sum += arr[i];
          sum -= arr[i - k];
          max = Math.max(sum, max);
      }

      return max;
  }
}
