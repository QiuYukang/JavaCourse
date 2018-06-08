package day08;

/*
加载子类前会先加载父类

整体执行顺序：父类->子类；静态代码块->构造代码块->构造方法（调用构造时才执行构造代码块和构造方法）；父类构造方法->子类构造方法

所以执行顺序为：父类静态代码块，子类静态代码块
               父类构造代码块，父类构造方法
               子类构造代码块，子类构造代码块
 */

public class InheritTest1 {
    public static void main(String[] args){
         Zi z = new Zi();
    }
}

class Fu{
    static{
        System.out.println("Fu's static code block");
    }

    {
        System.out.println("Fu's construction code block");
    }

    public Fu(){
        System.out.println("Fu's construction method");
    }
}

class Zi extends Fu{
    static{
        System.out.println("Zi's static code block");
    }

    {
        System.out.println("Zi's construction code block");
    }

    public Zi(){
        System.out.println("Zi's construction method");
    }
}