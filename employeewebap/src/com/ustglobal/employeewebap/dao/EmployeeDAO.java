package com.ustglobal.employeewebap.dao;

import com.ustglobal.employeewebap.dto.EmployeeInfo;

public interface EmployeeDAO {
	
	public EmployeeInfo auth(int id, String password);
	
	public EmployeeInfo searchEmployee(int id);
	
	public boolean changePassword(int id, String password);
	
	public boolean registerEmployee(EmployeeInfo info);

}
