package day18_Map.c05_test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/*
 * HashMap键值对的嵌套
 */

public class HashMapInHashMap {
    public static void main(String[] args) {
        // 嵌套格式，申请方法
        HashMap<String, HashMap<String, Integer>> hm = new HashMap<>();

        // class1集合
        HashMap<String, Integer> class1 = new HashMap<>();
        class1.put("Bob", 21);
        class1.put("John", 22);

        // class2集合
        HashMap<String, Integer> class2 = new HashMap<>();
        class2.put("Jim", 21);
        class2.put("Jerry", 20);
        class2.put("Helen", 19);

        // 把所有班级添加进集合中
        hm.put("class1", class1);
        hm.put("class2", class2);

        // System.out.println(hm);
        // 遍历
        Set<String> classSet = hm.keySet();
        for (String className : classSet) {
           HashMap<String, Integer> stuMap = hm.get(className);
           Set<String> stuSet = stuMap.keySet();
           for(String stu:stuSet){
               System.out.println(className+"   "+stu+"   "+stuMap.get(stu));
           }
        }
    }
}
