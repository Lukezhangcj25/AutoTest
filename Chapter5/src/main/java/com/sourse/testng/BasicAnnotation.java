package com.sourse.testng;

import org.testng.annotations.*;

/**
 * Created by Luke 2020/3/4 13:35
 */
public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("11111");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod测试方法之前运行!");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod测试方法之后运行!");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass类之前运行!");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass类之后运行!");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件!");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件!");
    }
}
