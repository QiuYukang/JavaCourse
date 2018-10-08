package day12_String;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";

        System.out.println(s3 == s1 + s2);    //变量拼接，需要新开辟内存来放拼接后的字符串
        System.out.println(s3.equals(s1+s2));
        System.out.println(s3 == ("hello" + "world"));    //编译的时候直接帮你拼接好了，因为是字符串常量
        System.out.println(s3.equals("helloworld"));
    }
}
