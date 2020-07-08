package cn.itcyt.dao;

import cn.itcyt.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
