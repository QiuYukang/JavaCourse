package day15_Collection.c02_Collection;

/*
    List 有序（和插入顺序符合），可重复，可精确插入
    ListIterator 列表迭代器，特有方法 previous()
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List l = new ArrayList();

        Student s1 = new Student("Bob", 21);
        Student s2 = new Student("Jerry", 29);
        Student s3 = new Student("Henry", 31);

        l.add(s1);
        l.add(s2);
        l.add(s3);

        ListIterator lI = l.listIterator();

        while(lI.hasNext()){
            System.out.println(lI.next());
        }

        // List迭代器--> 特有方法
        while (lI.hasPrevious()){
            System.out.println(lI.previous());
        }
    }
}
