package com.zhuang.uomm_web.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhuang.uomm_common.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {

    @ResponseBody
    @RequestMapping("/list")
    public String listUser(){

        User user = new User();
        user.setId(1L);
        user.setName("zhuang");
        user.setCreateDate(new Date());
        user.setCreateTime(new Timestamp(System.currentTimeMillis()));
        return JSONObject.toJSONString(user);
    }
}
