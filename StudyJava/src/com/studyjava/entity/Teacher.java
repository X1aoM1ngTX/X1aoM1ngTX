package com.studyjava.entity;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    int id;
    String name;
    List<Student> studentList;
}
