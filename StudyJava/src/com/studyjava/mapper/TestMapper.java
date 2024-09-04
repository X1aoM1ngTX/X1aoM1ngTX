package com.studyjava.mapper;

import com.studyjava.entity.Student;
import com.studyjava.entity.Teacher;

import java.util.List;

public interface TestMapper {
    List<Student> selectAllStudent();
    List<Student> selectStudentByTid(int tid);
    int insertStudent(Student student);
    int deleteStudentById(int sid);
    Student selectStudentById(int sid);
    Teacher getTeacherById(int tid);
}
