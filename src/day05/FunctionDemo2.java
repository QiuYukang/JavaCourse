package day05;
/*
    函数的重载：
    针对方法功能相同，但是参数列表不同，Java允许方法名一样，
    同一个函数，功能一样，参数不同（参数个数或者类型不同都可以），
    这叫做方法重载
 */

public class FunctionDemo2 {
    public static void main(String[] args){
        byte b1 = 'a';
        byte b2 = 'A';
        int i1 = 666;
        int i2 = 666;

        System.out.println("compare:"+compare(b1, b2));
        System.out.println("compare:"+compare(i1, i2));
    }

    public static boolean compare(byte a, byte b){
        System.out.print("byte ");
        return (a == b);
    }

    public static boolean compare(int a, int b){
        System.out.print("int ");
        return (a == b);
    }
}
