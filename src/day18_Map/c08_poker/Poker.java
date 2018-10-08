package day18_Map.c08_poker;

public class Poker {
    // 花色
    private String color;
    // 数字
    private String number;

    public Poker(String color, String number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return color.concat(number);
    }
}
