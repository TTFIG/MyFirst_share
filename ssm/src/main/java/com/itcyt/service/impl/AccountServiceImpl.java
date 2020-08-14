package com.itcyt.service.impl;

import com.itcyt.dao.AccountDao;
import com.itcyt.domain.Account;
import com.itcyt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层~");
        return accountDao.findAll();
    }

    @Override
    public void saveUser(Account account) {
        accountDao.saveUser(account);
    }
}
