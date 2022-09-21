package Assignment3;

import java.util.Scanner;

public class Playing_with_Good_Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int si, ei, max;
		si = ei = max = 0;

		int len = str.length();
		String vowels = "aeiou";

		while (ei < len) {
			if (vowels.indexOf(str.charAt(ei)) < 0) {
				System.out.println(str.substring(si, ei));
				max = Math.max(max, ei - si);
				si = ei + 1;
			}

			ei++;
		}

		System.out.println(str.substring(si, ei));
		max = Math.max(max, ei - si);
		System.out.println(max);
	}
}
