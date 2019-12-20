package com.ustglobal.jdbcapp;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {
	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);


			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);

			String eid = args[0];
			int id = Integer.parseInt(eid);
			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();

			if(rs.next()) {
				int e_id = rs.getInt("id");
				int sal = rs.getInt("salary");
				String name = rs.getString("name");
				String gen = rs.getString("gender");


				System.out.println("Id is "+e_id);
				System.out.println("Name is "+name);
				System.out.println("Salary is "+sal);
				System.out.println("Gender is " +gen);
				System.out.println("********************");
			}

		}catch (SQLException e) {
			e.printStackTrace();

		}finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}


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





