package com.cloud.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
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
 * @creater 2018/6/27 下午6:05
 * @modified
 */
@Service
public class HystrixTest {

    @Autowired
    private MockMvc mockMvc;

    public void getPersonName() throws Exception {
        mockMvc.perform(get("/person/getPersonName"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("匿名用户")));
        ;
    }


}
