package com.org.Dao;

import com.org.entity.User;

public interface UserDao {
void register(User user);
boolean login(String name,String pwd);
}
