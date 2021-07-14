package cn.dotalk.usermanage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping("/say")
    public String say(){
        return "Hello World ";
    }


    @RequestMapping("/todo")
    public String todo(){
        return "{'todo...'}";
    }
}
