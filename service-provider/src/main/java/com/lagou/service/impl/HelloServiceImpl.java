package com.lagou.service.impl;

import com.lagou.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service(loadbalance="roundrobin")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello: " + name;
    }

    @Override
    public String sayHello(String name, int timeToWait) {
        return null;
    }
}
