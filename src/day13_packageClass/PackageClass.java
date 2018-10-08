package day13_packageClass;

/*
    为了对基本数据类型进行更多的操作，java为所有基本类型提供了包装类型
    除了int--->Integer
        char--->Character
        其他都是首字母大写
        常见就是把基本类型变成字符串
 */

public class PackageClass {
    public static void main(String[] args) {
        int x = 100;
        String s = "-200";
        Integer i = new Integer(x);
        Integer i2 = new Integer(s);

        // 已重写toString方法
        System.out.println(i);
        System.out.println(i2);

        // ----  String 转换成 int
        int i3 = Integer.parseInt(s);
        System.out.println(i3);
    }
}
