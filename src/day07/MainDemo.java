package day07;

/**
 *  main()方法的使用
 *       public static void main(String[] args){...}
 *       public:公共的方法，访问权限最大，main()被JVM调用，所以权限要够大
 *       static:静态方法，不需要创建对象就可以调用。方便JVM调用
 *       void:返回值是返回给调用者的，JVM不看返回值
 *       main:运行入口
 *       String[] args:这是一个字符串数组，用于命令行运行程序时，接收输入字符串
 */

public class MainDemo {
    public static void main(String[] args){
        System.out.println("args:"+args);
        System.out.println("arg.length:"+args.length);
    }
}
