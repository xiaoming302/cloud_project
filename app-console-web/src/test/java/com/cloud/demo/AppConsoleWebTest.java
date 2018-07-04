package com.cloud.demo;

import com.cloud.demo.config.HystrixTest;
import con.luying.cloud.AppConsoleWebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/27 下午3:58
 * @modified
 */
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@SpringBootTest(classes = AppConsoleWebApplication.class)
public class AppConsoleWebTest {

    @Autowired
    private HystrixTest hystrixTest;

    @Test
    public void test() throws Exception {
        hystrixTest.getPersonName();
    }

}
