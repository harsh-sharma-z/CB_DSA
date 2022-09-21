package Assignment3;

import java.util.*;

public class Non_Repeating_Character {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		while (T-- > 0) {
			Map<Character, Integer> map = new HashMap<>();
			char[] str = sc.next().toCharArray();

			for (char c : str)
				map.put(c, map.getOrDefault(c, 0) + 1);

			boolean isFound = false;
			for (char c : str) {
				int val = map.get(c);
				if (val == 1) {
					System.out.println(c);
					isFound = true;
					break;
				}
			}

			if (!isFound)
				System.out.println(-1);
		}
	}
}
