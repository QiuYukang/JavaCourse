package day06;

//只能有一个public class
public class Student {
    String name;
    int age;
    String address;

    public void eat(String food){
        System.out.println(name + " like eating "+food);
    }

    public void sleep(){
        System.out.println("sleep in "+address);
    }
}