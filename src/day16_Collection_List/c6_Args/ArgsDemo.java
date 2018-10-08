package day16_Collection_List.c6_Args;

/*
    ------可变参数------
    写一个求和功能，要求和的参数数量可变
    格式：修饰符 返回值类型 方法名 (数据类型... 变量名) {}
    有多个参数时，可变参数一定要放在最后一个！
 */

public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(mySum(1, 2, 3, 4));
        System.out.println(mySum(1, 2));

        System.out.println(mySum2("Bob", 1, 2, 3, 5));
    }

    public static int mySum(int... a) {
        // 这里的变量其实是一个数组
        // 输出[I@4554617c
        // System.out.println(a);

        int sum = 0;
        for (int i : a) {
            sum += i;
        }

        return sum;
    }

    public static int mySum2(String name, int... a) {
        System.out.println(name + " is making a sum...");

        int sum = 0;
        for (int i : a) {
            sum += i;
        }

        return sum;
    }
}
