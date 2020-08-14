package com.itcyt.test;

import com.itcyt.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test(){
    ApplicationContext ac =  new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    AccountService as = (AccountService) ac.getBean("accountService");
    as.findAll();
    }
}
