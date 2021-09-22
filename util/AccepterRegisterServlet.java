package com.organdonation.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.mail.MessagingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.organdonation.bean.AccepterRegisterBean;
import com.organdonation.dao.DaoClass;

/**
 * Servlet implementation class AccepterRegisterServlet
 */
public class AccepterRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccepterRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String mobile=request.getParameter("mobile");
		String email=request.getParameter("email");
		String location=request.getParameter("location");
		String country=request.getParameter("country");
		System.out.println(email);
		AccepterRegisterBean u=new AccepterRegisterBean(username,password,mobile,email,location,country);
		RequestDispatcher rd;
		DaoClass dao=new DaoClass();
		int i=dao.insertAccepter(u);
		 try {
				RegistrationMail.sendMail(email);
				
				
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
		rd=request.getRequestDispatcher("accepterLogin.html");
		rd.forward(request, response);

	}

}
