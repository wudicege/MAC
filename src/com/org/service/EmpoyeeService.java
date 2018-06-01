package com.org.service;

import java.util.List;

import com.org.entity.Employee;

public interface EmpoyeeService {
 void add(Employee emp);
 boolean delete(int empid);
 boolean updata(int empid);
 List<Employee> findall();
 Employee fingbyid(int id);
 
}
