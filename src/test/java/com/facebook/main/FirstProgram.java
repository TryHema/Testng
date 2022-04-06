package com.facebook.main;

import org.testng.annotations.*;

public class FirstProgram {

    @BeforeSuite
    public void sample6() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void sample7() {
        System.out.println("After Suite");
    }

    @BeforeTest
    public void sample8() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void sample9() {
        System.out.println("After Test");
    }

    @BeforeClass
    public void sample1() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void sample2() {
        System.out.println("After class");
    }

    @BeforeMethod
    public void sample3() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void sample4() {
        System.out.println("After Method");
    }

    @Test (priority = -4)
    public void sample5() {
        System.out.println("test1");
    }

    @Test (priority = -2)
    public void abcd() {
        System.out.println("test2");
    }

    @Test (invocationCount = 5,invocationTimeOut = 10,enabled = false)
    public void xyz() {
        System.out.println("test3");
    }

    @Test (priority = 4)
    public void trs() {
        System.out.println("test4");
    }

}
