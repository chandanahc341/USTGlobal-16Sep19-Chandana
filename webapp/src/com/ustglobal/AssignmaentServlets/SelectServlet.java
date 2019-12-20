package com.ustglobal.AssignmaentServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SelectServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



		String search = req.getParameter("search");
		int id = Integer.parseInt(search);
	
		
		PrintWriter out  = resp.getWriter();

		String dburl = "jdbc:mysql://localhost:3307/ust_ty_db";
		String query = "select * from employee_info where id ="+id;

		Connection con = null;
		Statement stmt = null;
		ResultSet rst = null;

		try 
		{
			Class.forName("com.mysql.jdbc.Driver");                                            

			con  = DriverManager.getConnection(dburl,"root","root");                            

			stmt = con.createStatement();
			
			rst = stmt.executeQuery(query);

			if(rst.next()) {
			int reg_no = rst.getInt("id");
			String name = rst.getString("name");
			String gender = rst.getString("gender");
			String salary = rst.getString("salary");

			out.println("Id : "+reg_no);
			out.println();
			out.println("Name : "+name);
			out.println();
			out.println("Gender : "+gender);
			out.println();
			out.println("Salary : "+salary);       
			}


		} 
		catch (Exception e)
		{
			e.printStackTrace();

		}
		finally
		{
			try
			{
				if(con != null)
				{
					con.close();
				}
				if(stmt != null)
				{
					stmt.close();
				}
				if(rst != null)
				{
					rst.close();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		} 

	}
}
