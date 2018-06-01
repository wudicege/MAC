package com.org.service;

import java.util.List;

import com.org.Dao.EmpoyeeDao;
import com.org.Dao.EmpoyeeDaoImpl;
import com.org.entity.Employee;

public class EmpoyeeServiceImpl implements EmpoyeeService {
    EmpoyeeDao dao = new EmpoyeeDaoImpl();
    
	@Override
	public void add(Employee emp) {
		dao.add(emp);
		// TODO Auto-generated method stub

	}

	@Override
	public boolean delete(int empid) {
		// TODO Auto-generated method stub
		dao.delete(empid);
		
		return false;
	}

	@Override
	public boolean updata(int empid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> findall() {
		
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Employee fingbyid(int id) {
		// TODO Auto-generated method stub
		return dao.findbyid(id);
	}

}
