package ua.alesandrahvozdenko.tests.simpleSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumDemoTest {
    @Test
    void test1() {
        System.setProperty("webdriver.chrome.driver", "/Users/alexandragvozdenko/Desktop/projects/alesandra-hvozdenko-selenium-practice/src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/");
    }
}
