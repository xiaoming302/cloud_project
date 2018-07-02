package com.luying.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/24 下午9:50
 * @modified
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerUserApplication.class, args);
    }

}
