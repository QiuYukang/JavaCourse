package day07;

/**
 * 构造方法
 */

public class ConstructDemo {
    public static void main(String[] args){
        Student stu1 = new Student();
        stu1.eat("cakes");

        Student stu2 = new Student("John", 21);
        System.out.println(stu2.getAge());
        stu2.eat("eggs");
    }
}
