package day06;

import java.util.Scanner;

public class Array2Demo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input a num:");
        int n = sc.nextInt();

        showYangHui(n);
    }

    /**
    *    输出杨辉三角
    *    1
    *    1 1
    *    1 2 1
    *    1 3 3 1
    *    1 4 6 4 1
    */
    public static void showYangHui(int n){
        int[][] array = new int[n][];

        for(int i=0; i<n; i++){
            array[i] = new int[i+1];

            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    array[i][j] = 1;
                } else{
                    array[i][j] = array[i-1][j-1] + array[i-1][j];
                }
            }
        }

        showArray2(array);
    }

    /**
     * 打印二维数组
     */
    public static void showArray2(int[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}
