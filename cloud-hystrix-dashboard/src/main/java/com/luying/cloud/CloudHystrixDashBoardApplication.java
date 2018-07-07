package com.luying.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/7/7 下午12:44
 * @modified
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class CloudHystrixDashBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudHystrixDashBoardApplication.class, args);
    }

}
