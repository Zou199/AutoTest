package com.course.testng;


import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解，用例把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2() {
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试用例之前");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在测试用例之后");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是在类运行之后运行");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("AfterClass这是在类运行之前运行");
    }

    //测试套件在类之前运行，可以包含多个类
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件-类前");
    }
    //测试套件在类之后运行，可以包含多个类
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件-类后");
    }
}
