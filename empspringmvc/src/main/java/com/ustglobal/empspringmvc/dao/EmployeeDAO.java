package com.ustglobal.empspringmvc.dao;

import com.ustglobal.empspringmvc.dto.EmployeeBean;

public interface EmployeeDAO {

	public EmployeeBean login(int id, String password);
	public int register(EmployeeBean bean);
	public boolean deleteEmplpoyee(int id);
	public EmployeeBean searchEmployee(int id);
	public boolean updateEmployee(EmployeeBean bean);
	public boolean changePassword(int id, String password);
	

}
