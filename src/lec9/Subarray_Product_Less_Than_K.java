package lec9;

public class Subarray_Product_Less_Than_K {
  public static void main(String[] args) {
    System.out.println(new Subarray_Product_Less_Than_K().numSubarrayProductLessThanK(new int[]{10,5,2,6}, 100));
  }

  public int numSubarrayProductLessThanK(int[] arr, int k) {
      int ans = 0;
      int si = 0;
      int ei = 0;
      int p = 1;

      while (ei < arr.length) {
          // window grow
          p *= arr[ei];

          // window shrink
          while (p >= k && si <= ei)
              p /= arr[si++];

          // calc ans
          ans += ei - si + 1;
          ei ++;
      }

      return ans;
  }
}
