package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class ExecuteInsertPreparedStmt {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			String url = "jdbc:mysql://localhost:3307/ust_ty_db?" + "user=root&password=root";
			conn = DriverManager.getConnection(url);

			String sql = "insert into employee_info values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			String eid = args[0];
			int id = Integer.parseInt(eid);
			pstmt.setInt(1, id);
			
			String ename = args[1];
			pstmt.setString(2, ename);
			
			String esalary = args[2];
			int salary = Integer.parseInt(esalary);
			pstmt.setInt(3, salary);
			
			String egender = args[3];
			pstmt.setString(4, egender);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "Rows inserted");
			
			} catch (SQLException e) {
			e.printStackTrace();

		}finally {
			
			if(pstmt!=null) {
				try {
					pstmt.close();
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