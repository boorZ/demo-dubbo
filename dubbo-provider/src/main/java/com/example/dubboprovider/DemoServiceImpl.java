package com.example.dubboprovider;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubboapi.DemoService;
import com.example.dubboapi.DemoUser;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public List<DemoUser> listUser() {
        List<DemoUser> list = new ArrayList<>();
        list.add(new DemoUser(1L, "One - A"));
        return list;
    }
}
