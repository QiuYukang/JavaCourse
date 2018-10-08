package day16_Collection_List.c4_test;

/*
    用LinkedList模拟实现栈数据结构集合
 */

public class LinkedListTest {
    public static void main(String[] args) {
        StackOverLinkedList stack = new StackOverLinkedList();

        stack.push("Bob");
        stack.push("John");

        System.out.println(stack);

        System.out.println(stack.pop());
        stack.push("King");
        System.out.println(stack);

        Student s = new Student("Qiu", 21);
        stack.push(s);
        System.out.println(stack);

        System.out.println(stack.isEmpty());
    }
}
