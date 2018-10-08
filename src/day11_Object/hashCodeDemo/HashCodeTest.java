package day11_Object.hashCodeDemo;

public class HashCodeTest {
    public static void main(String[] args){
        Student s1 = new Student("Bob", 23);
        System.out.println(s1.hashCode());

        Student s2 = new Student("John", 31);
        System.out.println(s2.hashCode());
    }
}