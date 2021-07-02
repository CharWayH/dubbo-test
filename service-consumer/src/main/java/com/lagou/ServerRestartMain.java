package com.lagou;

import com.lagou.router.ReadyRestartInstances;

/**
 * @author charwayH
 */
public class ServerRestartMain {
    public static void main(String[] args) throws Exception {
        ReadyRestartInstances.create().addRestartingInstance("service-provider","192.168.20.1");
    }
}
