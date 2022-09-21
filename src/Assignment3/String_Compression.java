package Assignment3;

import java.util.Scanner;

public class String_Compression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		StringBuilder sb = new StringBuilder();

		sb.append(str.charAt(0));
		char curr = str.charAt(0);
		int count = 0;
		int pos = 0;
		int len = str.length();
		while (pos < len) {
			if (str.charAt(pos) == curr)
				count ++;

			else {
				sb.append(count);
				count = 1;
				curr = str.charAt(pos);
				sb.append(curr);
			}

			pos ++;
		}

		sb.append(count);

		System.out.println(sb);
	}
}
