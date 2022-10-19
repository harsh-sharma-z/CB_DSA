package lec17;

public class WordSearch {
	static boolean isFound = false;
	static int wordLen;

	public boolean exist(char[][] board, String word) {
		isFound = false;
		wordLen = word.length();

		for (int i = 0; i < board.length; i ++)
			for (int j = 0; j < board[0].length && !isFound; j ++)
				existHelper(board, word, 0, i, j);

		return isFound;
	}


	static int[][] cordEdit = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

	public void existHelper(char[][] board, String word, int let, int x, int y) {

		if (y < 0 || x < 0 || x >= board.length || y >= board[0].length || board[x][y] != word.charAt(let))
			return;

		board[x][y] ^= 256;
		let += 1;

		if (let == wordLen) {
			isFound = true;
			return;
		}

		for (int[] i : cordEdit)
			existHelper(board, word, let, x + i[0], y + i[1]);

		board[x][y] ^= 256;
	}

}
