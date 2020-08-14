package com.xiangyang.crm.utils;

public class ServiceFactory {

    public static Object getService(Object target){
        return new TransactionInvocationHandler(target).getProxy();
    }

}
