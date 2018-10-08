package day17_Collection_Set.c04_TreeSet;
/*
 * 如果一个对象要想实现自然排序，就必须实现自然排序结构
 * 即实现Comparable
 */

import java.util.Objects;

public class Student implements Comparable<Student> {
    // 成员变量
    private String name;
    private int age;

    //构造方法
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getXX setXX方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        // 返回值决定顺序，返回0表示相同，返回大于0表示更大，否则更小
//        if (!this.equals(s)) {
//            if (this.age >= s.age) {
//                return 1;
//            } else {
//                return -1;
//            }
//        } else {
//            return 0;
//        }

        // 实现方法2
        int num = this.age - s.age;
        int num2 = num == 0 ? this.name.compareTo(s.name) : num;

        return num2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getAge());
    }
}
