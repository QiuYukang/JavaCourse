package day18_Map.c08_poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class PokerGame {
    public static void main(String[] args) {
        String[] colors = {"♣", "♥", "♦", "♠", "小", "大"};
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "王"};
        ArrayList<Poker> pokers = new ArrayList();

        for (int i = 0; i < colors.length; i++) {
            if (i < 4) {
                for (int j = 0; j < numbers.length - 1; j++) {
                    pokers.add(new Poker(colors[i], numbers[j]));
                }
            } else {
                for (int j = numbers.length - 1; j < numbers.length; j++){
                    pokers.add(new Poker(colors[i], numbers[j]));
                }
            }
        }

        System.out.println(pokers);
        Collections.shuffle(pokers);
        System.out.println(pokers);
    }
}
