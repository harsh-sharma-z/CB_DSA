package lec8;

import java.util.Scanner;

public class Print_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 1; i <= s.length(); i++) {
            printSubString(s, i);
        }
    }

    public static void printSubString(String s, int len) {
        int i = 0;
        int j = len;

        while (j < s.length()+1)
            System.out.println(s.substring(i++, j++));
    }
}
