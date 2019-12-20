package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class DynamicUpdateQuery {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			String url = "jdbc:mysql://localhost:3307/ust_ty_db?" + "user=root&password=root";
			conn = DriverManager.getConnection(url);

			String sql = "update employee_info set name=? ,salary=?,gender=? where id=?";
			pstmt = conn.prepareStatement(sql);
			

			String empid = args[3];
			int id = Integer.parseInt(empid);


			String name = args[0];

			String empsal = args[1];
			int sal = Integer.parseInt(empsal);

			String gender = args[2];

			pstmt.setInt(4, id);
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			pstmt.setString(3, gender);

			int count = pstmt.executeUpdate();
			System.out.println(count +	"Rows updated");
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