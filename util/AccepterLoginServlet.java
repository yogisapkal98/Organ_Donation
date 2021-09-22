package com.organdonation.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.organdonation.bean.AccepterLoginBean;
import com.organdonation.bean.DonorLoginBean;
import com.organdonation.dao.DaoClass;

/**
 * Servlet implementation class AccepterLoginServlet
 */
public class AccepterLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccepterLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		RequestDispatcher rd;
		
		AccepterLoginBean ab=new AccepterLoginBean(username,password);
		
		DaoClass a=new DaoClass();
		
		if(a.acceptercheck(ab)==true) {
			rd=request.getRequestDispatcher("search.jsp");
			rd.forward(request, response);
			
		}
		else {
			pw.write("Please enter valid data");
			rd=request.getRequestDispatcher("accepterLogin.html");
			rd.include(request, response);
		}

	}


}
