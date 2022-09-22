package Assignment3;

import java.util.Scanner;

public class Strings_Odd_Even_Character {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();

		for (int i = 0; i < c.length; i ++) {
			c[i] = (char) (c[i] + (i%2 == 0 ? 1 : -1));
		}

		System.out.println(new String(c));
	}
}
