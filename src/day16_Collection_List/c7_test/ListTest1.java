package day16_Collection_List.c7_test;

/*
    集合的嵌套遍历

    eg:
        多个班级，每个班级多个学生，集合嵌套集合
 */

import java.util.ArrayList;

public class ListTest1 {
    public static void main(String[] args) {
        // 创建班级集合
        // ArrayList<ArrayList> classList = new ArrayList<>();
        ArrayList<ArrayList<Student>> classList = new ArrayList<>();

        // 创建学生集合
        ArrayList<Student> stuClass1 = new ArrayList<>();
        ArrayList<Student> stuClass2 = new ArrayList<>();

        // 创建学生对象
        Student s1 = new Student("Bob", 21);
        Student s2 = new Student("Jerry", 29);
        Student s3 = new Student("Henry", 31);
        Student s4 = new Student("Jackson", 31);
        Student s5 = new Student("Jack", 32);

        // 将学生添加到对应的班级
        stuClass1.add(s1);
        stuClass1.add(s2);

        stuClass2.add(s3);
        stuClass2.add(s4);
        stuClass2.add(s5);

        // 将班级添加到班级集合
        classList.add(stuClass1);
        classList.add(stuClass2);

        // 嵌套遍历
        for(ArrayList<Student> l: classList){
            for(Student s:l){
                System.out.println(s);
            }
            System.out.println();
        }
    }
}
