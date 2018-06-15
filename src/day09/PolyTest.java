package day09;

/*
多态测试
 */

public class PolyTest {
    public static void main(String[] args){
        A a = new B();
        a.show();    //成员方法编译看左边，运行看右边

        B b = new C();
        b.show();
    }
}

class A{
    public void show(){
        show2();
    }

    public void show2(){
        System.out.println("我");
    }
}

class B extends A{

    //直接继承父类A的show()方法
    //public void show(){
    //    show2();     //使用自己的show2()
    //}

    //把父类A的show2()重写了
    public void show2(){
        System.out.println("爱");
    }
}

class C extends B{
    public void show(){
        //访问父类B的show()方法
        super.show();
    }

    //父类show2()被重写
    public void show2(){
        System.out.println("你");
    }
}
