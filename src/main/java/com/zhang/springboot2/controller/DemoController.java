package com.zhang.springboot2.controller;


import com.zhang.springboot2.common.CreateWordUtil;
import com.zhang.springboot2.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/test/{id}")
    public void test(@PathVariable("id") Integer id) {
        CreateWordUtil cwu = new CreateWordUtil();
        Map<String, Object> dataMap = new HashMap<String, Object>();
        ///标识
        dataMap.put("id", id);
        ///姓名
        dataMap.put("name", "张三");
        dataMap.put("img", cwu.getImageStr("D:\\picture\\1.jpg"));
        cwu.createWord(dataMap);

    }
}
