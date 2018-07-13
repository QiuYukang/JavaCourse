package day10;

/*
修饰符
--权限修饰符
    场景/修饰符           public  protected  默认  private
    同一类中              √       √          √     √
    同一包子类、其他类     √       √          √
    不同包子类            √       √
    不同包其他类          √

    设计原则：所有地方都可以任意访问用public, 所有地方只能子类访问用protected,
             只能同一包下任意访问用默认, 只能同一类中访问用private.

--状态修饰符
    static:
    final:

--抽象修饰符
    abstract:

修饰地点
--类
    默认、public(一般用这个)
    final(不可继承)
    static(不可修饰外部类，可以修饰内部类)
    abstract(抽象类)
--成员变量
    public、默认、protected、private(一般使用私有修饰)
    static(只能在类中访问) 、final(表示常量)
--构造方法
    public(一般用这个)、protected、默认、private
--成员方法
    public、protected、默认、private
    static、final
    abstract(抽象方法)

总结：一般来说，类用public修饰、成员变量用private修饰、构造方法用public修饰、成员方法用public修饰。
 */

public class ModifierTest {
    public static void main(String[] args){

    }
}
