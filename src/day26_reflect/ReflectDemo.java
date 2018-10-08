package day26_reflect;
/*
 * 通过class文件而不是java文件来使用类的方法和属性。
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        // 获取字节码文件对象
        Class c = Class.forName("day18_Map.c07_Collections.Student");

        // 获取指定参数类型的构造器
        Constructor con = c.getConstructor(String.class, int.class);

        // 利用构造器创建对象
        Object o = con.newInstance("Bob", 21);
        System.out.println(o);

        // 获取所有成员变量(public和private)
        Field[] fds = c.getDeclaredFields();
        for (Field f : fds) {
            System.out.println(f.getName());
        }
    }
}
