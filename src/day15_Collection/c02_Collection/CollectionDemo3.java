package day15_Collection.c02_Collection;

/*
    toArray[]:集合变成数组，再实行遍历

 */

import java.util.ArrayList;

public class CollectionDemo3 {
    public static void main(String[] args) {
        ArrayList c = new ArrayList();
        c.add("Hello");
        c.add("World");

        Object[] obj = c.toArray();
        // 遍历
        for (int i = 0; i < obj.length; i++) {
            // 使用强制类型转换，实现查看每个字符串元素的长度
            System.out.println(obj[i]+"---"+((String)obj[i]).length());
        }
    }
}
