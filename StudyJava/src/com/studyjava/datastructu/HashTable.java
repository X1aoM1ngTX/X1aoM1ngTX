package com.studyjava.datastructu;

public class HashTable<E> {
    private final int TABLE_SIZE = 10;
    private final Node<E>[] TABLE = new Node[TABLE_SIZE];

    public HashTable(){
        for (int i = 0; i < TABLE_SIZE; i++)
            TABLE[i] = new Node<>(null);
    }

    public void insert(E element){
        int index = hash(element);
        Node<E> prev = TABLE[index];
        while (prev.next != null)
            prev = prev.next;
        prev.next = new Node<>(element);
    }

    public boolean contains(E element){
        int index = hash(element);
        Node<E> node = TABLE[index].next;
        while (node != null) {
            if(node.element == element)
                return true;
            node = node.next;
        }
        return false;
    }

    public int hash(Object object){
        int hashCode = object.hashCode();
        return hashCode % TABLE_SIZE;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < TABLE_SIZE; i++) {
            Node<E> head = TABLE[i].next;
            while (head != null) {
                builder.append(head.element).append(" -> ");
                head = head.next;
            }
        }
        return builder.toString();
    }

    private static class Node<E> {
        private final E element;
        private Node<E> next;

        private Node(E element){
            this.element = element;
        }
    }
}