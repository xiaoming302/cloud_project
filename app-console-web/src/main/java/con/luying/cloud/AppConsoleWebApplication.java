package con.luying.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/27 下午2:44
 * @modified
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class AppConsoleWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppConsoleWebApplication.class,args);
    }

}
