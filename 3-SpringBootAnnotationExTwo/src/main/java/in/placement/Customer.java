package in.placement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cob")
public class Customer {

	@Value("33")
	private int cid;
	
	@Value("ABC")
	private String cName;
	
	protected void display() {
		System.out.println("Customer ID: "+cid+"\nCustomer Name: "+cName);
	}
	
	
}
