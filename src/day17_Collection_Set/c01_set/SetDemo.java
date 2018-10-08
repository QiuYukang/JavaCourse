package day17_Collection_Set.c01_set;
/*
 * 没有重复元素的集合，是一个接口
 * 无序！！！不保证该顺序永久不变！
 * 具体实现子类：HashSet TreeSet
 */

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Hello");
        set.add("Hello");
        set.add("Hello2");
        set.add("Java");
        set.add("Hello3");
        set.add("Hello4");
        set.add("World");

        // 无序 不可重复
        for (String s : set) {
            System.out.println(s);
        }
    }
}
