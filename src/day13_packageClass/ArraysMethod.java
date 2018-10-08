package day13_packageClass;

import java.util.Arrays;

public class ArraysMethod {
    public static void main(String[] args) {
        int[] arr = {23, 45, 18, 62, 9, 45, 133};
        // int[] arr2 = arr.clone();

        System.out.println("排序前："+ Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("排序后："+Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 18));

        // System.out.println(Arrays.binarySearch(arr2, 18));
    }
}
