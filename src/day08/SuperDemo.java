package day08;

/**
 * super关键字
 * 功能：可以调用父类的成员变量、构造方法、成员方法
 * this代表本类对应的引用
 * super代表父类存储空间的标识（可以理解为父类引用）
 *
 * 继承中的构造方法的关系
 *     A:子类中的所有构造方法都会默认访问父类的无参构造方法
 *     B:子类每一个构造方法的第一条语句默认执行super()即父类的空参构造
 */

public class SuperDemo {
    public static void main(String[] args){
        Son s = new Son();
        s.showAge();

        System.out.println("---------------");
        Son s1 = new Son();
        Son s2 = new Son("Bob");


    }

}

class Father{
    public int age = 30;

    Father(){
        System.out.println("Father class's nonparametric construction method");
    }

    Father(String name){
        System.out.println("Father class's parametric construction method");
    }
}

class Son extends Father{
    public int age = 10;

    Son(){
        //super();  //系统默认执行父类无参构造
        System.out.println("Son class's nonparametric construction method");
    }

    Son(String name){
        //super();  //系统默认执行父类无参构造
        //super("ssss");  //如果父类没有无参构造，则手动使用super()访问父类带参构造，否则报错！
        System.out.println("Son class's parametric construction method");
    }

    public void showAge(){
        int age = 5;
        System.out.println("age: "+age);
        System.out.println("this age(Son.age):"+this.age);
        System.out.println("super age(Father.age): "+super.age);
    }

}