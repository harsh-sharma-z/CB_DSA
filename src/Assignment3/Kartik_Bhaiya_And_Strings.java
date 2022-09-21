package Assignment3;

import java.util.Scanner;

public class Kartik_Bhaiya_And_Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int mis = sc.nextInt();
		char[] str = sc.next().toCharArray();

		int res = Math.max(maxPerfectString(str, mis, 'a'), maxPerfectString(str, mis, 'b'));
		System.out.println(res);
	}

	public static int maxPerfectString(char[] str, int mis, char c) {
		int sLen = str.length;

		int si = 0, ei = 0, miss = 0, res = 0;
		char lc = c == 'a' ? 'b' : 'a';

		while (ei < sLen) {
			if (str[ei] != lc)
				miss ++;

			while (miss > mis) {
				if (str[si] != lc)
					miss --;
				si ++;
			}

			res = Math.max (res, ei - si + 1);
			ei ++;
		}

		return res;
	}
}
