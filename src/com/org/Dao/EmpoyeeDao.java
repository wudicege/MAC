package com.org.Dao;

import java.util.List;

import com.org.entity.Employee;

public interface EmpoyeeDao {

	void add(Employee emp);

	List<Employee> findAll();

	void delete(int empid);

	Employee findbyid(int id);

}
