package lec13;

public class Count_Sequence {

	static int count = 0;

	public static void main(String[] args) {
		String s = "abc";

//		 using static variable...
		printPermutation(s, "");
		System.out.println(count);

//		 without using static variable...
		System.out.println(getCount(s, ""));
	}

	public static void printPermutation(String ques, String ans) {
		if (ques.equals("")) {
			System.out.println(ans);
			count++;
			return;
		}

		char ch = ques.charAt(0);
		printPermutation(ques.substring(1), ans);
		printPermutation(ques.substring(1), ans + ch);
	}

	public static int getCount(String ques, String ans) {
		if (ques.equals(""))
			return 1;

		char ch = ques.charAt(0);
		return getCount(ques.substring(1), ans) + getCount(ques.substring(1), ans + ch);
	}
}
