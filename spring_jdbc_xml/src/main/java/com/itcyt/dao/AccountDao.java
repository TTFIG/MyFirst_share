package com.itcyt.dao;

import com.itcyt.domain.Account;

import java.util.List;

public interface AccountDao {
    /*
    查询所有
     */
   List<Account> findAll();
}
