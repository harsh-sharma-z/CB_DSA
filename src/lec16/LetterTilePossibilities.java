package lec16;

public class LetterTilePossibilities {
	public static void main(String[] args) {
		String str = "AAB";
		int[] freq = new int[26];
		for (char c : str.toCharArray())
			freq[c - 65] ++;
		System.out.println(countPossibilities(freq, ""));
	}

	private static int countPossibilities(int[] freq, String s) {
		int count = 0;
		for (int i = 0; i < freq.length; i ++) {
			if (freq[i] >= 1) {
				char ch = (char) (i + 'A');
				freq[i]--;
				count += countPossibilities(freq, s + ch) + 1;
				freq[i]++;
			}
		}
		return count;
	}
}
