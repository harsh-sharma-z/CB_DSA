package lec12;

public class Fibo_recur {
	public static void main(String[] args) {
		System.out.println(fibo(5));
	}

	public static int fibo(int n) {
		if (n == 0 || n == 1)
			return n;
		return fibo(n-1) + fibo(n-2);
	}
}
