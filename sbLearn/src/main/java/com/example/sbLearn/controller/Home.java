package com.example.sbLearn.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @RequestMapping("/hello")
    public String getIndex() {
        Res res = new Res();
        res.setName("测试Fast-Json-1");
        res.setAge(5656);

        return JSON.toJSONString(res);
    }
}
