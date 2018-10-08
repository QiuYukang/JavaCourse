package day17_Collection_Set.c04_TreeSet2;
/* ----比较器排序----带参构造
 * 去除重复元素
 * 按照姓名长度排序
 */

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new MyComparator());

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

        for (Student s : ts) {
            System.out.println(s);
        }
    }
}
