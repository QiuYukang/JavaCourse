package day15_Collection.c02_Collection;

/*
    测试：
          addALl():一个集合上加了一个集合（不是求并集，元素可以重复）
          removeAll：一个集合上删除另一个集合上含有的元素
          containsAll：一个集合是否包含了一个集合中全部元素
          retainALl：一个集合和了一个集合求交集（返回值表示，调用该方法的集合是否发生变化）
 */

import java.util.ArrayList;

public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        ArrayList a2 = new ArrayList();

//        a1.add("test1");
//        a1.add("test2");
//        a1.add("test3");
        a1.add("test4");

        a2.add("test4");
        a2.add("test5");
        a2.add("test6");

        System.out.println("a1:" + a1);
        System.out.println("a2:" + a2);
        System.out.println();

//        System.out.println("a1.addALl(a2):"+a1.addAll(a2));
//        System.out.println("a1:" + a1);
//        System.out.println("a2:" + a2);
//
//        System.out.println();
//        System.out.println("a1.removeAll(a2):" + a1.removeAll(a2));
//        System.out.println("a1:" + a1);
//        System.out.println("a2:" + a2);

        System.out.println();
        System.out.println("a1.containsALl(a2):" + a1.containsAll(a2));
        System.out.println("a1:" + a1);
        System.out.println("a2:" + a2);

        System.out.println();
        System.out.println("a1.retainAll(a2)" + a1.retainAll(a2));
        System.out.println("a1:" + a1);
        System.out.println("a2:" + a2);
    }
}
