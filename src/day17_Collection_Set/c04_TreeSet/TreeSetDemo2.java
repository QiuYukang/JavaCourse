package day17_Collection_Set.c04_TreeSet;
/*
 * ---自然排序---无参构造
 * 明确是按照年龄从小到大排序
 * 成员变量相同则视为同一对象
 */

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("Bob", 21);
        Student s2 = new Student("Jerry", 29);
        Student s3 = new Student("Henry", 31);
        Student s4 = new Student("Jackson", 31);
        Student s5 = new Student("Jerry", 29);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        // 如果不implement Comparable就报错
        // java.lang.ClassCastException: Student cannot be cast to java.lang.Comparable
        for (Student s : ts) {
            System.out.println(s);
        }
    }
}
