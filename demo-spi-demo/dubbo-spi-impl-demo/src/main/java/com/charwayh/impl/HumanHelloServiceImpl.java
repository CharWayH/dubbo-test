package com.charwayh.impl;

import com.charwayh.HelloService;
import org.apache.dubbo.common.URL;

/**
 * @author charwayH
 */
public class HumanHelloServiceImpl implements HelloService {
    public String sayHello() {
        return "你好啊我是人类";
    }

    public String sayHello(URL url) {
        return "Hello URL";
    }
}
