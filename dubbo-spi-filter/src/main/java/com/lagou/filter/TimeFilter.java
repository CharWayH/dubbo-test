package com.lagou.filter;

import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;

/**
 * @author charwayH
 */

@Activate(group = {CommonConstants.CONSUMER,CommonConstants.PROVIDER})
public class TimeFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        long startTime = System.currentTimeMillis();
        try {
            return invoker.invoke(invocation);
        }finally {
            System.out.println("invoke time : " + (System.currentTimeMillis() - startTime) + "毫秒");
        }
    }
}
