package Assignment3;

import java.util.Scanner;

public class Strings_Remove_Duplicates {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		StringBuilder res = new StringBuilder();
		char lastChar = str.charAt(0);

		res.append(lastChar);
		for (char c : str.toCharArray()) {
			if (c != lastChar) {
				res.append(c);
				lastChar = c;
			}
		}

		System.out.println(res);
	}
}
