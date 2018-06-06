package day0;

/**
 * 小芳的妈妈每天给她2.5元钱，她都会存起来，
 * 但是，每当这一天是存钱的第5天或者5的倍数的话，
 * 她都会花去6元钱，
 * 请问，经过多少天，小芳才可以存到100元钱。
 * */

class Day04Test{
    public static void main(String[] args){
        double dayMoney = 2.5;
        int day = 0;
        double totalMoney = 0;

        while(totalMoney < 100){
            if((day != 0) && (day%5 == 0)){
                totalMoney += dayMoney;
                totalMoney -= 6;
                day++;
            }else{
                totalMoney += dayMoney;
                day++;
            }
        }
        System.out.println("day is:"+day);
        System.out.println("money is:"+totalMoney);
    }
}