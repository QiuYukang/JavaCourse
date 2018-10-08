package day12_String;

/*
    String类：字符数组
              “abc”也可以看出一个String类的对象
              字符串时常量，一旦赋值，不能被改变
    构造方法：有很多，见API文档

 */

public class StringClassDemo {
    public static void main(String[] args) {
        //-----各类构造方法举例-----
        String s1 = new String();
        //直接输出类的对象，是输出toString方法，String类的toString方法已经被重写
        //s1 = "s1";
        System.out.println("s1 = new String():"+s1+" length:"+s1.length());

        System.out.println("\n");

        byte[] by1 = {'a', 'b', 'c'};
        String s2 = new String(by1);
        System.out.println("byte[] by1 = {'a', 'b', 'c'}");
        System.out.println("s2 = new String(byte[]) :"+s2);

        System.out.println("\n");

        String s3 = new String(by1, 1, 2);
        System.out.println("s3 = new String(by1, 1, 2):"+s3);

        System.out.println("\n");

        char[] ch = {'爱', '学', '习', 'A', 'B', 'C'};
        String s4 = new String(ch, 1, ch.length-1);
        System.out.println("char[] ch = {'爱', '学', '习', 'A', 'B', 'C'}");
        System.out.println("s4 = new String(ch, 1, ch.length-1):"+s4);


        //最常用----常量值
        String s5 = "Hello";
        int BNum = 0;
        int SNum = 0;
        int NNum = 0;

        s5 += "1World233";
        System.out.println("\ns5:"+s5);

        System.out.println("-----String类方法介绍-----");
        //------判断功能--------
        System.out.println("hello".contains("el"));
        for(int i=0; i<s5.length(); i++){
            System.out.println(s5.charAt(i));
            if(s5.charAt(i) >= 'a' && s5.charAt(i) <= 'z'){
                SNum ++;
            }else if(s5.charAt(i) >= 'A' && s5.charAt(i) <= 'Z'){
                BNum++;
            }else if(s5.charAt(i) >= '0' && s5.charAt(i) <= '9'){
                NNum++;
            }
        }
        System.out.println("大写字母个数："+BNum+"  小写字母个数："+SNum+" 数字个数："+NNum);

        byte[] x = "gakj哈".getBytes();    //字节数组里面都是整数8bits
        char[] y = "gakj哈".toCharArray();    //字符数组里面可以编码汉字16bits
        for(int i = 0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
        for (int i = 0; i<y.length; i++){
            System.out.print(y[i]+" ");
        }
        System.out.println();

        String s6 = "Hello";
        String s7 = "Joooa";
        String s8 = "Hel";

        System.out.println(s6.compareTo(s7));
        //看源码或者手动调试哈哈哈哈
        System.out.println(s6.compareTo(s8));
    }
}
