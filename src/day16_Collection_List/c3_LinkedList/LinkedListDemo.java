package day16_Collection_List.c3_LinkedList;

/*
        Collection子接口：List
        实现类：ArrayList Vector LinkedList
            ArrayList:底层数据结构是数组，查询快，增删慢
                      线程不安全，效率高
            Vector:底层数据结构是数组，查询快，增删慢
                   线程安全，效率高
                   （一般不用）
            LinkedList:底层数据结构是链表实现（双重链表），查询慢，增删快
                       线程不安全
                       特有方法：addFirst addLast getFirst getLast removeFirst removeLast

            -----可以当成队列来使用！！！非常灵活的增删修改替换！！！---

            总结：看需求使用，要安全也不用Vector(唯一一个线程安全的)
                  查询多用ArrayList   增删多用LinkedList
                  一般ArrayList比较多
 */

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        Student s1 = new Student("Bob", 21);
        Student s2 = new Student("Jerry", 29);
        Student s3 = new Student("Henry", 31);
        Student s4 = new Student("Jackson", 31);

        ll.add(s1);
        ll.add(s2);
        ll.addLast(s3);

        System.out.println("ll:" + ll);

        System.out.println();
        System.out.println(ll.getLast());

        ll.addFirst(s4);
        System.out.println("ll:" + ll);

        System.out.println();
        ll.removeFirst();
        System.out.println("ll:"+ll);
    }
}
