package com.sourse.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * Created by Luke 2020/3/5 14:50
 */
public class GroupsOnMethod {
    @Test(groups =  "server")
    public void test1(){
        System.out.println("groups-server-1");
    }
    @Test(groups =  "server")
    public void test2(){
        System.out.println("groups-server-2");
    }
    @Test(groups =  "client")
    public void test3(){
        System.out.println("groups-client-1");
    }
    @BeforeGroups("server")
    public void beforeGroups(){
        System.out.println("groups之前执行！");
    }
    @AfterGroups("server")
    public void afterGroups(){
        System.out.println("groups之后执行！");
    }
}
