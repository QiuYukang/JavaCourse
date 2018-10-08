package day18_Map.c07_Collections;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "name:" + name +
                "   age=" + age;
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

    @Override
    // 返回0表示相等，负数表示小于，正数表示大于
    public int compareTo(Student s) {
        int num = this.age - s.age;
        return num == 0 ? this.name.compareTo(s.name) : num;
    }

    public void show() {
        System.out.println("show()...");
    }
}
