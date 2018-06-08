package day08;

/**
 * --继承--
 * 好处：复用性；可维护性；类与类产生关系，多态的前提，但是提高了耦合性......
 * 特点：Java只支持单继承，不支持多继承；可以多重继承
 * 注意事项：
 *     A：子类只能继承父类所有非私有成员（变量 or 方法），但是可以通过父类的公共方法来获取私有变量
 *     B：自类不能继承父类的构造方法，但是可以通过super关键字去访问父类构造方法
 *     C：不要以为部分功能而使用继承
 */

public class InheritDemo {
    public static void main(String[] args){
        //error!构造方法不可继承
        //Teacher t = new Teacher("John", 40);
        Teacher t = new Teacher();
        t.setName("Teacher");

        //多重继承
        RobotTeacher rb = new RobotTeacher();
        rb.setName("Robot teacher");
        rb.tShow();
        //公共变量可以继承--同名变量采用就近原则
        System.out.println("rb.age: "+rb.age);
    }
}

class Person{
    private String name;
    int age = 10;

    Person(){}

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
        System.out.println("set name: "+this.name);
    }

}

class Teacher extends Person{
    int age = 20;

    public void tShow(){
        System.out.println("I can teacher pupils!");
    }

    //自类不能继承父类私有成员变量
    //Error java: name 在 day08.Person 中是 private 访问控制
    /*
    public void showName(){
        System.out.println("name: "+name);
    }
    */

}

class RobotTeacher extends Teacher{

}