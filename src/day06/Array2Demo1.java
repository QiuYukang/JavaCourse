package day06;

public class Array2Demo1 {
    public static void main(String[] args){
        int[][] array= new int[3][];

        array[0] = new int[2];
        array[1] = new int[1];
        array[2] = new int[4];

        //不规则二维数组遍历
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}
