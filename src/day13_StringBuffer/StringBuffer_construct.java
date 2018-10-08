package day13_StringBuffer;

/*
    解决String类浪费时间空间文体（不可更改，拼接等需要重新申请空间）
    可变字符序列（长度内容可变）
    线程安全（适合多线程）
    单线程一般使用StringBuilder,提供和StringBuffer兼容的API,速度更快（但是多线程不安全）

    构造方法：
        public StringBuffer()   无参构造
        public StringBuffer(int capacity)
        public StringBuffer(String str)

 */

public class StringBuffer_construct {
    public static void main(String[] args) {
        //第一种构造----最常使用----
        StringBuffer sb = new StringBuffer();
        //已经重写了toString方法
        System.out.println("sb:" + sb);
        //返回容量
        System.out.println("sb.capacity():" + sb.capacity());
        //返回实际长度
        System.out.println("sb.length():" + sb.length());

        System.out.println("----------");

        //第二种构造
        StringBuffer sb1 = new StringBuffer(30);
        //已经重写了toString方法
        System.out.println("sb1:" + sb1);
        //返回容量
        System.out.println("sb1.capacity():" + sb1.capacity());
        //返回实际长度
        System.out.println("sb1.length():" + sb1.length());

        System.out.println("----------");

        //第三种构造
        StringBuffer sb2 = new StringBuffer("Hello");
        //已经重写了toString方法
        System.out.println("sb2:" + sb2);
        //返回容量
        System.out.println("sb2.capacity():" + sb2.capacity());
        //返回实际长度
        System.out.println("sb2.length():" + sb2.length());
    }
}
