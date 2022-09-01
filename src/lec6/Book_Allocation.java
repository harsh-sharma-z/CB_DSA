package lec6;

import java.util.Scanner;

public class Book_Allocation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[] books = new int[n]; // books array is sorted.
            for (int i = 0; i < n; i++) books[i] = sc.nextInt();

            System.out.println(minimumNumberOfPages(books, m));
        }
    }

    public static int minimumNumberOfPages(int[] books, int numOfStudent) {
        int sum = 0;
        for (int page : books) sum += page;
        int hi = sum;
        int lo = 0;

        int answer = lo;
        while (lo <= hi) {
            int mid = lo + (hi-lo) / 2;

            if (isPagesDivisible(books, mid, numOfStudent)) {
                answer = mid;
                hi = mid - 1;
            }

            else
                lo = mid + 1;
        }
        return answer;
    }

    public static boolean isPagesDivisible(int[] books, int mid, int numOfStudent) {
        int s1 = 0;
        int readPage = 0;
        int i = 0;
        while (i < books.length) {
            if (readPage + books[i] <= mid) {
                readPage += books[i];
                i++;
            }
            else {
                readPage = 0;
                s1++;
            }
        }

        return s1 < numOfStudent;
    }

}
