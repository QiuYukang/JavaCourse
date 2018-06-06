package day0; /**
 * 这是一个简单的Hello World程序
 * 这行注释可以自动生成文档
 */

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        //-----逻辑运算符测试
        //int x = 3;
        //int y = 4;

        //System.out.println((x++ == 4)&&(y++ == 4));
        //System.out.println((x++ == 4)&(y++ == 4));
        //System.out.println(x);
        //System.out.println(y);

        //-----键盘输入测试，选出最大值
        /*
        int x, y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a num:");
        x = sc.nextInt();
        System.out.println("Please input another num:");
        y = sc.nextInt();

        //方法1
        //System.out.println("the bigger num is:" + ((x > y)?x:y));

        //方法2
        if(x > y){
            System.out.println("the bigger num is:"+x);
        }else{
            System.out.println("the bigger num is:"+y);
        }
        */

        //-----键盘输入测试

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input a string:");
        String s = sc.nextLine();
        System.out.println("input is:"+s);


        //-----
    }
}
