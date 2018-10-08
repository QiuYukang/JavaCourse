package day17_Collection_Set.c05_test;
/*
 * 编写一个程序，获取10个10~20之间的随机数，要求不能重复。
 */

import java.util.HashSet;
import java.util.Random;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        Random r = new Random();

        while (hs.size() < 10){
            hs.add(r.nextInt(20)+1);
        }

        System.out.println(hs);
    }
}
