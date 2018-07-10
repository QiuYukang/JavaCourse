package day10;

/*
形式参数：基本类型+引用类型
    引用类型：
    类做形参；需要该类的对象
    抽象类做形参：真正需要的是该抽象类的实现类
    接口做形参：真正需要的是该接口的实现类
 */

public class ParameterTest {
    public static void main(String args[]){
        ParameterDemo PT = new ParameterDemo();
        //匿名类作为实际参数
        PT.method(new Parameter());

        //抽象类作为形参
        AbstractParameter APT = new Parameter();
        PT.method2(APT);

        //接口作为形参
        InterfacePara iP = new InterfacePara();
        PT.method3(iP);
    }
}

class ParameterDemo{
    //类作为形参
    public void method(Parameter p){
        p.show();
    }

    //抽象类作为形参
    public void method2(AbstractParameter p){
        //show()是抽象方法，所以需要有具体子类继承抽象类并重写改方法。
        p.show();
    }

    //接口作为形参
    public void method3(InterfaceShow i){
        i.interfaceShow();
    }
}

abstract class AbstractParameter{
    public abstract void show();
}

class Parameter extends AbstractParameter{
    public void show(){
        System.out.println("show....");
    }
}

interface InterfaceShow{
    public abstract void interfaceShow();
}

class InterfacePara implements InterfaceShow{
    public void interfaceShow(){
        System.out.println("interface show...");
    }
}