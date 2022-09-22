package lec12;

public class printSubsequence {
	public static void main(String[] args) {
		String ques = "abc";
		String ans = "";
		printSubseq(ques, 0, ans, ques.length());
		printPermutation(ques, ans);
	}

	private static void printPermutation(String ques, String ans) {
		if (ques.equals("")) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		printPermutation(ques.substring(1), ans);
		printPermutation(ques.substring(1), ans + ch);
	}

	public static void printSubseq(String str, int pos, String res, int len) {
		if (pos == len) {
			if (res.equals(""))
				res = "_";
			System.out.println(res);
			return;
		}

		printSubseq(str, pos + 1, res, len);
		printSubseq(str, pos + 1, res + str.charAt(pos), len);
	}
}
