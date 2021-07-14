package cn.dotalk.usermanage.controller;

import cn.dotalk.usermanage.entity.UserSimple;
import cn.dotalk.usermanage.mapper.UserSimpleDao;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserSimpleDao userSimpleDao;

    @RequestMapping("/get")
    public String get(){
        UserSimple userSimple = userSimpleDao.selectByPrimaryKey(3);
        return userSimple.getUsername();
    }

    @RequestMapping("/add")
    public String add(){
        UserSimple user = new UserSimple();
        user.setRealname("ddd");
        user.setUsername("yongze2");
        user.setPassword("ddddd");
        userSimpleDao.insert(user);
        return "add";
    }

//    删除
    @RequestMapping("/del/{id}")
    public int del(@PathVariable("id") int id){
        return userSimpleDao.deleteByPrimaryKey(id);
    }
}
