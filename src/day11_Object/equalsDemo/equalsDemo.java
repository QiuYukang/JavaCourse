/*
    直接用运算符作比较：
        基本类型：比较值是否相同
        引用类型：比较地址值是否相同

    equals方法：
        不能比较基本类型，只能比较引用类型
        默认比较是否是同一个对象（还是地址值）
        需要重写该方法（一般用来比较成员对象的值是否相同）
 */

package day11_Object.equalsDemo;

public class equalsDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Bob",31);
        Student s2 = new Student("Bob",31);
        Student s3 = new Student("Helen",18);
        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.getClass() == s2.getClass());

        //未进行异常处理，将报错
        Demo d = new Demo();
        System.out.println(s1.equals(d));
    }
}

class Demo{

}