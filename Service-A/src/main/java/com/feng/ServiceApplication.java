package com.feng;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengzp
 * @date 17/4/27
 * @email fengzp@gzyitop.com
 * @company 广州易站通计算机科技有限公司
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

    @Value("${spring.application.name}")
    private String name;
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String hi(@RequestParam String id){
        return "hi, " + id + ", " + name + ":" + port;
    }

}
