package com.gx.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wall
 * @data 19 - 21:57
 */
public class JdkProxy implements InvocationHandler  {
    private AccountService accountService;

    public JdkProxy(AccountService accountService) {
        this.accountService = accountService;
    }
    public  AccountService creatProxy(){
   AccountService proxy = (AccountService) Proxy.newProxyInstance(accountService.getClass().getClassLoader(),
                accountService.getClass().getInterfaces(),this);
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("fingAll".equals(method.getName())){
            System.out.println("查找所有用户");
            Object result = method.invoke(accountService, args);
            return result;
        }
        return method.invoke(accountService, args);
    }
}
