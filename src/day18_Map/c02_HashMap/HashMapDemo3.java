package day18_Map.c02_HashMap;
/*
 * Student作为key
 * 自定义对象作为ke，需要重写equals()和hashCode()
 */

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo3 {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("Bob", 21);
        Student s2 = new Student("John", 21);
        Student s3 = new Student("Jerry", 23);
        Student s4 = new Student("Jerry", 23);
        Student s5 = new Student("Henry", 21);

        hm.put(s1, "001");
        hm.put(s2, "002");
        hm.put(s3, "003");
        hm.put(s4, "004");
        hm.put(s5, "004");

        // 方式1遍历
        Set<HashMap.Entry<Student, String>> KVSet = hm.entrySet();
        for(HashMap.Entry<Student, String> kv: KVSet){
            System.out.println(kv.getKey()+"   ID:"+kv.getValue());
        }

        System.out.println();

        // 方式2遍历
        Set<Student> stuSet = hm.keySet();
        for(Student stu: stuSet){
            System.out.println(stu+"   ID:"+hm.get(stu));
        }
    }
}
