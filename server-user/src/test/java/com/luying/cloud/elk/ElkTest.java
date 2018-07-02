package com.luying.cloud.elk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.stereotype.Component;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/7/2 上午10:06
 * @modified
 */
@Component
public class ElkTest {
    private Logger logger = LoggerFactory.getLogger(ElkTest.class);

    public void testElk(){
        logger.info("INFO");
        logger.warn("WARN");
        logger.error("ERROR");
        logger.debug("DEBUG");
    }
}
