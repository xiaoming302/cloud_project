package com.luying.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/24 下午8:35
 * @modified
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class CloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigApplication.class, args);
    }

}
