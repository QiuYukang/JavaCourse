/*
    toString返回该对象的字符串表示
    子类要重写toString方法
    直接输出对象就是相当于调用对象的toString方法
 */

package day11.toStringDemo;

import day11.equalsDemo.Student;

public class toStringDemo {
    public static void main(String[] args) {
        Student s = new Student("Bob", 21);
        System.out.println(s.toString());
        //相当于调用toString方法
        System.out.println(s);
    }
}
