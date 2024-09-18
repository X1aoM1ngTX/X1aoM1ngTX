package com.studyjava.datastructu;

import java.util.NoSuchElementException;

public class LinkedQueue<E> {
    private final Node<E> head = new Node<>(null);

    public void offer(E element){
        Node<E> tail = head;
        while (tail.next != null)
            tail = tail.next;
        tail.next = new Node<>(element);
    }

    public E poll(){
        if (isEmpty()) throw new NoSuchElementException("队列为空");
        E element = head.next.element;
        head.next = head.next.next;
        return element;
    }

    public E peek(){
        if (isEmpty()) throw new NoSuchElementException("队列为空");
        return head.next.element;
    }

    public boolean isEmpty(){
        return head.next == null;
    }

    @Override
    public String toString() {
        if (isEmpty()) {return "[]";}
        StringBuilder builder = new StringBuilder();
        Node<E> node = head.next;
        while (node != null) {
            builder.append(node.element).append(" ");
            node = node.next;
        }
        return "[" + builder.toString().trim() + "]";
    }

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }
}
