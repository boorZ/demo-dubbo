package com.example.dubboconsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubboapi.DemoService;
import com.example.dubboapi.DemoUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Reference
    private DemoService service;

    @RequestMapping("/hello")
    public List<DemoUser> hello() {
        return service.listUser();
    }
}
