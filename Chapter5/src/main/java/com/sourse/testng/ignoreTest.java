package com.sourse.testng;

import org.testng.annotations.Test;

/**
 * Created by Luke 2020/3/5 14:45
 */
public class ignoreTest {
    @Test
    public void ignoreTest1(){
        System.out.println("忽略测试");
    }

    @Test(enabled =  false)
    public void ignoreTest2(){
        System.out.println("忽略测试");
    }

}
