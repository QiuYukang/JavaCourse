package day09;

/*
多态-----
A：成员变量——编译看左边，运行看左边
B：构造方法——创建子类对象时，先访问父类构造方法，完成父类数据的初始化
C: 成员方法——编译看左边，运行看右边
D：静态方法——编译看左边，运行看左边。静态只能被静态重写，但是静态方法不算重写，因为静态和类相关。
 */

public class PolyDemo {
    public static void main(String[] args){
        Father f = new Son();

        //成员变量编译看左边的类型声明，运行同样是按照左边的类型运行。
        System.out.println("f.age:"+f.age);

        //java: 找不到符号
        //f.play();

        //Error:(14, 29) java: 找不到符号
        //System.out.println(f.name);

        //成员方法编译看左边的类型声明，运行看右边的实际类型，方法会被重写
        f.say();
        //静态方法不会别重写，和外壳一样的
        f.eat();

        System.out.println("--------After (Son)f----------");

        //既然可以把子类对象赋值给父亲，那么也可以把父的引用赋值给子的引用！
        // 使用强制类型转换，使得父类可以使用子类特有功能(向下转型)
        //能转，因为f的本质是Son()
        System.out.println("((Son)f).age:"+((Son) f).age);
        ((Son)f).eat();

        //儿子套着父亲的外壳，只能做父亲做的事情；脱下外壳后，就可以有儿子自己的特有动作了
        ((Son) f).paly();
    }
}

class Father{
    public int age = 40;

    public void say(){
        System.out.println("Father's age is:"+this.age);
    }

    public static void eat(){
        System.out.println("Father eat more");
    }
}

class Son extends Father{
    //成员变量不会被重写
    public int age = 20;
    //父类不可访问
    public String name = "Bob";

    //父类成员方法被重写
    public void say(){
        System.out.println("Son's age is:"+this.age);
    }

    public void paly(){
        System.out.println("Son is playing game!");
    }

    public static void eat(){
        System.out.println("Son eat little");
    }
}