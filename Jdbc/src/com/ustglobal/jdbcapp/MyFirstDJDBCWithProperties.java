package com.ustglobal.jdbcapp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MyFirstDJDBCWithProperties {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;

		try {

			reader = new FileReader("db.properties");
			Properties prop = new  Properties();
			prop.load(reader);

//			Driver driver= new Driver();
//			DriverManager.registerDriver(driver);

			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url, prop);
			
			stmt = conn.createStatement();
			String sql = "select * from employee_info";
			rs = stmt.executeQuery(sql);


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

			// 5th step......

			try {

				if(rs!=null) {
					rs.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(conn!=null) {
					conn.close();
				}

				if(reader!=null) {
					reader.close();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}

