package com.org.action;

import java.util.List;
import java.util.Scanner;

import com.org.entity.Employee;
import com.org.service.EmpoyeeService;
import com.org.service.EmpoyeeServiceImpl;

public class EmployeeAction {
	public static void main(String[] args) {
		while (true) {
			EmpoyeeService empoyeeService = new EmpoyeeServiceImpl();
			System.out.println("员工管理系统");
			Scanner scanner = new Scanner(System.in);
			System.out.println("1.添加2.删除3.修改4.查询");
			int key = scanner.nextInt();
			switch (key) {
			case 1:
				System.out.println("请输入员工编号");
				int id = scanner.nextInt();
				System.out.println("请输入员工姓名");
				String name = scanner.next();
				System.out.println("请输入员工年龄");
				int age = scanner.nextInt();
				System.out.println("请输入员工的性别");
				String sex = scanner.next();
				Employee employee = new Employee(name, id, sex, age);
				empoyeeService.add(employee);

				break;
			case 2:
				System.out.println("删除谁的信息(id)");
				int id1 = scanner.nextInt();
				List<Employee> list1 = empoyeeService.findall();
				for (Employee employee2 : list1) {
					if (employee2.getId() == id1) {
						empoyeeService.delete(id1);
					}
				}
				break;
			case 3:
				System.out.println("需要修改的id");
				int id2 = scanner.nextInt();
				Employee fingbyid = empoyeeService.fingbyid(id2);
				System.out.println("1：改id2：改姓名3：改年龄4：改性别");
				int key1 = scanner.nextInt();
				switch (key1) {
				case 1:
                    System.out.println("新的id是");
                    int id3 = scanner.nextInt();
                    empoyeeService.delete(id2);
                    fingbyid.setId(id3);
                    empoyeeService.add(fingbyid);
                    
					break;
				case 2:
                    System.out.println("新的姓名是");
                    String name2 = scanner.next();
                    empoyeeService.delete(id2);
                    fingbyid.setName(name2);
                    empoyeeService.add(fingbyid);
					break;
				case 3:

					break;
				case 4:

					break;

				default:
					break;
				}

				break;
			case 4:
				System.out.println("查看所有信息");
				List<Employee> list = empoyeeService.findall();
				for (Employee employee2 : list) {
					System.out.println(employee2.toString());
				}
				break;
			default:
				break;
			}
		}
	}
}
