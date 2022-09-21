package Assignment2;

import java.util.Scanner;

public class Alex_Goes_Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfItems = sc.nextInt();
        int[] items = new int[numOfItems];
        for(int i = 0; i < numOfItems; i ++) items[i] = sc.nextInt();

        int numOfQueries = sc.nextInt();
        while(numOfQueries-- > 0) {
            int amount = sc.nextInt();
            int itemCount = sc.nextInt();

            String res;
            if (isExpendable(items, amount, itemCount)) {
                res = "Yes";
            }
            else
                res = "No";

            System.out.println(res);
        }
    }

    private static boolean isExpendable(int[] items, int amount, int itemCount) {
        int currCount = 0;

        for (int itemPrice : items) {
            if (itemPrice <= amount && amount % itemPrice == 0)
                currCount++;
        }

        return currCount >= itemCount;
    }
}
