package com.huike.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestContraoler {
    @RequestMapping("/test")
    public Map getTest(){
        Map<String ,Object> map = new HashMap<>();
        map.put("key","罗剑很虎!");
        return map;

    }

}
