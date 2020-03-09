package com.sourse.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Luke 2020/3/6 13:24
 */
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void tesyDataProbiter(String name,int age){
        System.out.println("name = " + name +";age = "+age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }
}
