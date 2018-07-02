package com.cloud.demo.external.user;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.stereotype.Service;
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
 * @creater 2018/6/27 下午6:04
 * @modified
 */
@Service
public class ExternalPersonTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getPersonName() throws Exception {
        mockMvc.perform(get("/person/getPersonName"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("张三")));;
    }

}
