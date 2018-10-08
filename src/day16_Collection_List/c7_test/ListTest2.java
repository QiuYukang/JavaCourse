package day16_Collection_List.c7_test;

/*
    获取10个10~20之间的随机数，要求不能重复
 */

import java.util.ArrayList;
import java.util.Random;

public class ListTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        int count = 0;
        Random r = new Random();

        while (count < 10) {
            Integer i = r.nextInt(20) + 1;
            if (!l.contains(i)) {
                l.add(i);
                count++;
            }
        }

        System.out.println(l);

    }
}
