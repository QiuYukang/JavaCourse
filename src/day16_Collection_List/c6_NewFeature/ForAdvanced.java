package day16_Collection_List.c6_NewFeature;

/*
    JDK5新特性 增强for
    简化数组和集合的遍历，大部分情况下使用增强for做遍历
    可以用来替代迭代器--要注意和迭代器一样的问题：并发修改异常
 */

import java.util.ArrayList;

public class ForAdvanced {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 2, 1};

        // 普通for
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 增强for
        for (int i : arr) {
            System.out.println(i);
        }

        // 增强for
        ArrayList<String> al = new ArrayList<>();

        al.add("Hello");
        al.add("World");
        al.add("Java");

        for (String s : al) {
            System.out.println(s);
        }


    }
}
