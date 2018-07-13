/*
    getClass返回类的对象
    getName返回对象对应的类的全路径
 */

package day11;

import day11.hashCodeDemo.Student;

public class getClassDemo {
    public static void main(String[] args){
        Student s = new Student();
        System.out.println(s.getClass());
        System.out.println(s.getClass().getName());
    }
}
