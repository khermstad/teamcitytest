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
        Assert.assertEquals(5, addUtil.add2Nums(2, 3));
    }

    @Test
    void add4Nums(){
        AddUtil addUtil = new AddUtil();
        Assert.assertEquals(8, addUtil.add2Nums(addUtil.add2Nums(2, 2), addUtil.add2Nums(2,2)));
    }

}