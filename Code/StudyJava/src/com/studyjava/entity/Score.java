package com.studyjava.entity;

public class Score<T> {
    String name;
    int id;
    T value;

    public Score(String name, int id, T value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
