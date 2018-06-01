package com.org.service;

import com.org.entity.User;

public interface UserService {
//	用户登录
	boolean login(String name,String pwd);
//	用户注册
	void register(User user);

}