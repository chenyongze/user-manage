package cn.dotalk.usermanage.controller;

import cn.dotalk.usermanage.entity.UserSimple;
import cn.dotalk.usermanage.mapper.UserSimpleDao;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @Resource
    UserSimpleDao userSimpleDao;

    @RequestMapping("/version")
    public String version(){
        return "1.0.1";
    }


    // @todo 测试json
    @RequestMapping("/json")
    public Object json(){
        // 获取数据
        // UserSimple a =  userSimpleDao.selectByPrimaryKey(6);
        return JSON.toJSON(userSimpleDao.selectByPrimaryKey(6));
    }


}
