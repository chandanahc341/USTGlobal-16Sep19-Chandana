package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;


public class MyFirstJDBC {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			//step 1 loading Driver
			Class.forName(prop.getProperty("driverPath"));
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			//step 2 get the Connection
			String url = prop.getProperty("url");
			
			conn = DriverManager.getConnection(url,prop);
			
		   //Issue SQL query
			stmt = conn.createStatement();
			rs = stmt.executeQuery(prop.getProperty("select-query"));
			
			//Read the Result
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int salary = rs.getInt("salary");
				String gender = rs.getString("gender");
				System.out.println("Id : "+id);
				System.out.println("Name : "+name);
				System.out.println("Salary : "+salary);
				System.out.println("Gender : "+gender);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

}
