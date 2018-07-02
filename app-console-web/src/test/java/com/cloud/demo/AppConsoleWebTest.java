package com.cloud.demo;

import com.cloud.demo.config.HystrixTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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
