package day10;

/*
内部类：类里面定义类
    位置：成员内部类、局部内部类

    成员内部类特点：
        成员内部类可以直接访问外部类所有东西；
        外部类要访问内部类，必须创建对象;
        访问内部类方法：外部类类名.内部类类名 对象名 = 外部类对象.内部类对象   对象名.内部类方法名
            如果内部类static修饰   则使用：外部类类名.内部类类名 对象名 = 外部类类名.内部类对象

        修饰：使用private修饰，保证数据安全
              使用static修饰，方便数据访问

    局部内部类特点：
        可以直接访问外部类的成员；
        可以在局部位置创建内部类对象，调用内部类方法

        要被局部内部类访问的局部变量必须修饰为final,因为局部变量会随着方法调用完毕而消失，
            而局部方法没有从堆内存消失，final局部变量为常量，不从堆内存消失！

    匿名内部类：
        格式1：new 类名/接口名(){
            重写方法;
        }

        格式2：类名/接口名 变量名 = new 类名/接口名(){
            重写方法;
        }
        本质：是一个 继承父类/实现该接口的子类匿名对象（可以用在接口或者类作为参数的方法中）
 */

public class InnerClassTest {
    public static void main(String[] args){
        new Outer().innerClassShow();
        //未使用private修饰时
        //new Outer().new Inner().show();

        //静态内部类的调用
        //方法1
        new Outer.StaticInner().show();
        new Outer.StaticInner().show2();
        //方法2
        Outer.StaticInner.show2();

        //局部内部类
        new Outer().classMethod();

        //匿名内部类
        new Outer2().method();

        //在开发中的应用
        //没有新造一个子类，只早了一个匿名内部类的对象,用完马上被回收,用一次非常好！
        new Outer2().develop(new Inter() {
            @Override
            public void show() {
                System.out.println("develop show()");
            }

            @Override
            public void show2() {
                System.out.println("develop show2()");
            }
        });
    }
}

class Outer{
    private int num = 10;
    private static int num2 = 100;

    //位于成员位置的内部类（成员内部类）
    private class Inner{
        public void show(){
            System.out.println("Outer class's num:"+num);
        }
    }

    static class StaticInner{
        public void show(){
            //static修饰只能访问static修饰的变量
            System.out.println("StaticInner show() num2:"+num2);
        }

        public static void show2(){
            System.out.println("StaticInner static show2()");
        }
    }

    public void innerClassShow(){
        new Inner().show();
    }

    public void classMethod(){
        final int num2 = 1000;

        //局部内部类
        class MethodInner{
            public void show(){
                System.out.println("MethodInner class num:"+num);
                System.out.println("MethodInner class final num2:"+num2);
            }
        }

        new MethodInner().show();
    }
}

interface Inter {
    public abstract void show();
    public abstract void show2();
}

class Outer2{
    public void method(){
        //----只有一个方法的时候-----
        /*
        //本质是一个对象，所以可以直接调用对象的方法
        new Inter(){
            @Override
            public void show(){
                System.out.println("Outer2 class's show() implement of interface \"Inter\"");
            }
        }.show();
        */

        //----有多个个方法的时候-----
        //可以将对象赋值给接口类型的变量（多态）
        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("Outer2 class's show() implement of interface \"Inter\"");
            }

            @Override
            public void show2() {
                System.out.println("Outer2 class's show2() implement of interface \"Inter\"");
            }
        };
        i.show();
        i.show2();
    }

    //匿名内部类在开发中的应用
    public void develop(Inter i){
        i.show();
        i.show2();
    }
}
