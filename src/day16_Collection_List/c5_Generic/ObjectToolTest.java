package day16_Collection_List.c5_Generic;


import day16_Collection_List.c4_test.Student;

public class ObjectToolTest {
    public static void main(String[] args) {
//        ObjectTool o = new ObjectTool();
//
//        o.setObj(new Integer(3));
//        System.out.println(o.getObj());
//
//        o.setObj("Bob");
//        System.out.println(o.getObj());

        // 泛型类的标准使用方法
        ObjectTool<String> o = new ObjectTool<>();
        o.setObj("邱玉康");
        System.out.println(o.getObj());

        // 方法不需要重载，只需要声明为泛型，则和类的传入参数类型一致
        o.show("Hello");
        o.show2(new Student("Bob",22));
        o.show2(31);
        o.show2(new Integer(33));
    }
}
