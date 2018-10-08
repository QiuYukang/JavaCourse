package day17_Collection_Set.c02_HashSet;
/*
 * 底层使用的是HashMap
 * 必须重写hashCode()和equals() 才能人为成员变量全部一样才认为是同一个对象
 */

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

        Student s1 = new Student("Bob", 21);
        Student s2 = new Student("Jerry", 29);
        Student s3 = new Student("Henry", 31);
        Student s4 = new Student("Jackson", 31);
        Student s5 = new Student("Jerry", 29);

        // s2和s5的hashCode一样（在重写了hashCode()之后）
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);

        // 必须重写equals方法才能判断出不重复的Student类，否则比较的是地址，则s2 s5不可能重复
        // add()依赖于hashCode()和equals()方法
        // 必须重写这两个方法
        for (Student s : hs) {
            System.out.println(s);
        }
    }
}
