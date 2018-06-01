package com.org.service;

import com.org.Dao.UserDao;
import com.org.Dao.UserDaoImpl;
import com.org.entity.User;

public class UserServiceImpl implements UserService {
	UserDao dao = new UserDaoImpl();
	@Override
	public boolean login(String name, String pwd) {
		// TODO Auto-generated method stub

		return dao.login(name, pwd);
	}

	
	

	@Override
	public void register(User user) {
		dao.register(user);
		// TODO Auto-generated method stub

	}

}
