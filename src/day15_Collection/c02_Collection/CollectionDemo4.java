package day15_Collection.c02_Collection;

/*
    集合迭代器 Iterator接口:集合的专用遍历方式。
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("Hello");
        c.add("World");

        Iterator i = c.iterator();

        while(i.hasNext()){
            // System.out.println(i.next());
            String s = (String)(i.next());
            System.out.println(s+"---"+s.length());
        }
    }
}
