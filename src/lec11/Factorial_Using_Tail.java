package lec11;

public class Factorial_Using_Tail {
	public static void main(String[] args) {
		System.out.println(fact_tail(1, 5));
	}

	public static int fact_tail(int mul, int n) {
		return n == 0 ? mul : fact_tail(mul * n, n - 1);
	}
}
