package ua.alesandrahvozdenko.tests;

import org.testng.annotations.*;
import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;


@Slf4j
public class TestDemo extends BaseTest {
    Logger log = Logger.getLogger(TestDemo.class.getName());
    @Test(priority = 2)
    void demoTest() {
        log.info("kjhgjkhg");
        System.out.println();

    }

    @Test(testName = "Login with valid credentials", description = " Помещается тестовый сценарий")
    void demoTest1() {
        System.out.println("My testDemo1");
    }

    @Test(priority = 2)
    void demoTest2() {
        System.out.println("My testDemo2");
    }

    @Test(priority = 1)
    void demoTestDependentOnDemo3() {
        System.out.println("My testDemo2");
    }

    @Test(dataProvider = "invalidCredential", testName = "loginWithValidCredentials")
    void UserPageIsDisplayedWithMainElements(String userName, int userId) {
        System.out.println("MyTestDemo3");
        System.out.println(userName + " " + userId);
    }

    @DataProvider
    Object[][] invalidCredentials() {
        //my logic
        return new Object[][]{
                {"Alex", 123},
                {"Olia", 321},
                {"Vasia", 521}
        };
    }
}
