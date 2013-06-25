package com.techcodepro.mongoservice;



import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class EmailSettings {
	public static void main(String[] args) throws IOException {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
 
		Session session = Session.getDefaultInstance(props,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("admin@techcodepro.com","rajASU129");
				}
			});
 
		System.out.println(session);
		
		try {
 
			Message message = new MimeMessage(session);
		
			message.setFrom(new InternetAddress("from@no-spam.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse("rajeev1.singla@gmail.com"));
			message.setSubject("User Password Change");
			message.setText("Dear User," +
					"\n\n This is the URL to change your password! \n\n Thanks" +
					"\nTechCodePro Team");
 
			System.out.println(message.getContent());
			
			Transport.send(message);
			
			
 
			System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}