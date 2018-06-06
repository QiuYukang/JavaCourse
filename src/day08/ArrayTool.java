package day08;

/**
 * 针对int数组进行操作的工具类
 * @author 邱玉康
 * @version V1.0
 *
 */

public class ArrayTool {

    /**工具类常常使用static方法，构造方法采用private关键字
     *则只能通过类名调用方法，无需创建对象再使用！方便！
     * 私有构造看不到注释
     */
    private ArrayTool(){}

    /**
     * 遍历数组，输出格式为：[元素1，元素2，元素3...]
     * @param array 要被遍历的数组
     */
    public static void show(int[] array){
        System.out.print("[");
        for(int i = 0; i<array.length; i++){
            if(i != array.length-1){
                System.out.print(array[i]+", ");
            }else{
                System.out.print(array[i]);
            }
        }
        System.out.print("]\n");
    }

    /**
     * 查找数组中的元素的下标
     * @param array 被查找的数组
     * @param value 要查找的元素
     * @return 返回元素在数组中的索引，不存在则返回-1
     */
    public static int findIndex(int[] array, int value){
        int index = -1;

        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                index = i;
                break;
            }
        }

        return index;
    }
}
