package Code_Bytes;

import java.util.HashSet;
import java.util.Scanner;

public class Remove_Chars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        sc.nextLine();
        while (T-- > 0) {
            String s1 = sc.nextLine();
            char[] s2 = sc.nextLine().toCharArray();

            HashSet<Character> set = new HashSet<>();
            for (char c : s2)
                set.add(c);

            set.remove(' ');

            StringBuilder str = new StringBuilder();
            for (char c : s1.toCharArray())
                str.append(set.contains(c) ? "" : c);

            System.out.println(str);
        }
    }
}