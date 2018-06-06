package day07;

/**
 * --private关键字(封装)：
 *  A:把成员变量XXX用Private修饰
 *  B：提供对应的SetXXX()和getXXX方法
 * 这样可以防止非法访问和修改成员变量。
 * --this关键字
 * 代表当前类的一个对象，
 * 谁调用这个方法，这个方法内的this就代表谁。
 * 解决局部变量隐藏成员变量的问题。
 * --构造方法
 * 创建类XXX的时候系统默认给一个构造方法XXX()，
 * x = new XXX() 是在调用构造方法。
 * 如果自己写了构造方法，无论方法是否带有参数，系统都不再给构造方法，
 * 构造方法可以重载。
 */

class Student{
    //只能在类内访问
    private String name;
    private int age;

    //构造方法（系统默认给的）
    public Student(){

    }

    //构造方法的重载
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat(String food){
        System.out.println(name + " like eating "+food);
    }

    public int getAge(){
        return age;
    }

    //可以在方法中进行数据校验（标准代码中一般不做数据校验）
    //见名知意要求传入参数名字和被修改参数名字一样，但是......
    public void setAge(int age){
        if(age < 0 || age > 100){
            show("set failed! invalid age!");
        }else {
            //错误使用，变量就近原则，两个age是同一个变量
            //age = age;
            this.age = age;
            show("set success!");
        }
    }

    //private方法只能在类内调用
    private void show(String info){
        System.out.println(info);
    }
}
