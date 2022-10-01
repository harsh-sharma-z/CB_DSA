package lec14;

public class Tower_Of_Hanoi {
	public static void main(String[] args) {
		int n = 3;
		String src = "A", help = "B", dest = "C";

		toh(n, src, help, dest);
	}

	public static void toh(int n, String src, String help, String des) {
		if (n == 0)
			return;
		toh(n-1, src, des, help);
		System.out.println("shift disk " + n + " from " + src + " to " + des + ".");
		toh(n-1, help, src, des);
	}
}
