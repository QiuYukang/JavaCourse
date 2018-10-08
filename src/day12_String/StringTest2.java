package day12_String;

/*
    1.把数组中的数据按照指定个格式拼接成一个字符串
        举例：int[] arr = {1,2,3};	输出结果：[1, 2, 3]
    2.字符串反转
        举例：键盘录入”abc”		输出结果：”cba”
    3.统计大串中小串出现的次数
        举例：在字符串” woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun”
        中java出现了5次

 */

public class StringTest2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 8};
        System.out.println(change(arr));

        System.out.println(reserve("abcfhsdjkfjsd"));

        System.out.println(findTimes("woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun", "java"));
    }

    //int数组变成字符串
    public static String change(int[] arr) {
        String s = "[";

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                //s += String.valueOf(arr[i])+", ";
                s += arr[i] + ", ";
            } else {
                //s += String.valueOf(arr[i])+"]";
                s += arr[i] + "]";
            }
        }

        return s;
    }

    //字符串反转
    public static String reserve(String s) {
        String sReserve = new String();

        for (int i = s.length() - 1; i >= 0; i--) {
            sReserve += s.charAt(i);
        }

        return sReserve;
    }

    //找出大串中子串出现次数
    public static int findTimes(String string, String subString) {
        int index = 0;
        int times = 0;
        int i = 0;

        //传入空字符串，直接退出
        if (string == null || subString == null) {
            return times;
        }

        while (i < string.length() - 1) {
            i = string.indexOf(subString, i);
            if (i != -1) {
                times++;
                //修改索引开始值
                i += subString.length();
            } else {
                break;
            }
        }

        return times;
    }
}
