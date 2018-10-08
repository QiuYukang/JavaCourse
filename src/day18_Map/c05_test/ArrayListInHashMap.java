package day18_Map.c05_test;
/*
 * ArrayList嵌套进HashMap中
 */

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class ArrayListInHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, ArrayList<String>> books = new LinkedHashMap<>();

        // 创建ArrayList
        ArrayList<String> sgyy = new ArrayList<>();
        sgyy.add("吕布");
        sgyy.add("周瑜");

        ArrayList<String> xajh = new ArrayList<>();
        xajh.add("令狐冲");

        ArrayList<String> sdxl = new ArrayList<>();
        sdxl.add("郭靖");
        sdxl.add("黄蓉");
        sdxl.add("杨过");

        // 添加到HashMap中
        books.put("三国演义", sgyy);
        books.put("笑傲江湖", xajh);
        books.put("神雕侠侣", sdxl);

        // 遍历
        Set<String> bookSet = books.keySet();
        for (String book : bookSet) {
            System.out.println(book+":");
            for(String name: books.get(book)){
                System.out.println(name);
            }
            System.out.println();
        }

    }
}
