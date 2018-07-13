package day11.equalsDemo;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student(){}

    public Student(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

/*    @Override
    public boolean equals(Object obj) {
        //提高程序健壮性（如果不是Student类，不能进行比较）
        if(this.getClass() != obj.getClass())
            return false;

        *//*
        if(!(obj instanceof Student))
            return false;
         *//*

        //自己和自己比，提高效率
        if(this == obj)
            return true;

        //需要向下转型
        return (this.age == ((Student)obj).age) && (this.name.equals(((Student)obj).name)) ;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}
