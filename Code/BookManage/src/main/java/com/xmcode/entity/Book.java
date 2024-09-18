package com.xmcode.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Book {
    int bid;
    String title;
    String main;
    float price;

    public Book(String title, String main, float price) {
        this.title = title;
        this.main = main;
        this.price = price;
    }
}
