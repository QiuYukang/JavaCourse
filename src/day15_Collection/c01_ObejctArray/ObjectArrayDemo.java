package day15_Collection.c01_ObejctArray;

/*
    创建五个学生对象、遍历对象----
        对象数组：长度固定、对象一个个创建，写入数组，删除，添加等操作太过于麻烦！！！
 */

public class ObjectArrayDemo {
    public static void main(String[] args) {
        Student[] s = new Student[2];

        s[0] = new Student("Bob", 21);
        s[1] = new Student("Jerry", 29);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
