package com.lagou.service;

/**
 * @author charwayH
 */
public class HelloServiceMock implements HelloService {
    @Override
    public String sayHello(String name) throws InterruptedException {
        return "hello mock";
    }

    @Override
    public String sayHello(String name, int timeToWait) {
        return null;
    }
}
