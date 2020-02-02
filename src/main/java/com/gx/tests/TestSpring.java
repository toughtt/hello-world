package com.gx.tests;

import com.gx.service.AccountService;
import com.gx.service.JdkProxy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wall
 * @data 2019 - 15:33
 */

public class TestSpring {

    @Test
    public void run1(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.findAll();
    }
    @Test
    public void demo(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService accountService = (AccountService) ac.getBean("accountService");
        AccountService proxy =new JdkProxy(accountService).creatProxy();
        proxy.findAll();
    }
}
