package day16_Collection_List.c6_NewFeature;

/*
    三种遍历方式遍历集合
    普通for
    迭代器
    增强for
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ForAdvanced2 {
    public static void main(String[] args) {
        // 使用泛型声明
        ArrayList<Student> stu = new ArrayList<>();

        Student s1 = new Student("Bob", 21);
        Student s2 = new Student("Jerry", 29);
        Student s3 = new Student("Henry", 31);
        Student s4 = new Student("Jackson", 31);

        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);

        // 迭代器遍历
        System.out.println("迭代器遍历");
        Iterator<Student> it = stu.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();

        // 普通for遍历
        System.out.println("普通for遍历");
        for (int i = 0; i < stu.size(); i++) {
            System.out.println(stu.get(i));
        }

        System.out.println();

        // 增强for遍历
        System.out.println("增强for遍历");
        for (Student s : stu) {
            System.out.println(s);
        }
    }
}
