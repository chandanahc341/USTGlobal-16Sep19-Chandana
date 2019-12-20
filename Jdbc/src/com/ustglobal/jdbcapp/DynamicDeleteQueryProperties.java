package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class DynamicDeleteQueryProperties {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String url = "jdbc:mysql://localhost:3307/ust_ty_db?" + "user=root&password=root";
			conn = DriverManager.getConnection(url);

			String sql = "delete from  employee_info  where id=?";
			pstmt = conn.prepareStatement(sql);
			String eid = args[0];
			int id = Integer.parseInt(eid);
			pstmt.setInt(1, id);
			
			int count = pstmt.executeUpdate();
			System.out.println(count +	"Rows deleted");
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