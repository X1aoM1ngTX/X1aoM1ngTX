package com.studyjava.entity;

import lombok.*;
import lombok.experimental.Accessors;

@Setter
@Getter
@Data
@Accessors(chain = true)
public class Student {
    int sid;
    String sname;
    int sage;
    String ssex;
    Teacher teacher;
}