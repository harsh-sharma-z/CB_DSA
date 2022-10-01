package lec14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generate_Parentheses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(new Generate_Parentheses().generateParenthesis(num));
	}

	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		generatedParethesis(n, 0, 0, "", result);
		return result;
	}

	private void generatedParethesis(int n, int openBrackets, int closedBrackets, String generatedString, List<String> result) {
		if (openBrackets == n && closedBrackets == n) {
			result.add(generatedString);
			return;
		}

		if (openBrackets < n)
			generatedParethesis(n, openBrackets + 1, closedBrackets, generatedString + "(", result);

		if (closedBrackets < openBrackets)
			generatedParethesis(n, openBrackets, closedBrackets + 1, generatedString + ")", result);

	}

}
