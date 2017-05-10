package com.feng;

import org.springframework.stereotype.Component;

/**
 * @author fengzp
 * @date 17/5/9
 * @email fengzp@gzyitop.com
 * @company 广州易站通计算机科技有限公司
 */
@Component
public class ServiceAFeignClientFallback implements ServiceAFeignClient {

    @Override
    public String hi(String id) {
        return "hi, " + id + ", error!";
    }

}
