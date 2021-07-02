package com.lagou.service.impl;

import com.lagou.service.HelloService;

/**
 * @author charwayH
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        new StringBuffer();
        return "hello" + name;
    }

    @Override
    public String sayHello(String name, int timeToWait) {
        try {
            Thread.sleep(timeToWait);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello:" + name;
    }
}
