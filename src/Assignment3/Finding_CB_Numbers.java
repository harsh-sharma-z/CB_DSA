package Assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Finding_CB_Numbers {

	final static List<Long> constCB = new ArrayList<>();

	static {
		long[] arr = new long[]{2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 29L};
		for (long val : arr)
			constCB.add(val);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String inp = sc.next();

		int count = 0;
		boolean[] isUsed = new boolean[len];
		Arrays.fill(isUsed, false);

		for (int lenSub = 1; lenSub <= len; lenSub ++) {
 			for (int si = 0; si <= len - lenSub; si ++) {
				int ei = si + lenSub;

				if (isCBNumber(inp.substring(si, ei))) {
					boolean flag = true;

					for (int i = si; i < ei; i ++) {
						if (isUsed[i]) {
							flag = false;
							break;
						}
					}

					if (flag) {
						Arrays.fill(isUsed, si, ei, true);
						count ++;
					}

				}
			}
		}

		System.out.println(count);
	}

	public static boolean isCBNumber(String currNum) {
		if (currNum.equals("1") || currNum.equals("0"))
			return false;

		long val = Long.parseLong(currNum);
		if (constCB.contains(val))
			return true;

		for (long i : constCB)
			if (val % i == 0)
				return false;

		return true;
	}
}
