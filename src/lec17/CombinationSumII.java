package lec17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
	public static void main(String[] args) {
		System.out.println(new CombinationSumII().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
	}

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> output = new ArrayList<>();
		combinationSumHelper(candidates, target, 0, new ArrayList<>(), output);
		return output;
	}

	public void combinationSumHelper(int[] candidates, int target, int k, ArrayList<Integer> res, List<List<Integer>> output) {
		if (target < 0)
			return;

		if (target == 0) {
			output.add(List.copyOf(res));
			return;
		}

		for (int i = k; i < candidates.length; i ++) {
			if (i!= k && candidates[i] == candidates[i-1])
				continue;

			res.add(candidates[i]);
			combinationSumHelper(candidates, target - candidates[i], i + 1, res, output);
			res.remove(res.size() - 1);
		}
	}
}
