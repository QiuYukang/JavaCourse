package day18_Map.c01_Map;
/*
 * Map集合的遍历
 * 方式1：遍历key值，同时利用get(Object key)获取key对应的value
 * 方式2：利用Set<Map.Entry<K, V>> entry()获取所有键值对对象集合，遍历键值对对象的键和值
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("1", "A");
        m.put("22", "F");
        m.put("14", "C");
        m.put("12", "B");

        // 遍历方式1
        Set<String> set = m.keySet();
        for (String s : set) {
            System.out.println("key:" + s + "  value:" + m.get(s));
        }

        System.out.println();

        // 遍历方式2
        Set<Map.Entry<String, String>> set2 = m.entrySet();
        for(Map.Entry<String, String> me:set2){
            System.out.println("key:"+me.getKey()+"  value:"+me.getValue());
        }
    }
}
