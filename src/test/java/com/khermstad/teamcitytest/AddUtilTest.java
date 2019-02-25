package com.khermstad.teamcitytest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AddUtilTest {

    @Test
    void add2Nums() {
        AddUtil addUtil = new AddUtil();
        System.out.println("TEST WORKS");
        Assert.assertEquals(5, addUtil.add2Nums(3, 3));
    }
}