package day08;

import java.util.Scanner;

public class GuessNumGame {
    public static void main(String[] args){

        //产生0-100的整数
        int number = (int)(100*Math.random()) + 1;
        //猜测值
        int guessNum;
        //猜测次数
        int times = 0;

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Please input the number you guess:");
            guessNum = sc.nextInt();

            times ++;

            if(guessNum == number){
                System.out.println("right!\nyou have guessed "+times+" times...");
                break;
            }else if(guessNum > number){
                System.out.println("too large!");
            }else{
                System.out.println("too small !");
            }
        }
    }
}
