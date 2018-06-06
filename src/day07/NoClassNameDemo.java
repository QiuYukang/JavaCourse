package day07;

import day06.Student;

/**
 * 匿名对象
 * A.调用方法，只调用一次时，调用完毕即被回收，提供内存使用效率。
 * B.匿名对象可以作为参数传递
 */

public class NoClassNameDemo {
    public static void main(String[] args){
        //A场景
        new Student().eat("cakes");
        //B场景
        new StudentTest().test(new Student());
    }
}

//方法的传输参数是类
class StudentTest{
    public void test(Student s){
        s.sleep();
    }
}
