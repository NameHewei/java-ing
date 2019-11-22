package com.example.sbLearn.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {


    @RequestMapping("/hello")
    public String getIndex() {
        Res res = new Res();

//        return "{\"data\": \"hello java!\" }";
        String text = JSON.toJSONString(res); //序列化
//        VO vo = JSON.parseObject("{...}", VO.class);
        return text;
    }
}
