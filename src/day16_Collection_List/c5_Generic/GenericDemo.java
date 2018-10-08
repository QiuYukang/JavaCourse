package day16_Collection_List.c5_Generic;

/*
    泛型编程  明确数组类型（API里面类、接口、抽象类中写了E的）
 */

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args) {
        // 明确是String类型的ArrayList,这样就不能插入其它类型的数据了
        // 而且从中取出的元素也直接就是String类型
        ArrayList<String> l = new ArrayList<>();

        l.add("Hello");
        l.add("World");
        // l.add(22);
        l.add("Java");

        Iterator<String> it = l.iterator();

        while(it.hasNext()){
            // 已经不需要 String s = (String)(it.next)了
            System.out.println(it.next());
        }
    }
}
