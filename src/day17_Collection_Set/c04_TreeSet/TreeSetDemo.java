package day17_Collection_Set.c04_TreeSet;
/*
 * TreeSet特点：能够按照某种规则进行排序
 * (依赖于元素的compareTo())
 *  A：自然排序（无参构造）
 *  B：比较器排序（继承Comparable接口，重写compareTo()方法）
 */

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // 无参构造使用自然排序
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(12);
        ts.add(8);
        ts.add(13);
        ts.add(1);
        ts.add(24);
        ts.add(4);
        ts.add(8);

        for(Integer t: ts){
            System.out.println(t);
        }
    }
}
