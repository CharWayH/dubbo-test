package com.lagou.service;

public interface HelloService {
    String sayHello(String name) throws InterruptedException;


    String sayHello(String name,int timeToWait);
}
