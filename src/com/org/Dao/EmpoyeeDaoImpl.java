package com.org.Dao;

import java.util.ArrayList;
import java.util.List;

import com.org.entity.Employee;

public class EmpoyeeDaoImpl implements EmpoyeeDao {
    private static List<Employee> list = new ArrayList<>();
	@Override
	public void add(Employee emp) {
		list.add(emp);
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return list;
	}
	
	@Override
	public void delete(int empid) {
		for (Employee emp : list) {
			if (emp.getId()==empid) {
				list.remove(emp);
				System.out.println("删除成功");
			}
		}
		// TODO Auto-generated method stub
		
	}
	@Override
	public Employee findbyid(int id) {
		for (Employee  employee: list) {
			if (employee.getId()==id) {
				return employee;
			}
			
		}
		return null;
		// TODO Auto-generated method stub
	}

}
