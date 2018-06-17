package day09;

/*
final关键字：
    修饰类 使类无法被继承
    修饰方法 使方法无法被重写
    修饰变量 使变量不能被重新赋值（使变量变成常量,只能赋值一次）
            修饰引用类型时，引用类型的地址值不能变

 */

public class FinalDemo {
    public static void main(String[] args){
        final Zi z = new Zi();
        z.show();

        //成员变量可以变
        z.num = 10;

        //地址值不能变
        //Error:(21, 9) java: 无法为最终变量z分配值
        //z = new Zi();

    }
}

class Fu{

    public int num = 10;
    public final int num2 = 20;

}

class Zi extends Fu{
    //Error:(27, 17) java: Zi中的show()无法覆盖Fu中的show() 被覆盖的方法为final
    /*
    public void show(){
        num = 11;
        System.out.println("final show!");
    }
    */

    public void show(){
        num = 11;
        System.out.println(num);

        //Error:(38, 9) java: 无法为最终变量num2分配值
        //num2 = 21;

        System.out.println(num2);
    }
}

//final修饰类
//Error:(21, 18) java: 无法从最终Fu进行继承
/*
final class Fu{

}

class Zi extends Fu{

}
*/

