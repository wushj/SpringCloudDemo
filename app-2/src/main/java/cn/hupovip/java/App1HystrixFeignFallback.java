package cn.hupovip.java;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * App1 Feign客户端断路器回调
 * @author wu
 * @date 2019/3/20
 */
@Component
public class App1HystrixFeignFallback implements App1FeignClient{

    @Override
    public LocalDateTime getNow() {
        System.out.println("断路器被触发");
        return null;
    }
}
