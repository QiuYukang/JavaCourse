package day15_Collection.c02_Collection;

/*
    创建学生对象，并遍历。

    结合的使用步骤
    A：创建集合对象
    B：创建元素对象
    C：把元素对象添加到集合对象
    D：遍历集合：
        通过集合对象获取迭代器对象
        利用迭代器的hasNext()和next()遍历集合即可
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        Student s1 = new Student("Bob", 21);
        Student s2 = new Student("Jerry", 29);

        c.add(s1);
        c.add(s2);

        // 返回接口，实际上是返回接口的具体实现类，所以可以把i强制转换成XXX类
        Iterator i = c.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
