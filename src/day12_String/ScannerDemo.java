package day12_String;
/*
    Scanner类：hasNextXXX();

               nextXXX();
               需要判断输入是否匹配
 */
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input two numbers:");
        if(s.hasNextInt()){
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println("a+b:"+(a+b));
        }else{
            System.out.println("error input type!");
        }

        //会自动把回车赋值给s1
        System.out.println("Please input a String:");
        String s1 = s.nextLine();
        System.out.println(s1);

        //先获取int,在获取String，正确做法
        //方法1----使用不同的scanner对象
        System.out.println("Please input a number:");
        int c = s.nextInt();
        System.out.println("int:"+c);
        System.out.println("Please input a String:");
        Scanner sc2 = new Scanner(System.in);
        String str = sc2.nextLine();
        System.out.println("String:"+str);

        //方法2---全部先按照字符串读取---推荐！！！

    }
}
