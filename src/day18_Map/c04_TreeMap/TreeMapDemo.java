package day18_Map.c04_TreeMap;
/*
 * TreeMap：基于红黑树的Map接口的实现，红黑树保证顺序（真正的排序）和唯一
 *
 * 要求：
 *      按照
 */

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // 无参构造：自然排序，必须实现Comparable接口中的compareTo()方法
        // 带参构造：比较器排序，必须实现Comparator接口
        // TreeMap<Student, String> tm = new TreeMap<>();

        // 使用匿名内部类 + 比较器
        TreeMap<Student, String> tm = new TreeMap<>(
                new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        int num = s1.getAge() - s2.getAge();
                        int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                        return num2;
                    }
                }
        );

        Student s1 = new Student("John", 21);
        Student s2 = new Student("Bob", 28);
        Student s3 = new Student("Jerry", 23);
        Student s4 = new Student("Henry", 20);
        // 键相同，值覆盖
        Student s5 = new Student("Henry", 20);

        tm.put(s1, "001");
        tm.put(s2, "002");
        tm.put(s3, "003");
        tm.put(s4, "004");
        tm.put(s5, "005");

        Set<Student> stuSet = tm.keySet();
        for(Student stu:stuSet){
            System.out.println(stu+"   ID:"+tm.get(stu));
        }
    }
}
