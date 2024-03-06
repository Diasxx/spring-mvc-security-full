package com.springboot.dao;

import com.springboot.entity.User;

public interface UserDao {

    User findByUserName(String userName);

    void save(User theUser);
}
