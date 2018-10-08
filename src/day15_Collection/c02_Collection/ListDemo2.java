package day15_Collection.c02_Collection;

/*
    集合的并发修改异常
 */

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List l = new ArrayList();

        Student s1 = new Student("Bob", 21);
        Student s2 = new Student("Jerry", 29);
        Student s3 = new Student("Henry", 31);
        Student s4 = new Student("Jackson", 31);

        l.add(s1);
        l.add(s2);
        l.add(s3);

        //ConcurrentModificationException---并发修改异常，在集合中添加元素，但是迭代器不知道有新元素添加
//        Iterator i = l.iterator();

//        while (i.hasNext()){
//            Student s = (Student)(i.next());
//            if(s.getName().equals("Henry")){
//                l.add(s4);
//            }
//        }

        /*
            解决方法
            方法1：在迭代器中添加元素，而不是在集合中，可以使用ListIterator迭代器的add方法
            方法2：在集合中添加元素，使用集合进行遍历，而不是使用迭代器进行遍历
         */

        // 方法1
        /*
        System.out.println("l:"+l);

        ListIterator lit = l.listIterator();

        while (lit.hasNext()) {
            Student s = (Student) (lit.next());
            if (s.getName().equals("Henry")) {
                lit.add(s4);
            }
        }

        System.out.println("new l:" + l);
        */

        // 方法2
        System.out.println("l:"+l);

        for (int i = 0; i < l.size(); i++) {
            Student s = (Student)(l.get(i));
            if(s.getName().equals("Henry")){
                l.add(i+1, s4);
            }
        }

        System.out.println("new l:"+l);
    }
}
