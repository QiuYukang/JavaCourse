package day13_StringBuffer;

public class StringBuffer_method {
    public static void main(String[] args) {
        //插入方法--insert append
        StringBuffer sb = new StringBuffer();
        //返回它本身,不重新开辟空间
        StringBuffer sb2 = sb.append("Hello");
        sb.append(" world");
        //超出16后，自动加大空间+链式编程
        sb.append(" world").append(" world");
        sb2.insert(3, "qqq");

        System.out.println("sb:" + sb);
        System.out.println("sb2:" + sb2);
        System.out.println("sb.capacity():"+sb.capacity());
        System.out.println("sb.length():"+sb.length());
        System.out.println(sb == sb2);


        //删除方法--deleteCharAt  delete
        //[ ) 左闭右开
        sb.delete(3, 5);
        sb.deleteCharAt(6);
        System.out.println(sb);

        //替换功能 replace
        sb.replace(0, sb.length(),"Hello java!");
        System.out.println(sb);

        //反转功能 reverse
        sb.reverse();
        System.out.println(sb);

        //截取功能 substring
        String csq = sb.substring(0, 4);
        System.out.println(sb);
        System.out.println(csq);
    }
}
