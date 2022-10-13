package lec15;

public class FormMoneyFromCoin {

	public static void main(String[] args) {
		FormMoneyFromCoin obj = new FormMoneyFromCoin();
		obj.printPermutation(new int[]{2,3,5,7,8}, 10);
	}

	public void printPermutation(int[] coins, int amount) {
		printPermutationOfCoins(coins, amount, "");
	}

	public void printPermutationOfCoins(int[] coins, int amount, String res) {
		if (amount < 0)
			return;

		if (amount == 0) {
			System.out.println(res);
			return;
		}

		for (int coin : coins) {
			amount -= coin;
			printPermutationOfCoins(coins, amount, res + coin);
			amount += coin;
		}
	}
}
