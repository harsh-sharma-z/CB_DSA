package lec9;

import java.util.Scanner;

public class Kartik_Bhaiya_And_Strings {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int mis = sc.nextInt();
      char[] str = sc.next().toCharArray();

      int maxLen = Math.max(maxPerfectString(str, 'a', mis), maxPerfectString(str, 'b', mis));
      System.out.println(maxLen);
  }

  public static int maxPerfectString(char[] str, char missedChar, int k) {
    int sLen = str.length;

    int si = 0;
    int ei = 0;
    int miss = 0;

    int res = 0;

    char lastChar = missedChar == 'a' ? 'b' : 'a';

    while (ei < sLen) {
        if (str[ei] != lastChar)
            miss ++;

        while (miss > k) {
            if (str[si++] != lastChar)
                miss--;
        }

        res = Math.max(res, ei - si + 1);
        ei++;
    }

    return res;
  }
}
