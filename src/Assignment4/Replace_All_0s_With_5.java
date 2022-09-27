package Assignment4;

import java.util.Scanner;

public class Replace_All_0s_With_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(convert0to5(String.valueOf(num), 0, 0));
	}

	private static int convert0to5(String num, int index, int res) {
		if (index == num.length())
			return res;

		res = res*10;
		if (num.charAt(index) == '0')
			res += 5;
		else
			res += (num.charAt(index) - 48);

		return convert0to5(num, index + 1, res);
	}
}
