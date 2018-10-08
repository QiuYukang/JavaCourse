package day19_IO.c01_exception;
/*
 * 异常处理方案
 * A:try...catch...finally
 *      try{
 *          可能出现问题的代码;
 *      } catch(异常名 变量){
 *          针对问题的处理;
 *      } finally{
 *          资源释放;
 *      }
 *
 * B:throws
 */

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 0;
        int b = 4;
        // 一个异常的处理
        try {
            System.out.println(b / a);
        } catch (ArithmeticException ae) {
            System.out.println("分母为0！");
        } catch (Exception e) {
            System.out.println("出现了别的无法明确的异常！");
        } finally {
            System.out.println("over!");
        }

        // 多个异常的处理
        int aa = 4;
        int[] arr = {0, 1, 2, 3};
        for (int i = 0; i <= arr.length; i++) {
            try {
                System.out.println(aa / arr[i]);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("出现异常！");
            }
        }
    }
}
