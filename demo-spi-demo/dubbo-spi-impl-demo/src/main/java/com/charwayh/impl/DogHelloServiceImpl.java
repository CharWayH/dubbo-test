package com.charwayh.impl;

import com.charwayh.HelloService;
import org.apache.dubbo.common.URL;

/**
 * @author charwayH
 */
public class DogHelloServiceImpl implements HelloService {
    public String sayHello() {
        return "wang wang wang,我是条狗！";
    }

    public String sayHello(URL url) {
        return "WANG URL";
    }
}
