package com.ustglobal.employeewebap.util;

import com.ustglobal.employeewebap.dao.EmployeeDAO;
import com.ustglobal.employeewebap.dao.EmployeeDAOJdbcImpl;

public class EmployeeDAOManager {
	
	private EmployeeDAOManager() {}
		public static EmployeeDAO getEmployeeDAO() {
			return new EmployeeDAOJdbcImpl();
		}
	}

	