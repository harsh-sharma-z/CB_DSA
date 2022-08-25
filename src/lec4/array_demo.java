package lec4;

/*
    Q: Is java call by reference or call by value?

    A:
        Java is call by value, always.
        Whenever we call a function with some reference variable, we always send the reference integer but not the
        actual reference, changes made inside the function on reference variable will not reflect in the calling
        function.



 */

public class array_demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 = {3,2,1};

        System.out.println(arr[0] + " " + arr2[0]);
        swap(arr, arr2);
        System.out.println(arr[0] + " " + arr2[0]);
    }

    private static void swap(int[] arr, int[] arr2) {
        int[] temp = arr;
        arr = arr2;
        arr2 = temp;
    }
}
