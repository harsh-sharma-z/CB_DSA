package lec14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lexicographical_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(new Lexicographical_Numbers().lexicalOrder(n));
	}

	public List<Integer> lexicalOrder(int n) {
		List<Integer> result = new ArrayList<>();

		for (int i = 1; i <= 9; i ++)
			lexicalOrderResult(n, i, result);

		return result;
	}

	private void lexicalOrderResult(int n, int s, List<Integer> result) {
		if (s <= n)
			result.add(s);
		else
			return;

		for (int i = 0; i <= 9; i ++) lexicalOrderResult(n, s*10+ i, result);
	}
}
