package day16_Collection_List.c5_Generic;

/*
    泛型类编程
 */

public class ObjectTool<E> {
    private E obj;

    public E getObj() {
        return obj;
    }

    public void setObj(E obj) {
        this.obj = obj;
    }

    public void show(E obj){
        System.out.println(obj);
    }

    // 泛型方法，传入类型可以和类的不一致
    public <T> void show2(T obj){
        // 调用obj的toString方法
        System.out.println(obj);
    }
}
