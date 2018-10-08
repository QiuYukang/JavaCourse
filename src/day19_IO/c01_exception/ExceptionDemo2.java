package day19_IO.c01_exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        // 多个异常的处理
        int aa = 4;
        int[] arr = {0, 1, 2, 3};
        for (int i = 0; i <= arr.length; i++) {
            try {
                System.out.println(aa / arr[i]);
            } catch (Exception e) {
                // System.out.println(e.toString());
                e.printStackTrace();    // 输出异常信息和对应行号---最常用！！！
                System.out.println("再进行其它操作！");
            }
        }

        System.out.println("over");
    }
}
