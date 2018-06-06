package day06;

/**
 * Java中的参数传递问题
 * 基本类型：只是值的复制，不改变原值
 * 引用类型（数组）：地址传递，会改变原数组值
 */

public class Array2Demo3 {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int[] array = {1,2,3,4};

        //基本类型，值传递
        System.out.println("in main function: a = "+a+" b = "+b);
        change(a, b);
        System.out.println("after change(int a, int b) in main function: a = "+a+" b = "+b);

        System.out.println();

        //引用类型，地址传递
        System.out.print("in main function:");
        showArray(array);
        change(array);
        System.out.print("after change in main function:");
        showArray(array);
    }

    /**
     * 交换两个整数值
     */
    public static void change(int a, int b){
        System.out.println("in change function: a = "+a+" b = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after change in change function: a = "+a+" b = "+b);
    }

    /**
     * 逆序数组
     */
    public static void change(int[] array){
        int temp;
        int medium;

        System.out.print("in change function:");
        showArray(array);

        medium = array.length / 2;

        for(int i=0; i<medium; i++){
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }

        System.out.print("after change in change function:");
        showArray(array);
    }

    /**
     * 遍历数组
     */
    public static void showArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
}
