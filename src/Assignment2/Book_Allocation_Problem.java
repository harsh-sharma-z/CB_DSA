package Assignment2;

import java.util.Scanner;

public class Book_Allocation_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T -- > 0) {
            int bookCount = sc.nextInt(), studentCount = sc.nextInt();
            int[] books = new int[bookCount];

            for (int i = 0; i < bookCount; i ++) books[i] = sc.nextInt();

            int sumOfAllPages = 0;
            int max = Integer.MIN_VALUE;
            for (int page : books) {
                sumOfAllPages += page;
                max = Math.max(max, page);
            }

            int maxPage = sumOfAllPages;
            int minPage = max;

            int answer = 0;
            while (minPage <= maxPage) {
                int midPage = minPage + (maxPage - minPage) / 2;

                if (isDivisible(books, midPage, studentCount)) {
                    answer = midPage;
                    maxPage = midPage - 1;
                }
                else
                    minPage = midPage + 1;
            }

            System.out.println(answer);
        }
    }

    public static boolean isDivisible (int[] books, int midPage, int studentCount) {
        int stCount = 1;
        int pageCount = 0;

        for (int page : books) {
            if (pageCount + page > midPage) {
                stCount++;
                pageCount = page;
            }
            else
                pageCount += page;
        }

        return stCount <= studentCount;
    }
}
