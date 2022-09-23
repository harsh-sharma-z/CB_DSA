package Assignment3;

import java.util.HashMap;
import java.util.Scanner;

public class Strings_Max_Frequency_Character {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(printMaxOccurance(sc.next()));
	}

	public static char printMaxOccurance(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str.toCharArray())
			map.put(c, map.getOrDefault(c, 0) + 1);

		int max = 0;
		char res = str.charAt(0);
		for (char ch : map.keySet()) {
			if (max < map.get(ch)) {
				max = map.get(ch);
				res = ch;
			}
		}

		return res;
	}
}
