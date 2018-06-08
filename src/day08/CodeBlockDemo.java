package day08;

import day06.Student;

/**
 * 代码块
 *
 * 局部代码块：局部位置，用于限定变量的生命周期
 * 构造代码块：提取构造方法中共同的部分，每次调用构造方法前都会运行构造该代码块，用于初始化对象。
 * 静态代码块：在类成员位置，用{}包裹，用static修饰。随着类的加载而加载，一般用来对类进行初始化，只执行一次。
 *
 * 执行顺序：静态代码块-->构造代码块->构造方法
 */

class Code{
    static int num;

    //静态代码块1
    static{
        System.out.println("static code block1 is running......");
    }

    //构造代码块
    {
        System.out.println("construction code block is running "+num);
    }

    public Code(){
        System.out.println("construction function Code() is running......");
    }

    public Code(int num){
        System.out.println("construction function Code(int num) is running......");
        this.num = num;
    }

    //静态代码块2
    static{
        System.out.println("static code block2 is running......");
    }
}

public class CodeBlockDemo {
    static{
        System.out.println("------static code block in main()------");
    }

    public  static void main(String[] args){

        System.out.println("------local code block------");

        //局部代码块
        {
            int x = 1000;
            System.out.println(x);
        }
        //报错，x变量已经随着代码块的结束而结束
        //System.out.println(x);

        int y = 200;
        System.out.println(y);
        //局部代码块
        {
            y = 2000;
            System.out.println(y);
        }
        System.out.println(y);

        System.out.println("-------construction code block-------");
        Code c1 = new Code();
        Code c2 = new Code(33);

    }
}
