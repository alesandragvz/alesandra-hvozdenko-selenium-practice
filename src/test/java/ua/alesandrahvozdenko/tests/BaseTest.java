package ua.alesandrahvozdenko.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest  {
    @BeforeSuite
    void setUp(){
        System.out.println("I am in before suit");
    }
    @BeforeClass
    void setUp2(){
        System.out.println("I am in before class");
    }
    @BeforeMethod
    void setUp3(){
        System.out.println("I am in before method");

    }
    @AfterMethod
    void tearDoow(){
        System.out.println("I am in After Method");
    }

}
