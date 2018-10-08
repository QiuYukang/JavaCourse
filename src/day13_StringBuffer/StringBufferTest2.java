package day13_StringBuffer;


/*
    1.把数组中的数据按照指定个格式拼接成一个字符串
        举例：int[] arr = {1,2,3};	输出结果：[1, 2, 3]
    2.字符串反转
        举例：键盘录入”abc”		输出结果：”cba”
    3.判断字符串是否对称
 */

public class StringBufferTest2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(change(arr));
        System.out.println(myReverse(change(arr)));
        System.out.println(isSymmetry("abcba"));
        System.out.println(isSymmetry("abca"));

        //StringBuffer作为形式参数--和String作为形式参数有所不同
        StringBuilder sb = new StringBuilder("Hello");
        String s = "Hello";
        myChange(sb, s);
        System.out.println(sb);
        System.out.println(s);

    }

    // 使用StringBuffer节约内存
    public static String change(int[] arr) {
        StringBuffer sb = new StringBuffer("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                sb.append(arr[i]).append(", ");
            } else {
                sb.append(arr[i]).append("]");
            }
        }

        return sb.toString();
    }

    // 直接利用StringBuffer类得字符串反功能
    public static String myReverse(String s){
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();

        return sb.toString();
    }

    public static boolean isSymmetry(String s){
        int mid = s.length()/2;

        for(int i=0; i<mid; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }

        return true;
    }

    public static void myChange(StringBuilder sb, String s){
        sb.deleteCharAt(0);
        s += "0";
    }
}
