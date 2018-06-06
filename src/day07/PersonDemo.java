package day07;

/**
 * static关键字
 * 修饰的成员变量被所有类的对象所共享，也可以修饰成员方法。
 * 随着类的加载而加载，main()类似，优先于对象的存在。
 * 静态变量（方法）可以对象名调用，也可以直接用类名调用，
 * 推荐使用类名调用，
 * main()方法被虚拟机用类名调用。
 *
 * static注意事项：
 *      A：静态方法中是没有this关键字，因为this是随着对象的创建而存在，静态是随着类的加载而先加载的。
 *      B：静态方法中只能访问静态变量和静态方法。
 *      C：非静态方法可以访问静态和非静态的成员变量
 *
 * 工具类常常使用static方法，构造方法采用private关键字
 * 则只能通过类名调用方法，无需创建对象再使用！方便！
 */

public class PersonDemo {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person("Bob", 31);

        System.out.println(Person.country);
        System.out.println(p1.name+":"+p1.age+","+p1.country);
        System.out.println(p2.name+":"+p2.age+","+p2.country);

        Person p3 = new Person("Mitchell", 27, "U.S.A");
        System.out.println(p3.name+":"+p3.age+","+p3.country);

        System.out.println("\nchange......\n");
        System.out.println(Person.country);
        System.out.println(p1.name+":"+p1.age+","+p1.country);
        System.out.println(p2.name+":"+p2.age+","+p2.country);

        Person.show();
    }
}

class Person{
    String name;
    int age;
    //静态成员变量，被所有对象共享
    static String country = "China";

    public Person(){}

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public static void show(){
        //Error:(55, 28) java: 无法从静态上下文中引用非静态 变量 this
        //System.out.println(this.name);
        //Error:(58, 28) java: 无法从静态上下文中引用非静态 变量 name
        //System.out.println(name);
        System.out.println("\n"+country);
    }
}