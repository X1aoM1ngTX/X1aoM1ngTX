package com.xmcode.sql;

import com.xmcode.mapper.BookMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.function.Consumer;

public class SqlUnit {

    private SqlUnit(){}

    public static SqlSessionFactory factory;
    static {
        try {
            String resource = "mybatis_conf.xml";
            factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void doSqlWork(Consumer<BookMapper> consumer) {
        try (SqlSession sqlSession = factory.openSession(true)) {
            BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
            consumer.accept(bookMapper);
        }
    }
}
