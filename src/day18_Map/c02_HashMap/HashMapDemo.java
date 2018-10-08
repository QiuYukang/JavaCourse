package day18_Map.c02_HashMap;
/*
 * HashMap:基于哈希表的Map接口实现
 * 哈希表用来保证key的唯一性
 * 不可预知的迭代顺序
 */

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        // 不可以是基本类型，需要时引用类型
        HashMap<Integer, String> m = new HashMap<>();

        m.put(1, "A");
        m.put(22, "F");
        m.put(14, "C");
        m.put(12, "B");

        // 遍历方式1
        Set<Integer> set = m.keySet();
        for (Integer s : set) {
            System.out.println("key:" + s + "  value:" + m.get(s));
        }

        System.out.println();

        // 遍历方式2
        Set<HashMap.Entry<Integer, String>> set2 = m.entrySet();
        for(HashMap.Entry<Integer, String> me:set2){
            System.out.println("key:"+me.getKey()+"  value:"+me.getValue());
        }
    }
}
