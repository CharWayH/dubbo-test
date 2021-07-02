package com.lagou.bean;

import com.lagou.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class ConsumerComponent {
    @Reference(loadbalance = "roundrobin")
    private HelloService helloService;

    public String sayHello(String name) throws InterruptedException {
        return helloService.sayHello(name);
    }
}
