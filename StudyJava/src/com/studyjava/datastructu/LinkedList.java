package com.studyjava.datastructu;

public class LinkedList<E> {

    private int size;
    private final Node<E> head = new Node<>(null);

    public void add(E element, int index){
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("index out of bounds" + size);
        Node<E> prev = head;   //先找到对应位置的前驱结点
        for (int i = 0; i < index; i++)
            prev = prev.next;
        Node<E> node = new Node<>(element);   //创建新的结点
        node.next = prev.next;   //先让新的节点指向原本在这个位置上的结点
        prev.next = node;   //然后让前驱结点指向当前结点
        size++;   //完事之后一样的，更新size
    }

    public E drop(int index) {
        if (index < 0 || index > size-1)
            throw new IndexOutOfBoundsException("index out of bounds");
        Node<E> prev = head;
        for (int i = 0; i < index; i++)
            prev = prev.next;
        E element = prev.next.element;
        prev.next = prev.next.next;
        size--;
        return element;
    }

    public E get(int index){
        if(index < 0 || index > size - 1)
            throw new IndexOutOfBoundsException("非法的位置，合法的位置为：0 ~ "+(size - 1));
        Node<E> node = head;
        while (index-- >= 0)   //这里直接让index减到-1为止
            node = node.next;
        return node.element;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<E> node = head.next;   //从第一个结点开始，一个一个遍历，遍历一个就拼接到字符串上去
        while (node != null) {
            builder.append(node.element).append(" ");
            node = node.next;
        }
        return builder.toString();
    }

    private static class Node<E> {  //结点类，仅供内部使用
        E element;   //每个结点都存放元素
        Node<E> next;   //以及指向下一个结点的引用

        public Node(E element) {
            this.element = element;
        }
    }
}
