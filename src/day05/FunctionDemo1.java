package day05;

/**
 * 方法不可以嵌套定义
 */

public class FunctionDemo1 {
    public static void main(String[] args){
        int c = add(1,2);
        System.out.println("1 + 2 = "+c);

        printNN(9);
    }

    public static int add(int a,int b){
        return a+b;
    }

    /**
     * 输出乘法口诀表
     */
    public static void printNN(int n){
        for(int x=1; x<=n; x++){
            for(int y=1; y<=n; y++){
                System.out.print(x+"*"+y+"="+x*y+"\t");
            }
            System.out.print("\n");
        }
    }
}
