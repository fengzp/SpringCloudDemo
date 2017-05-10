package com.feng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author fengzp
 * @date 17/5/9
 * @email fengzp@gzyitop.com
 * @company 广州易站通计算机科技有限公司
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}
