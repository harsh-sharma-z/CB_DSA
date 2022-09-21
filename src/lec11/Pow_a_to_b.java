package lec11;

import java.math.BigInteger;
import java.util.Scanner;

public class Pow_a_to_b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(pow_int(sc.nextInt(), sc.nextInt()));
		System.out.println(pow_big_int(sc.nextInt(), sc.nextInt()));
	}

	static int pow_int(int a, int b) {
		return b == 0 ? 1 : a*pow_int(a, b-1);
	}

	static BigInteger pow_big_int(int a, int b) {
		if (b == 0)
			return BigInteger.valueOf(1);
		return pow_big_int(a, b-1).multiply(BigInteger.valueOf(a));
	}
}
