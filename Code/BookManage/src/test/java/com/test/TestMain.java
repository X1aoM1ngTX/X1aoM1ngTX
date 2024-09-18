package com.test;

import com.xmcode.sql.SqlUnit;
import org.junit.jupiter.api.Test;

public class TestMain {
    @Test
    void test1() {
        SqlUnit.doSqlWork(mapper -> mapper.getBorrowList().forEach(System.out::println));
    }
}
