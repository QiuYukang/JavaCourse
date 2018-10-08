package day13_StringBuffer;

/*
    StringBuffer和String类型的相互转换
 */

public class StringBufferTest {
    public static void main(String[] args) {
        //String ----> StringBuffer
        //StringBuffer sb = "Hello";
        String s = "Hello";
        //String可以通过构造方法和append方法转成StringBuffer
        StringBuffer sb = new StringBuffer(s);
        sb.append(s);
        System.out.println(sb);

        //StringBuffer ---> String
        //通过构造方法 或者 toString方法
        String s2 = sb.toString();
        System.out.println(s2);
    }
}
