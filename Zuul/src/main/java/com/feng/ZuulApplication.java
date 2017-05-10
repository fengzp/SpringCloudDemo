package com.feng;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author fengzp
 * @date 17/4/27
 * @email fengzp@gzyitop.com
 * @company 广州易站通计算机科技有限公司
 */
@SpringCloudApplication //这个注解整合了@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreake
@EnableZuulProxy
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

    @Bean
    public MyZuulFilter getZuulFilter(){
        return new MyZuulFilter();
    }
}
