package com.organdonation.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.mail.MessagingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.organdonation.bean.DonorRegisterBean;
import com.organdonation.dao.DaoClass;

/**
 * Servlet implementation class DonorRegisterServlet
 */
public class DonorRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DonorRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String mobile=request.getParameter("mobile");
		String email=request.getParameter("email");
		String location=request.getParameter("location");
		String country=request.getParameter("country");
		
		DonorRegisterBean u=new DonorRegisterBean(username,password,mobile,email,location,country);
		RequestDispatcher rd;
		DaoClass dao=new DaoClass();
		dao.insertDonor(u);
		try {
			
			RegistrationMail.sendMail(email);
			
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       rd=request.getRequestDispatcher("donor.html");
		rd.forward(request, response);
	}

}
