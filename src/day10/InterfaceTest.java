package day10;

/**
 * 接口测试
 */

public class InterfaceTest {
    public static void main(String[] args){
        PingPangAthlete ppp = new PingPangAthlete("Bob", 27);

        System.out.println(ppp.getName() + ":" + ppp.getAge());
        ppp.sleep();
        ppp.eat();
        ppp.study();
        ppp.speak();
    }
}

// 说英语的接口
interface SpeakEnglish{
    public abstract void speak();
}

abstract class People{
    private String name;
    private int age;

    public People() {}

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sleep(){
        System.out.println("Sleep...");
    }

    public abstract void eat();
}

abstract class Athlete extends People{
    public Athlete() {}

    public Athlete(String name, int age){
        super(name, age);
    }

    public abstract void study();
}

abstract class Coach extends People{
    public Coach() {}

    public Coach(String name, int age){
        super(name, age);
    }

    public abstract void teach();
}

class PingPangAthlete extends Athlete implements SpeakEnglish{
    public PingPangAthlete() {}

    public PingPangAthlete(String name, int age){
        super(name, age);
    }

    public void eat(){
        System.out.println("PingPang athlete eat eggs...");
    }

    public void study(){
        System.out.println("PingPang athlete study playing PingPang games.");
    }

    public void speak(){
        System.out.println("PingPang athlete speak English.");
    }
}


class BasketballAthlete extends Athlete{
    public BasketballAthlete() {}

    public BasketballAthlete(String name, int age){
        super(name, age);
    }

    public void eat(){
        System.out.println("Basketball athlete eat beef...");
    }

    public void study(){
        System.out.println("Basketball athlete study playing basketball games.");
    }
}

class PingPangCoach extends Coach implements SpeakEnglish{
    public PingPangCoach() {}

    public PingPangCoach(String name, int age){
        super(name, age);
    }

    public void eat(){
        System.out.println("PingPang Coach eat eggs...");
    }

    public void teach(){
        System.out.println("PingPang Coach teach playing PingPang games.");
    }

    public void speak(){
        System.out.println("PingPang Coach speak English.");
    }
}

class BasketballCoach extends Coach{
    public BasketballCoach() {}

    public BasketballCoach(String name, int age){
        super(name, age);
    }

    public void eat(){
        System.out.println("Basketball coach eat beef...");
    }

    public void teach(){
        System.out.println("Basketball coach teach playing basketball games.");
    }
}