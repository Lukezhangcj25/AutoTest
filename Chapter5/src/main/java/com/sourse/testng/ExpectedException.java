package com.sourse.testng;

import org.testng.annotations.Test;

/**
 * Created by Luke 2020/3/6 10:11
 */
public class ExpectedException {
    /**
     *  异常测试
     * 预期结果为某一个异常的时候
     * 参入不合法参数时
     * 也就是说预期结果就是某个异常返回
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("异常");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("1111111111");
        throw new RuntimeException();


    }
}
