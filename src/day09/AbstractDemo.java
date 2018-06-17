package day09;

/*
    抽象类
    A：抽象类不可以被实例化，只能继承它的非抽象子类进行实例化，或者利用多态：Animal A = Dog()
    B：抽象类的抽象方法没有大括号；如果子类不是抽象类，必须重写所有抽象方法。
    C：抽象类的成员特点
        成员变量：既可以是变量，也可是常量（final关键字）
        构造方法：有，用于子类访问父类数据的初始化；
        成员方法：既可以是抽象方法（必须要在子类中重写），也可是非抽象方法。

 */

public class AbstractDemo {
    public static void main(String[] args){
        Animal a = new Dog();
        //a.num = 4;
        System.out.println("a.age:"+a.age);
        a.age = 5;
        System.out.println("a.age:"+a.age);
        a.show();
        a.method();
    }
}

abstract class Animal{
    //---成员变量---
    //变量
    public int age = 10;
    //常量
    public final int num = 20;

    //---构造方法---
    //无参构造
    public Animal(){}
    //带参构造
    public Animal(int age){
        this.age = age;
    }

    //---成员方法---
    //抽象方法
    public abstract void show();
    //非抽象方法
    public void method(){
        System.out.println("Animal.method()");
    }
}

class Dog extends Animal{

    //必须被重写的抽象方法
    public void show(){
        System.out.println("Dog.show()");
    }
}
