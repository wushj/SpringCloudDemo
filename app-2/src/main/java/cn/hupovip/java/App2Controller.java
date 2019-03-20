package cn.hupovip.java;


import cn.hupovip.sak.springboot.stater.hp.core.params.response.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * app-2 测试
 * @author wu
 * @date   2019/3/20 10:00 AM
 */
@RestController
@RequestMapping("/test")
public class App2Controller {

    @Autowired
    private App1FeignClient mApp1FeignClient;

    /**
     * 打印当前时间
     * @return
     */
    @GetMapping("/printNow")
    public Object printNow(){
        ResponseBuilder response = ResponseBuilder.obj().append("now", mApp1FeignClient.getNow());
        return response.ok();
    }


}
