package day06;

public class StudentDemo {
    public static void main(String[] args){
        Student s = new Student();
        System.out.println("name:"+s.name);
        System.out.println("age:"+s.age);
        System.out.println("address:"+s.address);

        System.out.println("-------赋值后--------");

        s.name = "QiuYuKang";
        s.age = 23;
        s.address = "SiChuan-Chengdu";

        System.out.println("name:"+s.name);
        System.out.println("age:"+s.age);
        System.out.println("address:"+s.address);

        s.eat("cakes");
        s.sleep();
    }
}
