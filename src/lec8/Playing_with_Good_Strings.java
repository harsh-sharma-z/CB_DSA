package lec8;

import java.util.*;
public class Playing_with_Good_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int max = 0;
        int curr = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                curr++;
            else {
                max = Math.max(max, curr);
                curr = 0;
            }
        }

        max = Math.max(max, curr);
        System.out.println(max);
    }
}