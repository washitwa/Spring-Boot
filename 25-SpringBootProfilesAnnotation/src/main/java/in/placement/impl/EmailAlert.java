package in.placement.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import in.placement.prof.Service;
import lombok.Data;

@Component("ea")
@Profile("ealert")
@Data
public class EmailAlert implements Service {

	@Value("${service}")
	private String service;
	
	@Value("${pin}")
	private Integer pin;
		
	
	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Mail Sent");
		System.out.println("Service is: "+service+"\nPin is: "+pin);
	}

}
