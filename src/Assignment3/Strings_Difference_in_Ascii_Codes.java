package Assignment3;

import java.util.Scanner;

public class Strings_Difference_in_Ascii_Codes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder();
		int len = str.length();

		sb.append(str.charAt(0));
		for (int i = 1; i < len; i ++) {
			sb.append(str.charAt(i) - str.charAt(i-1));
			sb.append(str.charAt(i));
		}

		System.out.println(sb);
	}
}