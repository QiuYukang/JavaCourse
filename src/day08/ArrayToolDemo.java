package day08;

public class ArrayToolDemo {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};

        ArrayTool.show(array);
        System.out.println(ArrayTool.findIndex(array, 5));
    }
}
