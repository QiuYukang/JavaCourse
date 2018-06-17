package day09;

/*
    interface————接口
        类的功能扩展，但是这个功能并不是类共有的，是额外增加的功能，接口不可实例化，接口中的方法只能在具体的类中实现

        eg:马戏团的猫具有“跳高”功能，但是“跳高”并不是Animal类一开始就该有的功能，
        也不是Cat类一开始就该具有的功能（并不是所有的猫都具有跳高功能），所以写到接口中！最后在
       具体的类中实现该接口即可。

    接口成员特点：
        成员变量：默认public static final修饰，接口中的变量默认全是常量；建议自己加上对应的修饰。
        构造方法：接口没有构造方法！因为接口不能被实例化，接口是功能的扩展，真正具体的方法是在具体类中实现的。
        成员方法：默认public abstract static修饰，建议自己手动给出。

    接口VS类之间的各种关系：
        接口和接口之间是继承关系，可以多继承；
        类和类之间为继承关系，但是只能单继承；
        接口和类之间为实现关系，一个类可以implements多个接口。
 */

//猫狗案例，有的猫可以跳高！

public class InterfaceDemo {
    public static void main(String[] args){
        JumpCat2 jcat = new JumpCat2("哆啦A梦", 5);
        System.out.println("name:"+jcat.getName()+"  age:"+jcat.getAge());
        jcat.sleep();
        jcat.eat();
        jcat.jump();
    }
}

//跳高接口
interface Jump{
    //成员变量
    static final int height = 2;
    //抽象方法，具体在类中实现
    public abstract void jump();
}

//动物类(抽象类，同一文件夹防止重复，所以写Animal2)
abstract class Animal2{
    //名字
    private String name;
    //年龄
    private int age;

    //无参构造
    public Animal2(){}
    //带参构造
    public Animal2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //共有方法---睡觉
    public void sleep(){
        System.out.println("Animal sleep......");
    }

    //抽象方法---吃饭
    abstract public void eat();
}

class Cat2 extends Animal2{
    //构造方法
    public Cat2(){}

    public Cat2(String name, int age){
        super(name, age);
    }

    public void eat() {
        System.out.println("cat eat fish!");
    }
}

class Dog2 extends Animal2{
    //构造方法
    public Dog2(){}

    public Dog2(String name, int age){
        super(name, age);
    }

    public void eat() {
        System.out.println("dog eat shit!");
    }
}

//跳高猫
class JumpCat2 extends Cat2 implements Jump{
    public JumpCat2(){}

    public JumpCat2(String name, int age){
        super(name, age);
    }

    public void jump(){
        System.out.println("Cat can jump "+Jump.height+"dm");
    }
}