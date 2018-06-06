package day07;
import java.util.Scanner;

/**
 * this关键字
 * 代表当前类的一个对象，
 * 谁调用这个方法，这个方法内的this就代表谁。
 * 解决局部变量隐藏成员变量的问题。
 */

class ThisDemo {
    public static void main(String[] args){
        Student s = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input the name you want to set:");
        int age = sc.nextInt();
        s.setAge(age);
        System.out.println(s.getAge());
    }
}
