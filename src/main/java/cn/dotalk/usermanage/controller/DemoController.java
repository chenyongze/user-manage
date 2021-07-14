package cn.dotalk.usermanage.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @RequestMapping("/version")
    public String version(){
        return "1.0.1";
    }
    
    // @todo 测试json
    @RequestMapping("/json")
    public void json(){

    }


}
