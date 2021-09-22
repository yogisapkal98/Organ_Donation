package com.organdonation.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class SendRequestServlet
 */
public class SendRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendRequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
    static String username;
    static String pass;
    static String subject;
    static String message;
    static String to; 
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        to = request.getParameter("to");
        subject = request.getParameter("subject");
        message =  request.getParameter("msg");
        username =request.getParameter("user");
        pass=request.getParameter("pass");
        
		
        
        try {
			sendMail(to);
			
			
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        RequestDispatcher rd=request.getRequestDispatcher("mailsuccessfull.jsp");
        rd.forward(request, response);
	}
	
	public static void sendMail(String reciepents) throws AddressException, MessagingException {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		System.out.println("preparing For Mail Sending "+subject);
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");

	
		
		Session session = Session.getInstance(properties, new Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, pass);
			};
		});
		Message message = prepareMassage(session, username, reciepents);
		Transport.send(message);
		System.out.println("Succesfully sent");

	}

	private static Message prepareMassage(Session session, String username, String reciepents)
			throws AddressException, MessagingException {
		// TODO Auto-generated method stub
		
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(username));
		msg.setRecipient(Message.RecipientType.TO, new InternetAddress(reciepents));
		
		msg.setSubject(subject);
		msg.setText(message);
		
		return msg;
	}

}
