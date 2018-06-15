//package day09;

public class AbstractTest {
    public static void main(String[] args){
        //多态版测试
        System.out.println("----无参构造----");
        Learner l = new PrimeLearner();
        l.setAge(20);
        l.setName("邱玉康");
        System.out.println("Name:"+l.getName()+"  Age:"+l.getAge());
        l.learn();
        l.say();

        System.out.println("\n----带参构造----");
        l = new AdvanceLearner("马云",49,"Boss");
        //System.out.println("Name:"+l.getName()+"  Age:"+l.getAge()+"  Job:"+l.getJob());
        /*Error:(16, 78) java: 找不到符号
          符号:   方法 getJob()
          位置: 类型为Learner的变量 l
        */
        //成员方法编译看左边~~找不到方法，报错！！！子类有特有的东西时，不建议使用多态测试，应该使用具体对应的子类来测试。
        System.out.println("Name:"+l.getName()+"  Age:"+l.getAge()+"  Job:"+((AdvanceLearner)l).getJob());
        l.learn();
        l.say();
    }
}

abstract class Learner{
    private String name;
    private int age;

    //无参构造
    public Learner(){}
    //带参构造
    public Learner(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    //抽象方法
    abstract public void say();

    //共有的方法
    public void learn(){
        System.out.println("learn JavaEE");
    }
}

class PrimeLearner extends Learner{
    public PrimeLearner(){}
    public PrimeLearner(String name, int age){
        super(name, age);
    }

    //重写抽象方法
    public void say(){
        System.out.println("prime learner");
    }
}

class AdvanceLearner extends Learner{
    //新增一个属性
    private String job;

    public AdvanceLearner(){}
    public AdvanceLearner(String name, int age, String job){
        super(name, age);
        this.job = job;
    }

    //重写抽象方法
    public void say(){
        System.out.println("advance learner");
    }

    //新增方法
    public void setJob(String job){
        this.job = job;
    }

    //新增方法
    public String getJob(){
        return this.job;
    }
}
