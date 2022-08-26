package Code_Bytes;

import java.util.Scanner;

public class Add_It_Up {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] sum = sc.next().toCharArray();

        int[] freq = new int[10];
        for (char c : sum) if (c != '+') freq[c - 48]++;

        int pos = 0;
        for(int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                sum[pos] = (char) (i+48);
                pos+=2;
                freq[i]--;
            }
        }

        System.out.println(new String(sum));
    }
}