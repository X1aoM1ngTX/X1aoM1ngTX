package com.xmcode.mapper;

import com.xmcode.entity.Book;
import com.xmcode.entity.Borrow;
import com.xmcode.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BookMapper {

    @Insert("insert into student(name, sex, grade) value(#{name}, #{sex}, #{grade})")
    int addStudent(Student  student);

    @Insert("insert into book(title, main, price) value(#{title}, #{main}, #{price})")
    int addBook(Book book);

    @Insert("insert into borrow(sid, bid) value(#{sid}, #{bid})")
    int addBorrow(@Param("sid")int sid, @Param("bid")int bid);

    @Results({
            @Result(column = "id", property = "id", id = true),
            @Result(column = "sid", property = "student", one = @One(select = "getStudentById")),
            @Result(column = "bid", property = "book", one = @One(select = "getBookByBid")),
    })
    @Select("select * from borrow")
    List<Borrow> getBorrowList();

    @Select("select * from student")
    List<Student> getStudentList();

    @Select("select * from book")
    List<Book> getBookList();

    @Select("select * from student where sid = #{sid}")
    Student getStudentById(int sid);

    @Select("select * from book where bid = #{bid}")
    Book getBookByBid(int bid);
}
