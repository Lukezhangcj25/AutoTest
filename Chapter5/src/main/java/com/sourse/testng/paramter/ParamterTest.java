package com.sourse.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Luke 2020/3/6 11:09
 */
public class ParamterTest {

    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
        System.out.println("name = " + name + " age = " + age);
    }
}
