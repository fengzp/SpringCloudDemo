package com.feng;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author fengzp
 * @date 17/4/27
 * @email fengzp@gzyitop.com
 * @company 广州易站通计算机科技有限公司
 */
@Component
@FeignClient(value = "service-a", fallback = ServiceAFeignClientFallback.class) //这里的value对应服务的spring.applicatoin.name
public interface ServiceAFeignClient {

    @RequestMapping(value = "/hi")
    String hi(@RequestParam("id") String id);

}
