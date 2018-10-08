package day15_Collection.c02_Collection;

/*
    集合中可以存储不同类型的元素
    只存储引用类型
    可添加元素限制、排序等

    Collection(接口)具有的方法：
        add(Object obj)
        addAll(Collection c)
        clear()
        contains(Object o)
        containsAll(Collection c)
        ...

        子接口：List
        实现类：ArrayList Vector LinkedList

            ArrayList:底层数据结构是数组，查询快，增删慢
                      线程不安全，效率高

            Vector:底层数据结构是数组，查询快，增删慢
                   线程安全，效率高
                   （一般不用，已经out）

            LinkedList:底层数据结构是链表实现（双重链表），查询慢，增删快
                       线程不安全

            总结：看需求使用，要安全也不用Vector(唯一一个线程安全的)
                  查询多用ArrayList   增删多用LinkedList
                  一般ArrayList比较多
        子接口：Set
        实现类：HashSet TreeSet
 */

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        // ArrayList--无参构造，初始容量为10
        ArrayList aL = new ArrayList();
        aL.add("qiu");
        aL.add(1,'K');
        aL.add(1);
        System.out.println(aL);

        // why??---防止混淆index和object可以使用强制类型转换加以区分
        // aL.remove((Character)'K');
        // System.out.println(aL);

        // System.out.println(aL.contains('K'));

        // aL.remove("qiu");
        // System.out.println(aL);

        // aL.clear();
        // System.out.println(aL);

        System.out.println(aL.size());
        System.out.println(aL.isEmpty());
    }
}
