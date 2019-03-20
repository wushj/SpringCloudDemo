package cn.hupovip.java;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


/**
 * app-1 测试
 * @author wu
 * @date   2019/3/20 10:00 AM
 */
@RestController
@RequestMapping("/test")
public class App1Controller {

    /**
     * 获取当前时间
     * @return
     */
    @GetMapping("/getNow")
    public Object getNow(){
        // 模拟延时触发断路器
//        try {
//            Thread.sleep(50000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("获取时间");
        return LocalDateTime.now();
    }

}
