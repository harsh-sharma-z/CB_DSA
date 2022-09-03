package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Calculate_The_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] nums = new int[count];
        for (int i = 0; i < count; i++) nums[i] = sc.nextInt();

        int opCount = sc.nextInt();

        int[] operations = new int[opCount];
        for (int i = 0; i < opCount; i++) operations[i] = sc.nextInt();

        for(int op : operations)
            nums = getResult(nums, op);

        long sum = 0;
        for (int num : nums){
            sum += num;
            if (sum >= 1000000007)
                sum -= 1000000007;
        }

        System.out.println(sum);

    }

    private static int[] getResult(int[] nums, int op) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int index = (i - op) >= 0 ? (i - op) : nums.length + (i - op);
            answer[i] = nums[i] + nums[index];
        }

        return answer;
    }
}
