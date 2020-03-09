package com.sourse.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by Luke 2020/3/5 16:16
 */
@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("class2 + stu1");
    }
    public void stu2(){
        System.out.println("class2 + stu2");
    }
}
