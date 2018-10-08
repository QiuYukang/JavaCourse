package day17_Collection_Set.c04_TreeSet2;

import java.util.Comparator;

/*
 * Comparator比较器接口的实现类
 */
public class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // 姓名长度差
        int num1 = s1.getName().length() - s2.getName().length();
        // 比较姓名内容
        int num2 = num1 == 0 ? s1.getName().compareTo(s2.getName()) : num1;
        // 比较年龄
        int num3 = num2 == 0 ? s1.getAge() - s2.getAge() : num2;

        return num3;
    }
}
