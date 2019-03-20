package cn.hupovip.java;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

/**
 * Feign客户端
 * @author wu
 * @date 2019/3/20
 */
@FeignClient(name = "service-app-1",fallback = App1HystrixFeignFallback.class)
public interface App1FeignClient {

    @GetMapping(value = "/app1/test/getNow")
    LocalDateTime getNow();

}
