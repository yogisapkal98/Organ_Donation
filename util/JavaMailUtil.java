package com.organdonation.util;

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

public class JavaMailUtil {

	public static void SendMail(String reciepents) throws AddressException, MessagingException {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		System.out.println("preparing For Mail Sending");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");

		String username = "onlysaay@gmail.com";
		String pass = "sanjeevanee";
		
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
		msg.setSubject("Registered successfully");
		msg.setText("Hello All");

		return msg;
	}

}
