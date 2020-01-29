package ua.alesandrahvozdenko.tests;
import org.testng.annotations.*;


public class TestDemo extends BaseTest{

    @Test(testName = "Login with valid credentials", description = " Помещается тестовый сценарий")
    void  demoTest1(){
        System.out.println("My testDemo1");
    }
    @Test(priority = 2)
    void  demoTest2(){
        System.out.println("My testDemo2");
    }

    @Test(priority = 1, dependsOnMethods = "c_demoTest2")
    void  demoTestDependentOnDemo3(){
        System.out.println("My testDemo2");
    }
    @Test(dataProvider =  "invalidCredential", testName = "loginWithValidCredentials")
    void UserPageIsDisplayedWithMainElements(String userName, int userId){
        System.out.println("MyTestDemo3");
        System.out.println(userName + " " + userId);
    }

    }

    @DataProvider
    Object[][] invalidCredentials(){
        //my logic
        return new Object[][];
        { "Alex", 123}
        { "Olia", 321}
        {"Vasia", 521}

}
