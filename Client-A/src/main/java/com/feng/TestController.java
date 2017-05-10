package com.feng;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author fengzp
 * @date 17/5/9
 * @email fengzp@gzyitop.com
 * @company 广州易站通计算机科技有限公司
 */
@RestController
@RefreshScope
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiFallback")
    public String hi(@RequestParam String id){
        return restTemplate.getForObject("http://service-a/hi?id="+id, String.class);
    }

    public String hiFallback(String id) {
        return "hi, " + id + ", error!";
    }

    @Value("${ip}")
    private String ip;
    @Value("${port}")
    private String port;

    @RequestMapping("/getProperties")
    public String getProperties(){
        return ip + " : " + port;
    }
}
