package cn.dotalk.usermanage.controller;

import cn.dotalk.usermanage.entity.UserSimple;
import cn.dotalk.usermanage.mapper.UserSimpleDao;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    UserSimpleDao userSimpleDao;

    @ResponseBody
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Object get(@PathVariable("id") int id){
        UserSimple userSimple = userSimpleDao.selectByPrimaryKey(id);
        log.info(userSimple.getPassword());
        return JSON.toJSON(userSimple);
    }

    @ResponseBody
    @RequestMapping(value = "/body/data", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String writeByBody() {
        System.out.println(userSimpleDao);
        return "writeByBody";
    }

    // 添加数据
    @RequestMapping(value = "/add")
    public int add(){
        UserSimple user = new UserSimple();
        user.setRealname("ddd");
        user.setUsername("yongze2");
        user.setPassword("ddddd");
        return userSimpleDao.insert(user);
    }

    // 删除
    @RequestMapping("/del/{id}")
    public int del(@PathVariable("id") int id){
        return userSimpleDao.deleteByPrimaryKey(id);
    }
}
