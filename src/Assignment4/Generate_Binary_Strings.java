package Assignment4;

import java.util.Scanner;

public class Generate_Binary_Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			String binraw = sc.next();
			generateStrings(binraw, 0);
			System.out.println();
		}
	}

	public static void generateStrings(String bin, int index) {
		if (index == bin.length()) {
			System.out.print(bin + " ");
			return;
		}

		if (bin.charAt(index) == '?') {
			StringBuilder sb = new StringBuilder(bin);
			sb.replace(index, index+1, "0");
			generateStrings(sb.toString(), index + 1);
			sb.replace(index, index+1, "1");
			generateStrings(sb.toString(), index + 1);
		}
		else
			generateStrings(bin, index + 1);
	}
}

/*
5
1??0?101
??
1?
?0
1?1
*/