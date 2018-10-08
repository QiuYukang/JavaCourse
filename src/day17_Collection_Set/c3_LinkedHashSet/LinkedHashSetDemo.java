package day17_Collection_Set.c3_LinkedHashSet;
/*
 * 具有可预知迭代顺序的 Set 接口的哈希表和链接列表实现。
 * 底层数据由哈希表和链表构成
 */

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<>();

        hs.add("Hello");
        hs.add("Hello");
        hs.add("Hello2");
        hs.add("Java");
        hs.add("Hello3");
        hs.add("Hello4");
        hs.add("World");

        // 有序 不可重复
        for (String s : hs) {
            System.out.println(s);
        }
    }
}
