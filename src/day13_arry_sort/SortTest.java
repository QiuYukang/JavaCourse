package day13_arry_sort;

public class SortTest {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        int[] arr2 = arr.clone();

        System.out.print("冒泡排序前：");
        showArr(arr);

        Sort.bubbleSort(arr);
        System.out.print("冒泡排序后：");
        showArr(arr);

        System.out.println();
        System.out.print("选择排序前：");
        showArr(arr);
        Sort.selectSort(arr2);
        System.out.print("选择排序后：");
        showArr(arr);
    }

    public static void showArr(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1){
                System.out.print(arr[i]+", ");
            }else{
                System.out.print(arr[i]+"]");
            }
        }
        System.out.println();
    }
}
