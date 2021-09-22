package com.organdonation.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.organdonation.bean.ContactBean;
import com.organdonation.dao.DaoClass;

/**
 * Servlet implementation class ContactUsServlet
 */
public class ContactUsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactUsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			PrintWriter pw=response.getWriter();
			response.setContentType("text/html");
			
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String mobile=request.getParameter("mobile");
			String message=request.getParameter("message");
			
			ContactBean u=new ContactBean(name,email,mobile,message);
			
			DaoClass dao=new DaoClass();
			dao.contactUs(u);
			
			RequestDispatcher rd=request.getRequestDispatcher("contactResponse.html");
			rd.forward(request, response);
	}

}
