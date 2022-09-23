package Assignment3;

import java.util.Scanner;

public class Strings_isPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(isPalindrome(sc.next()));
	}

	public static boolean isPalindrome(String str) {
		int l = 0;
		int h = str.length() - 1;

		while (l < h) {
			if (str.charAt(l) != str.charAt(h))
				return false;
			l ++;
			h --;
		}

		return true;
	}
}
