package day08;

public class InheritTest2 {
    public static void main(String[] args){
        //方式1
        Teacher2 t = new Teacher2();
        t.setAge(27);
        t.setName("郑东奇");
        System.out.println("Teacher2's name:"+t.getName()+"  age:"+t.getAge());
        t.teach("邱玉康");

        System.out.println("-------------------------------------");

        //方式2
        Student2 s = new Student2("邱玉康", 20);
        System.out.println("Student2's name:"+s.getName()+"  age:"+s.getAge());
        s.learn("Java");
    }
}

class Person2 {
    //成员变量
    private String name;
    private int age;

    //无参构造
    Person2(){ }

    //带参构造
    Person2(String name, int age){
        this.name = name;
        this.age = age;
    }

    //成员方法
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}

class Teacher2 extends Person2 {
    public Teacher2(){}

    public Teacher2(String name, int age){
        super(name, age);
    }

    //特有方法
    public void teach(String stuName){
        System.out.println(this.getName()+" is teaching "+stuName);
    }
}

class Student2 extends Person2 {
    public Student2(){}

    public Student2(String name, int age){
        //使用父类的空间来间接访问私有变量
        super(name, age);
        //错误使用--Error:(58, 13) java: name 在 Person2 中是 private 访问控制
        //this.name = name;
        //this.age = age;
    }

    //特有方法
    public void learn(String subject){
        System.out.println(getName()+" is learning "+subject);
    }
}
