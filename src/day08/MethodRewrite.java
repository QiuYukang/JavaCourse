//package day08;

/*
    方法重写：子类中出现和父类声明一模一样的方法（方法名、参数、返回值都一样）
    方法重载：本类中出现的方法名一样，参数列表不同的方法，与返回值无关。

    方法重写注意事项：
    A：父类私有方法不能被重写，因为私有方法子类无法继承，谈不上重写。
    B：子类重写父类方法时，访问权限不能比父类低！
 */

public class MethodRewrite {
    public static void main(String[] args){
        Son s = new Son();
        s.show();
        s.call("Mama");
    }
}

class Father{
    Father(){}

    public void show(){
        System.out.println("Father.");
    }

    public void call(String name){
        System.out.println("call "+name);
    }
}

class Son extends Father{
    Son(){}

    //重写
    public void show(){
        System.out.println("Son.");
    }

    //重载
    public void show(int a){
        System.out.println("Son."+a);
    }

    //扩展功能
    public void call(String name){
        //直接使用父类的功能
        super.call(name);
        //增加新功能
        System.out.println("using WeChat");
    }
}
