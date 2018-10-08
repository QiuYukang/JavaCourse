package day18_Map.c05_test;
/*
 * 统计字符串中的每个字符出现次数
 * 使用TreeMap(因为实现了compare接口)
 */

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        // StringBuilder s = new StringBuilder("Hello world! Hello Java!");
        TreeMap<Character, Integer> tm = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (tm.get(s.charAt(i)) != null) {
                tm.put(s.charAt(i), tm.get(s.charAt(i)) + 1);
            } else {
                tm.put(s.charAt(i), 1);
            }
        }

        // 遍历
        Set<Character> keySet = tm.keySet();
        System.out.println("\ncounting...\n");
        System.out.println("word        times");
        for (Character word : keySet) {
            System.out.println(" " + word + "           " + tm.get(word));
        }
    }
}
