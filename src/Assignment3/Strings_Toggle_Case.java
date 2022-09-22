package Assignment3;

import java.util.Scanner;

public class Strings_Toggle_Case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] c = str.toCharArray();

		for (int i = 0; i < c.length; i ++) {
			if (str.charAt(i) >= 97)
				c[i] = (char) (c[i] - 32);
			else
				c[i] = (char) (c[i] + 32);
		}

		System.out.println(new String(c));
	}
}
