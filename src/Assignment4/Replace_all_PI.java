package Assignment4;

import java.util.Scanner;

public class Replace_all_PI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			String str = sc.next();
			System.out.println(printConverted(str, 0));
		}
	}

	private static String printConverted(String str, int index) {
		if (index == str.length())
			return str;

		if (index < str.length() - 1 && str.charAt(index) == 'p' && str.charAt(index+1) == 'i') {
			index += 2;
			return printConverted(str.substring(0, index-2) + "3.14" + str.substring(index), index);
		}
		else
			return printConverted(str, index + 1);
	}
}
