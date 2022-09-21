package lec11;

public class Find_Element_Reverse {
	public static void main(String[] args) {
		int[] arr = new int[]{2,3,5,4,1,3,7,3,6};
		System.out.println(findElementReverse(arr, arr.length - 1, 3));
	}

	public static int findElementReverse(int[] num, int index, int target) {
		if (index <= 0)
			return -1;

		if (num[index] == target)
			return index;

		return findElementReverse(num, index - 1, target);
	}
}
