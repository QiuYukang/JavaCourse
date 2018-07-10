package day10;
/*
返回值类型：基本类型+引用类型
    引用类型：
    类；返回该类的对象
    抽象类：真正需要返回该抽象类的实现类
    接口：真正需要的是该接口的实现类

    链式编程-----
        每次方法调用完毕后返回一个对象，对象又有方法，方法又返回对象...
 */

public class ReturnTest {
    public static void main(String args[]){
        System.out.println("链式编程");

        //测试一个链式编程
        StudentTool ST = new StudentTool();
        ST.getStudent().show();
    }
}

class Student{
    public void show(){
        System.out.println("Student show...");
    }
}

class StudentTool{
    public Student getStudent(){
        //只是用一次 可以直接使用匿名类
        return new Student();
    }
}