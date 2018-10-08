package day18_Map.c03_LinkedHashMap;
/*
 * LinkedHashMap: 可预知的迭代顺序(添加顺序和输出顺序一致)，可LinkedHashSet类似
 *      是Map接口的哈希表和链表实现
 */

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Student> hm = new LinkedHashMap<>();

        Student s1 = new Student("Bob", 21);
        Student s2 = new Student("John", 21);
        Student s3 = new Student("Jerry", 23);
        Student s4 = new Student("Henry", 21);

        hm.put("001", s1);
        hm.put("002", s2);
        hm.put("003", s2);
        hm.put("003", s3);
        hm.put("004", s4);

        // 遍历方式1
        Set<String> keySet = hm.keySet();
        for(String key: keySet){
            System.out.println("ID:"+key+"   "+hm.get(key));
        }

        System.out.println();

        // 遍历方式2
//        Set<LinkedHashMap.Entry<String, Student>> KVSet = hm.entrySet();
//        for(LinkedHashMap.Entry<String, Student> kv: KVSet){
//            System.out.println("ID:"+kv.getKey()+"  "+kv.getValue());
//        }
    }
}
