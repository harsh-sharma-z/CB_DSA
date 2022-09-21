package Assignment3;

import java.util.Scanner;

public class Can_You_Read_This {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char[] strc = str.toCharArray();
		int len = strc.length;

		int s = 0;
		int e = 1;
		while (e < len) {
			if (strc[e] < 97) {
				System.out.println(str.substring(s, e));
				s = e;
				e = e + 1;
			}

			else
				e ++;
		}

		System.out.print(str.substring(s, e));
	}
}
