package Assignment4;

import java.util.Scanner;

public class RecursionTwins {
	static int count;

	public static void main(String[] args) {
		count = 0;
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();

		count = countTwins(inp);
		System.out.println(count);
	}

	public static int countTwins(String inp) {
		if (inp.length() < 3)
			return 0;

		int count = 0;
		if (inp.charAt(0) == inp.charAt(2) && inp.charAt(1) != inp.charAt(0))
			count ++;

		return count + countTwins(inp.substring(1));
	}
}
