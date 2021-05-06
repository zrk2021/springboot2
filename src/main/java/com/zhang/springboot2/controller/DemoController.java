package com.zhang.springboot2.controller;


import com.zhang.springboot2.common.CreateWordUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/test")
    public void test() {
        Map<String, Object> dataMap = new HashMap<String, Object>();
        ///标识
        dataMap.put("id", "1");
        CreateWordUtil.createWord(dataMap);
        ///姓名
        dataMap.put("name", "张三");
        CreateWordUtil.createWord(dataMap);

    }
}
