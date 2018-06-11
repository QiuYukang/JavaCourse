package day08;

/*
    继承部分---测试题2
    A：一个雷的初始化过程
        成员变量的初始化
            默认初始化
            显示初始化
            构造方法初始化
    B：子父类的初始化（分层初始化）
        先进行父类初始化，再进行子类初始化
 */

public class Z extends X{
    Y y = new Y();    //成员变量-引用类型
    Z(){
        System.out.println("Z");
    }
    //先走main方法
    public static void main(String[] args){
        new Z();
    }
}

class X{
    Y b = new Y();
    X(){
        System.out.println("X");
    }
}

class Y{
    Y(){
        System.out.println("Y");
    }
}
