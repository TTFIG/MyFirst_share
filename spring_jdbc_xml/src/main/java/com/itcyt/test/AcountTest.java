package com.itcyt.test;

import com.itcyt.domain.Account;
import com.itcyt.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AcountTest {
    @Test
    public void Test(){
    //获取数据源
    ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    //得到业务层对象
    AccountService as = ac.getBean("accountService",AccountService.class);
    //执行方法
    List<Account> accounts = as.findAll();
        for (Account account:accounts
             ) {
            System.out.println(account);
        }
    }
}
