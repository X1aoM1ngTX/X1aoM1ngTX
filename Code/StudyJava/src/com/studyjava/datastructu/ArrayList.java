package com.studyjava.datastructu;

public class ArrayList<E> {
    private int size = 0;
    private int defaultLength = 10;
    private Object[] array = new Object[defaultLength];

    public void add(E element, int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("index out of bounds");
        if (size >= defaultLength ) {
            int newDefaultLength = defaultLength + (defaultLength >> 1);
            Object[] newArray = new Object[newDefaultLength];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
            defaultLength = newDefaultLength;
        }
        for (int i = size; i > index; i--)
            array[i] = array[i - 1];
        array[index] = element;
        size++;
    }

    @SuppressWarnings("unchecked")
    public E drop(int index) {
        if (index < 0 || index > size-1)
            throw new IndexOutOfBoundsException("index out of bounds");
        E element = (E) array[index];
        for (int i = index; i < size; i++)
            array[i] = array[i + 1];
        array[size - 1] = null;
        size--;
        return element;
    }

    public int get(int index) {
        if (index < 0 || index > size-1)
            throw new IndexOutOfBoundsException("index out of bounds");
        return (int) array[index];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++)
            builder.append(array[i] + " ");
        return builder.toString();
    }
}
