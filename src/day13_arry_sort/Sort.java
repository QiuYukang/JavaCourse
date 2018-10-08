package day13_arry_sort;

public class Sort {

    // 冒泡排序---每次选出最大的依次放在后面
    public static int[] bubbleSort(int[] arr) {
        int top = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < top; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print("第" + (i + 1) + "次冒泡排序结果：");
            showArr(arr);
            top -= 1;
        }

        return arr;
    }

    // 选择排序----每次选择出一个最小的一次放在前面
    public static int[] selectSort(int[] arr) {
        /*
        int min;

        for (int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    int temp = arr[j];
                    arr[j] = min;
                    min = temp;
                }
            }
            arr[i] = min;
            System.out.print("第" + (i + 1) + "次选择排序结果：");
            showArr(arr);
        }
        */

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print("第" + (i + 1) + "次选择排序结果：");
            showArr(arr);
        }

        return arr;
    }

    // 遍历数组
    public static void showArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i] + "]");
            }
        }
        System.out.println();
    }
}
