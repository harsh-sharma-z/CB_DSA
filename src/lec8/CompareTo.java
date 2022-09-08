package lec8;

public class CompareTo {
    public static void main(String[] args) {
        System.out.println(compareTo("aa", "aa"));
    }

    public static int compareTo (String s1, String s2) {
        int i,j;
        i = j = 0;

        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) < s2.charAt(j))
                return -1;
            else if (s1.charAt(i) > s2.charAt(j))
                return 1;
            i ++;
            j ++;
        }

        if (i - j == 0)
            return 0;
        else if (i == 0)
            return -1;
        else
            return +1;


    }
}
