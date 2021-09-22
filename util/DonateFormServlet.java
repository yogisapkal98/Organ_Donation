package com.organdonation.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.organdonation.bean.DonateFormBean;
import com.organdonation.dao.DaoClass;

/**
 * Servlet implementation class DonateFormServlet
 */
public class DonateFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DonateFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		String username=request.getParameter("username");
		String age=request.getParameter("age");
		String bloodgp=request.getParameter("bloodgp");
		String mobile=request.getParameter("mobile");
		String email=request.getParameter("email");
		String location=request.getParameter("location");
		String organ=request.getParameter("organ");
		
		DonateFormBean u=new DonateFormBean(username,age,bloodgp,mobile,email,location,organ);
		RequestDispatcher rd;
		DaoClass dao=new DaoClass();
		dao.insertDonate(u);
		rd=request.getRequestDispatcher("thankYouDonor.jsp");
		rd.forward(request, response);
	
    }

}
