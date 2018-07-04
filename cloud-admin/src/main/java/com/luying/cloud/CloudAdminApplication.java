package com.luying.cloud;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/7/4 下午8:40
 * @modified
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class CloudAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAdminApplication.class, args);
    }

}
