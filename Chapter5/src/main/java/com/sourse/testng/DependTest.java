package com.sourse.testng;

import org.testng.annotations.Test;

/**
 * Created by Luke 2020/3/6 10:33
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1");
        //throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"Test1"})
    public void test2(){
        System.out.println("Test2");
    }

}
