package com.feng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author fengzp
 * @date 17/4/27
 * @email fengzp@gzyitop.com
 * @company 广州易站通计算机科技有限公司
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}
