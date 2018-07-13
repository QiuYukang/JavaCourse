package day10;

/*
    day10面试题---测试
        按照要求，补齐代码
        interface Inter { void show(); }
        class Outer { //补齐代码 }
        class OuterDemo {
            public static void main(String[] args) {
                  Outer.method().show();
              }
        }
        要求在控制台输出”HelloWorld”

 */

interface Inter2 {
    void show();


}

class Outer3 {
    public static Inter2 method(){
        return new Inter2() {
            @Override
            public void show() {
                System.out.println("Hello World!");
            }
        };
    }
}

public class OuterDemo {
    public static void main(String[] args){
        Outer3.method().show();
    }
}
