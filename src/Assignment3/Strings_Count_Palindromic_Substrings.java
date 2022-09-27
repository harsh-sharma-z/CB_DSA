package Assignment3;

import java.util.Scanner;

public class Strings_Count_Palindromic_Substrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(countPalindromicSubstring(sc.next()));
	}

	static int countPalindromicSubstring(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i ++)
			for (int j = i + 1; j <= str.length(); j ++)
				if (isPalindrome(str.substring(i, j), j - i))
					count++;

		return count;
	}

	static boolean isPalindrome(String str, int len) {
		int l = 0;
		int h = len - 1;
		while (l < h) {
			if (str.charAt(l) != str.charAt(h))
				return false;
			l ++;
			h --;
		}
		return true;
	}
}
