package ua.alesandrahvozdenko.tests.testNG;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class TestDemo2 extends BaseTest {
    Logger log = LoggerFactory.getLogger(TestDemo2.class);
    @Test
    void myTest(){
        log.info("laskjdhfsalkdfhj");
        System.out.println("MY test");
    }
}
