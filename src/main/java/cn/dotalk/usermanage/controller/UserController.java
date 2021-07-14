package cn.dotalk.usermanage.controller;

import cn.dotalk.usermanage.entity.UserSimple;
import cn.dotalk.usermanage.mapper.UserSimpleDao;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserSimpleDao userSimpleDao;

    @ResponseBody
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public String get(@PathVariable("id") int id){
        UserSimple userSimple = userSimpleDao.selectByPrimaryKey(id);
        System.out.println(userSimple.toString());
        return userSimple.getUsername();
    }



    @ResponseBody
    @RequestMapping(value = "/body/data", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String writeByBody() {
        System.out.println(userSimpleDao);
        return "writeByBody";
    }




    @RequestMapping(value = "/add")
    public int add(){
        UserSimple user = new UserSimple();
        user.setRealname("ddd");
        user.setUsername("yongze2");
        user.setPassword("ddddd");
        return userSimpleDao.insert(user);
    }

//    删除
    @RequestMapping("/del/{id}")
    public int del(@PathVariable("id") int id){
        return userSimpleDao.deleteByPrimaryKey(id);
    }
}
