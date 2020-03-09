package com.sourse.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by Luke 2020/3/4 15:25
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforesuite 运行");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("aftersuite 运行");
    }

}
