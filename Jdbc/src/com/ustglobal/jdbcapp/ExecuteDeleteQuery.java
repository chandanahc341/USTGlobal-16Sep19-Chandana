package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class ExecuteDeleteQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			String url = "jdbc:mysql://localhost:3307/ust_ty_db?" + "user=root&password=root";
			conn = DriverManager.getConnection(url);

			String sql = "delete from  employee_info  where id=3";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			System.out.println(count +	"Rows deleted");
		} catch (SQLException e) {
			e.printStackTrace();

		}finally {
			
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