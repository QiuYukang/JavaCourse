package day18_Map.c02_HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<>();

        Student s1 = new Student("Bob", 21);
        Student s2 = new Student("John", 21);
        Student s3 = new Student("Jerry", 23);
        Student s4 = new Student("Henry", 21);

        hm.put("001", s1);
        hm.put("002", s2);
        hm.put("003", s3);
        hm.put("004", s4);

        // 遍历方式1
        Set<String> keySet = hm.keySet();
        for(String key: keySet){
            System.out.println("ID:"+key+"   "+hm.get(key));
        }

        System.out.println();

        // 遍历方式2
        Set<HashMap.Entry<String, Student>> KVSet = hm.entrySet();
        for(HashMap.Entry<String, Student> kv: KVSet){
            System.out.println("ID:"+kv.getKey()+"  "+kv.getValue());
        }
    }
}
