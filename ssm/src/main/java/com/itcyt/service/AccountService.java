package com.itcyt.service;

import com.itcyt.domain.Account;

import java.util.List;

public interface AccountService {
    public List<Account> findAll();

    public void saveUser(Account account);
}
