package day18_Map.c07_Collections;
/*
 * 针对集合操作的工具类
 * 有对集合进行排序（自然排序或者比较器排序）
 * 二分查找
 * 最值
 * 反转
 * 随机置换
 */

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(10);
        list.add(31);
        list.add(14);
        list.add(12);

        System.out.println(list);

        // 使用自然排序必须实现了Comparable接口的类才可以
        Collections.sort(list);
        System.out.println("sort:" + list);
        System.out.println("max:" + Collections.max(list));
        Collections.shuffle(list);
        System.out.println("shuffle:" + list);

        // 自定义对象的自然排序
        Student s1 = new Student("John", 21);
        Student s2 = new Student("Bob", 28);
        Student s3 = new Student("Jerry", 23);
        Student s4 = new Student("Henry", 20);

        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(s1);
        stuList.add(s2);
        stuList.add(s3);
        stuList.add(s4);

        System.out.println(stuList);

        Collections.sort(stuList);
        System.out.println(stuList);
    }
}
