package com.lagou;

import com.lagou.service.HelloService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author charwayH
 */
public class ConsumerApplication {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/dubbo-consumer.xml");
        applicationContext.start();
        HelloService helloService = (HelloService)applicationContext.getBean("helloService");
        String result = null;
        while(true){
            System.in.read();
            result = helloService.sayHello("wealthy",100);
            // 利用Future模式
            Future<Object> future = RpcContext.getContext().getFuture();
            System.out.println("result:" + result);
            System.out.println("future result:" + future.get());
        }
    }
}
