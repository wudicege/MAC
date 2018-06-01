package com.org.action;

import java.util.Scanner;

import com.org.entity.User;
import com.org.service.UserService;
import com.org.service.UserServiceImpl;

public class UserAction {
	public static void main(String[] args) {
		
		
		
		UserService service = new UserServiceImpl();
		while (true) {
			User user = new User();
		System.out.println("欢迎进入系统");
			Scanner sc = new Scanner(System.in);
			System.out.println("1.注册2.登录3.退出");
			

			int key = sc.nextInt();
			if (key ==3 ) {
				System.out.println("退出");
				break;
			}
			switch (key) {
			case 1:
				System.out.println("注册姓名");
				String name = sc.next();
				System.out.println("注册密码");
				String pwd = sc.next();
				user.setName(name);
				user.setPwd(pwd);
				service.register(user);

				break;
			case 2:
				System.out.println("登录姓名");
				String name1 = sc.next();
				System.out.println("登录密码");
				String pwd1 = sc.next();
				boolean login = service.login(name1, pwd1);
				if (login) {
					System.out.println("登录成功");
				}else{
					System.out.println("登录失败");
				}

				break;
			case 3:
				System.out.println("退出成功");
				break;

			default:
				System.out.println("输入错误");
				break;
			}

		}
	}
}
