package lec16;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
	public static void main(String[] args) {
		String str = "nitin";
		System.out.println(palindromePartitioning(str));
	}

	public static List<List<String>> palindromePartitioning(String str) {
		List<List<String>> output = new ArrayList<>();
		palindromePartitioningHelper(str,  new ArrayList<>(), output);
		return output;
	}

	public static void palindromePartitioningHelper(String ques, List<String> res, List<List<String>> output) {
		if (ques.equals("")) {
			output.add(List.copyOf(res));
			return;
		}

		for (int i = 1; i <= ques.length(); i ++) {
			String s1 = ques.substring(0, i);
			if (!isPalindrome(s1))
				continue;
			res.add(s1);
			palindromePartitioningHelper(ques.substring(i), res, output);
			res.remove(res.size() - 1);
		}
	}

	public static void printPalindromePartitions(String ques, String res) {
		if (ques.equals("")) {
			System.out.println(res);
			return;
		}

		for (int i = 1; i <= ques.length(); i ++) {
			String s1 = ques.substring(0, i);
			if (!isPalindrome(s1))
				continue;
			printPalindromePartitions(ques.substring(i), res + s1 + "|");
		}
	}

	public static boolean isPalindrome(String str) {
		int l = 0;
		int h = str.length() - 1;

		while (l < h) {
			if (str.charAt(l) != str.charAt(h))
				return false;
			l ++;
			h --;
		}

		return true;
	}
}
