package Assignment4;

import java.util.Scanner;

public class Recursion_Convert_String_To_Integer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(convertStringToInt(str, 0, 0));
	}

	private static int convertStringToInt(String str, int i, int number) {
		if (i == str.length())
			return number;
		int val = str.charAt(i) - 48;
		number = number*10 + val;
		return convertStringToInt(str, i + 1, number);
	}
}
