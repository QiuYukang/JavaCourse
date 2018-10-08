package day16_Collection_List.c4_test;

import java.util.LinkedList;
import java.util.Objects;

public class StackOverLinkedList {
    // 栈顶元素
    private Object top;
    // 栈的长度
    private int num;
    // 栈数据
    private LinkedList data;

    // 无参构造，生成一个栈结构
    public StackOverLinkedList() {
        data = new LinkedList();
    }

    // 获取栈的长度
    public int getNum() {
        return num;
    }

    public void push(Object obj) {
        data.addLast(obj);
        num++;
        top = obj;
    }

    public Object pop() {
        if (num == 0)
            return null;

        top = data.getLast();
        num--;

        return data.removeLast();
    }

    public boolean isEmpty() {

        return data.isEmpty();
    }

    @Override
    public String toString() {
        return "StackOverLinkedList{" +
                "\n    top='" + top + '\'' + '\n' +
                "    num=" + num + '\n' +
                "    data=" + data + '\n' +
                '}' + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StackOverLinkedList)) return false;
        StackOverLinkedList that = (StackOverLinkedList) o;
        return getNum() == that.getNum() &&
                Objects.equals(top, that.top) &&
                Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {

        return Objects.hash(top, getNum(), data);
    }
}
