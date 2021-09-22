package com.organdonation.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.organdonation.bean.DonorLoginBean;
import com.organdonation.dao.DaoClass;

/**
 * Servlet implementation class DonorLoginServlet
 */
public class DonorLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DonorLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		RequestDispatcher rd;
		
		DonorLoginBean ab=new DonorLoginBean(username,password);
		DaoClass a=new DaoClass();
		
		if(a.donorcheck(ab)) {
			rd=request.getRequestDispatcher("donateForm.html");
			rd.forward(request, response);
		}
		else {
			rd=request.getRequestDispatcher("donor.html");
			rd.include(request, response);
		}
	}

}
