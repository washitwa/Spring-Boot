package in.placement.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component("eu")
public class EmailUtil {
	
	@Autowired
	private JavaMailSender sender;	//Has-A
	
	public boolean send(String to, String cc[], String bcc[], String subject, String text, Resource file) {
		
		boolean flag = false;		//Failure
		
		try {
			
			//1. Create Empty Message
			MimeMessage message = sender.createMimeMessage();
			
			//2. Set Details			
			MimeMessageHelper helper = new MimeMessageHelper(message, file!=null?true:false);
			
			// Set Details
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(text);
			
			if(cc!=null && cc.length>0)
				helper.setCc(cc);
			if(bcc!=null && bcc.length>0)
				helper.setBcc(bcc);
			
			if(file!=null)
				helper.addAttachment(file.getFilename(), file);
			
			//3. Send Message
			sender.send(message);
			
			
			
			flag = true;		//Success
		}catch(Exception e) {
			flag = false;
			e.printStackTrace();
		}
		
		
		return flag;
	}
}
