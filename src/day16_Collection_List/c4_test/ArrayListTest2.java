package day16_Collection_List.c4_test;

/*
    出去去除集合中的自定义对象(重复是指成员变量重复，自己写的类重写equals方法即可)
 */

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();

        Student s1 = new Student("Bob", 21);
        Student s2 = new Student("Jerry", 29);
        Student s3 = new Student("Henry", 31);
        Student s4 = new Student("Jackson", 31);
        Student s5 = new Student("Jerry", 29);
        Student s6 = new Student("Jerry", 20);
        Student s7 = new Student("Henry", 31);
        Student s8 = new Student("John", 23);

        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);
        l.add(s5);
        l.add(s6);
        l.add(s7);
        l.add(s8);

        System.out.println(l);
        ArrayList newl = removeRepeted(l);
        System.out.println(newl);
    }

    public static ArrayList removeRepeted(ArrayList l) {
        ArrayList newL = new ArrayList();

        for (int i = 0; i < l.size(); i++) {
            Student s = (Student) (l.get(i));
            // 必须重写equals方法！！！！
            if (!newL.contains(s)) {
                newL.add(s);
            }
        }

        return newL;
    }
}
