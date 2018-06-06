package day05;

import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args){
        //数组动态初始化，默认赋值为0
        int[] intArray = new int[2];

        //数组静态初始化，自动取大小
        byte[] byteArray = {'a','b','c'};

        //数组地址
        int[] intArray1 = intArray;
        intArray1[0] = byteArray[0];

        //遍历数组
        showArray(intArray, intArray.length);
        System.out.println("\nbyteArray = {'a','b','c'}");
        showArray(byteArray, byteArray.length);
    }

    public static void showArray(int[] array, int max){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input a int array index(1~"+max+"):");
        int n = sc.nextInt();

        if((n <= array.length) && (n > 0)) {
            for (int index = 0; index < n; index++)
                System.out.print("int array" + "[" + index + "]: " + array[index] + "\t");
        }else {
            System.out.println("out of the index of array!");
        }
    }

    public static void showArray(byte[] array, int max){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input a int array index(1~"+max+"):");
        int n = sc.nextInt();

        if((n <= array.length) && (n > 0)) {
            for (int index = 0; index < n; index++)
                System.out.print("byte array" + "[" + index + "]: " + array[index] + "\t");
        }else {
            System.out.println("out of the index of array!");
        }
    }
}
