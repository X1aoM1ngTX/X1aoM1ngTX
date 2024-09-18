package com.studyjava.datastructu;

import java.util.NoSuchElementException;

public class LinkedStack<E> {
    private final Node<E> head = new Node<>(null);

    public void push(E element) {
        Node<E> node = new Node<>(element);
        node.next = head.next;
        head.next = node;
    }

    public E pop(){
        if (isEmpty()) throw new NoSuchElementException("栈为空");
        E element = head.next.element;
        head.next = head.next.next;
        return element;
    }

    public boolean isEmpty(){
        return head.next == null;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]"; // 如果链表为空，返回空列表表示
        }

        StringBuilder builder = new StringBuilder();
        Node<E> node = head;
        while (node != null) {
            builder.append(node.element).append(" ");
            node = node.next;
        }
        return "[" + builder.toString().trim() + "]"; // 去掉最后一个空格并加上方括号
}


    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

}
