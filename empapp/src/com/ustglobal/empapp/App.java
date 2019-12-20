package com.ustglobal.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {
	public static void main(String[] args) {
		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert  employee data");
		System.out.println("Press 3 to update  employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search single employee data");
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch) {
		
		case 1: //EmployeeDAOImpl impl = new EmployeeDAOImpl();
			//List<EmployeeBean> result = impl.getAllEmployeeData();
			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
		        List<EmployeeBean> result = dao.getAllEmployeeData();
		        
		        for(EmployeeBean bean : result){
		        	System.out.println("Name: "+bean.getName());
		        	System.out.println("Id: "+bean.getId());
		        	System.out.println("Salary: "+bean.getSalary());
		        	System.out.println("Gender: "+bean.getGender());
		        }
		        break;
		        
		case 2: 
			
				break;
				
		case 3:
			
				break;
				
		case 4:
			
				break;
				
		case 5:
			//EmployeeDAOImpl impl5 = new EmployeeDAOImpl();
			//EmployeeBean bean = impl5.searchEmployeeData(sc.nextInt());
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean = dao5.searchEmployeeData(sc.nextInt());
			
			if(bean!=null) {
				System.out.println("Id is: "+bean.getId());
				System.out.println("Name is: "+bean.getName());
				System.out.println("Salary is: "+bean.getSalary());
				System.out.println("Gender is: "+bean.getGender());
				System.out.println("*******************************");
				
			}
		}
			}

}
