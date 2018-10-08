package day17_Collection_Set.c05_test;
/*
 * 键盘输入5个学生信息（姓名、语文成绩、数学成绩、英语成绩），按照总分从高到低输出到控制台。
 */

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Student> hs = new TreeSet<>();

        Student s1 = new Student("Bob", 10, 20, 20);
        Student s2 = new Student("John", 40, 50, 20);
        Student s3 = new Student("John", 40, 50, 20);
        Student s4 = new Student("John", 70, 50, 20);

        hs.add(s1);
        hs.add(s2);

        for (Student stu : hs) {
            System.out.println(stu);
        }
    }
}
