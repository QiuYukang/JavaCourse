package day16_Collection_List.c4_test;

/*
    去除ArrayList中的重复字符串
 */

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();

        l.add("Hello");
        l.add("Ella");
        l.add("Hello");
        l.add("Hello");
        l.add("Java");
        l.add("Ella");

        System.out.println(l);
        removeRepeted(l);
        System.out.println(l);
    }

    public static void removeRepeted(ArrayList l) {
        for (int i = 0; i < l.size() - 1; i++) {
            String s1 = (String) (l.get(i));

            for (int j = i + 1; j < l.size(); j++) {
                String s2 = (String) (l.get(j));

                if (s1.equals(s2)) {
                    l.remove(j);
                    j--;
                }
            }
        }
    }
}
