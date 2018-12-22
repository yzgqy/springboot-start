package com.gqy.springbootstart.controller;

import java.util.Date;

import com.gqy.springbootstart.entity.Client;
import com.gqy.springbootstart.entity.User;
import com.gqy.springbootstart.entity.common.JSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Client")
public class ClientController {


    @RequestMapping("/getUser")
//	@ResponseBody
    public Client getUser() {

        Client u = new Client();
        u.setName("imooc22");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("imooc2");
//        u.setDesc("hello imooc2~~");

        return u;
    }

    @RequestMapping("/getUserJson")
//	@ResponseBody
    public JSONResult getUserJson() {

        Client u = new Client();
        u.setName("imooc");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("imooc");
        u.setDesc("hello imooc~~hello imooc~~");

        return JSONResult.ok(u);
    }

    @RequestMapping("/getUser2")
//	@ResponseBody
    public Client getUser2() {

        Client u = new Client();
        u.setName("gqy");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("gqy");
//        u.setDesc("hello imooc2~~");

        return u;
    }
}