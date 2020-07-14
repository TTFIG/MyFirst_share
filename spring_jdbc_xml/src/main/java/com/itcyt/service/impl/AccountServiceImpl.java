package com.itcyt.service.impl;

import com.itcyt.dao.AccountDao;
import com.itcyt.dao.impl.AccountDaoImpl;
import com.itcyt.domain.Account;
import com.itcyt.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

}
