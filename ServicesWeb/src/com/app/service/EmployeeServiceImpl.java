package com.app.service;

import com.app.beans.Employee;

public class EmployeeServiceImpl implements IEmployeeServiece {

	@Override
	public int saveEmployee(Employee emp) {
		System.out.println("added in service"+emp.toString());
		return 1;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
