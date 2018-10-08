package day19_IO.c01_exception;
/*
 * 第二种异常处理方法
 *  抛出异常：throws
 *      有些时候异常无法处理（没有权限或者处理不了，干脆就不处理了）
 *      主要用在方法上
 */

public class ExceptionDemo3 {
    public static void main(String[] args) {
        int aa = 4;
        int[] arr = {0, 1, 2, 3};

        for (int i = 0; i <= arr.length; i++) {
            System.out.println();
            try {
                System.out.println(aa / arr[i]);
            } catch (Exception e) {
                // System.out.println(e.toString());
                e.printStackTrace();    // 输出异常信息和对应行号---最常用！！！
                System.out.println("再进行其它操作！");
            } finally {
                System.out.println("arr[i]"+arr[i]);
            }
        }

        System.out.println("over");
    }
}
