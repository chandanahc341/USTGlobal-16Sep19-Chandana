package com.ustglobal.employeewebap.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.employeewebap.dao.EmployeeDAO;
import com.ustglobal.employeewebap.dto.EmployeeInfo;
import com.ustglobal.employeewebap.util.EmployeeDAOManager;


@WebServlet("/search")
public class SearchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		if(session==null) {
			RequestDispatcher dispatcher =  req.getRequestDispatcher("/login.html");
			dispatcher.forward(req, resp);
		}else {
			int id = Integer.parseInt(req.getParameter("id"));
			EmployeeDAO dao = EmployeeDAOManager.getEmployeeDAO();
			EmployeeInfo info = dao.searchEmployee(id);


			req.setAttribute("info", info);
			RequestDispatcher dispatcher = req.getRequestDispatcher("/search.jsp");
			dispatcher.forward(req, resp);

			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<a href='./home'>Home</a>");
			out.println("<a style='float:right' href='./logout'>Logout</a>");
			if(info!=null) {
				out.println("<table align='center'>");
				out.println("<tr>");
				out.println("<th>Id</th><th>Name</th><th>Email</th>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>");
				out.println(info.getId());
				out.println("</td>");
				out.println("<td>");
				out.println(info.getName());
				out.println("</td>");
				out.println("<td>");
				out.println(info.getEmail());
				out.println("</td>");
				out.println("</tr>");
				out.println("</table>");
			}else {
				out.println("No data found");
			}
			out.println("</body>");
			out.println("</html>");
		}
	}
	//end of doGet
}//end of SearchServlet
