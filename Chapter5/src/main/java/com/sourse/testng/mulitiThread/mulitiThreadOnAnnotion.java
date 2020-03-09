package com.sourse.testng.mulitiThread;

import org.testng.annotations.Test;

/**
 * Created by Luke 2020/3/9 10:28
 */
public class mulitiThread {
    @Test(invocationCount = 10,threadPoolSize=3)
    public void test(){
        System.out.println(1);
        System.out.printf("Tread Id : %s%n",Thread.currentThread().getId());
        
    }
}
