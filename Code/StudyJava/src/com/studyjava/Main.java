package com.studyjava;

import com.studyjava.entity.Student;
import com.studyjava.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

public class Main {
    public static void main(String[] args) {
        try (SqlSession sqlSession = MybatisUtil.getSession(true)){
            TestMapper testMapper = sqlSession.getMapper(TestMapper.class);
            Student student1 = testMapper.selectStudentById(1);
            Student student2 = testMapper.selectStudentById(1);
            System.out.println(student1 == student2);
        }
    }
}

