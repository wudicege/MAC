package com.org.Dao;

import java.util.ArrayList;
import java.util.List;

import com.org.entity.User;

public class UserDaoImpl implements UserDao {
 private static List<User> list = new ArrayList<>();
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		list.add(user);
		System.out.println("注册成功");
		
	}

	@Override
	public boolean login(String name, String pwd) {
		// TODO Auto-generated method stub
		boolean flag = false;
		 for (User u : list) {
			if (u.getName().equals(name)&&u.getPwd().equals(pwd)) {
				flag = true;
			}
			
		}
		 return flag;
		
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getName().equals(name)&&list.get(i).getPwd().equals(pwd)) {
//				System.out.println("登录成功");
//				flag = true;
//				break;
//			}
//			else{
//				flag = false;
//			}
//		}
//		
//		return flag;
	}

}
