package day12_String.StringTest_Login;

import java.util.Scanner;

public class GuessNumberGame {

    private GuessNumberGame() {}

    public static void start(){
        Scanner sc = new Scanner(System.in);

        //产生随机值
        int number = (int)(100*Math.random()) + 1;
        int times = 1;

        while(true){
            System.out.println("please input the number you guess:");
            if(sc.hasNextInt()) {
                int guessNum = sc.nextInt();
                if(guessNum == number){
                    System.out.println("right! you had guess "+times+" times!");
                    break;
                }else if(guessNum > number){
                    System.out.println("too big!");
                    times ++;
                }else{
                    System.out.println("too small!");
                    times++;
                }
            }else{
                System.out.println("error type of input!");
            }
        }
    }
}
