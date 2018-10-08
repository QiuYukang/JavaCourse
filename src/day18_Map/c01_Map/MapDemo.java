package day18_Map.c01_Map;
/*
 * 接口 Map<K,V>   （类似于python中的字典）
 * 类型参数：
 * K - 此映射所维护的键的类型
 * V - 映射值的类型
 * 成对出现！！！  键唯一，值可重复
 *
 * 具体实现类：HashMap TreeMap
 * 方法：
 *      1.添加
 *           V put(K key, V value)    添加元素
 *           V putAll(K key, V value)    添加元素
 *      2.删除
 *          void clear()
 *          V remove(Object key)    删除键值对并返回值
 *      3.判断
 *          boolean containsKey(Object key)
 *          boolean containsValue(Object value)
 *          boolean isEmpty()
 *      4.获取
 *          Set<Map.Entry<K,V>> entrySet()
 *          V get(Object key)    根据键获取值
 *          Set<K> keySet()    获取所有键
            Collection<V> values()    获取所有值
 *      5.长度
 *          int size()
 *
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        // put()返回值表示之前该键对应的值（之前不存在则返回null）
        System.out.println(m.put("2015010911028", "Bob"));
        System.out.println(m.put("2015010911018", "John"));
        System.out.println(m.put("2015010911018", "Jerry"));
        System.out.println(m.put("2015010911007", "Helen"));

        // 已经重写toString()
        // key为set 不可重复无序的
        System.out.println(m);

        System.out.println(m.remove("2015010911028"));
        System.out.println(m);

        // 获取功能
        System.out.println(m.get("2015010911007"));

        Set<String> set = m.keySet();
        System.out.println(set);

        Collection<String> values = m.values();
        System.out.println(values);
    }
}
