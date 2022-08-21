package Code_Bytes;

import java.util.Scanner;

public class Strings_Remove_Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();

        StringBuilder build = new StringBuilder();
        char p = ch[0];
        build.append(p);
        for (int i = 1; i < ch.length; i++) {
            if (p == ch[i])
                continue;
            build.append(ch[i]);
            p = ch[i];
        }

        System.out.println(build);
    }
}
