package com.charwayh;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author charwayH
 */
@SPI
public interface HelloService {
    String sayHello();

    @Adaptive
    String sayHello(URL url);
}
