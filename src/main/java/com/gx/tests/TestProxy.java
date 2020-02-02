package com.gx.tests;

import com.gx.service.AccountService;
import com.gx.service.Impl.AccountServiceImpl;
import com.gx.service.JdkProxy;

/**
 * @author wall
 * @data 10 - 23:40
 */
public class TestProxy {
    public static void main(String[] args) {

        AccountService accountService= new AccountServiceImpl();
        AccountService proxy = new JdkProxy(accountService).creatProxy();
        proxy.findAll();
    }
}
