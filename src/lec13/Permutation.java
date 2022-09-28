package lec13;

public class Permutation {
	public static void main(String[] args) {
		String str = "abca";

		System.out.println("--------- WITH REPEATING STRINGS ---------");
		printPermutation(str, "");
		System.out.println("--------- WITHOUT REPEATING STRINGS ---------");
		printNonRepeating(str, "");
	}

	private static void printPermutation(String str, String res) {
		if (str.equals("")) {
			System.out.println(res);
			return;
		}

		for (int i = 0; i < str.length(); i ++) {
			printPermutation(str.substring(0, i) + str.substring(i).substring(1), res + str.charAt(i));
		}
	}

	private static void printNonRepeating(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}

		boolean[] callsof = new boolean[256];
		for (int i = str.length() - 1; i >= 0; i --) {
			if (!callsof[str.charAt(i)]) {
				callsof[str.charAt(i)] = true;
				printNonRepeating(str.substring(0, i) + str.substring(i).substring(1), res + str.charAt(i));
			}
		}
	}
}
