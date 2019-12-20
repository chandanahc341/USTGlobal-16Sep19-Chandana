package com.ustglobal.employeewebap.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginPageServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		String id = "";
		Cookie[] cookies = req.getCookies();
		if(cookies!=null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("alwaysRemember")) {
					id = cookie.getValue();
				}
			}
		}
		out.println("<fieldset align='center'>");
		out.println("<form action='./login' method='post'>");
		out.println("<table align='center'>");
		out.println("<h1 align='center'>Login Page</h1>");
		out.println("<tr><td>Id:</td>");
		out.println("<td><input type='number' name='id' value='"+id+"'></td></tr>");
		out.println("<tr><td>Password:</td>");
		out.println("<td><input type='password' name='password'></td></tr>");
		out.println("<tr><td>Remember</td>");
		out.println("<td><input type='checkbox' name='rememberme' value='checked'></td></tr>");
		out.println("<tr><td><button type='submit'>login</button></td></tr>");
		out.println("</form></fieldset><a href='register.html'></a>");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req,resp);
	}


}
