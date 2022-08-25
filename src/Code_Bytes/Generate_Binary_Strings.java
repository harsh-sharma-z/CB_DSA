package Code_Bytes;

import java.util.Scanner;

public class Generate_Binary_Strings {

    static String getBinaryString(int num, int len) {

        int bin = 0;
        int rem;
        int mul = 1;
        int binLen = 0;
        while (num > 0) {
            rem = num%2;
            bin = bin + rem*mul;
            mul *= 10;
            num /= 2;
            binLen ++;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len-binLen; i++)
            stringBuilder.append(0);

        if (bin != 0) stringBuilder.append(bin);

        return stringBuilder.toString();
    }

    static String getPermutedString(char[] ini_char, String toInsert) {
        int pos = 0;

        for (int i = 0; i < ini_char.length; i++) if (ini_char[i] == '?') ini_char[i] = toInsert.charAt(pos++);

        return new String(ini_char);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String iniNum = sc.next();
            char[] ini_char = iniNum.toCharArray();

            int count_rep = 0;
            for (char c : ini_char) count_rep += c == '?' ? 1 : 0;

            String[] perms = new String[(int) Math.pow(2, count_rep)];

            int count = 0;
            for (int i = 0; i < perms.length; i++) perms[i] = getBinaryString(count++, count_rep);

            for (String perm : perms)
                System.out.print(getPermutedString(ini_char.clone(), perm) + " ");
            System.out.println();
        }
    }
}

/*
6
1??0?101
01?011
?1?000?0?1
?110?00100?1010?010?0?0?110
0?1111?1?11?10
?111?01?1?10?00?01011

 */
