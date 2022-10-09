package in.placement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//import all packages at one Ctrl+Shift+O
@Component("pro")
public class Product {
	
	@Value("5")
	private int pid;
	
	@Value("PEN")
	private String pName;
	
	protected void display() {
		System.out.println("Product ID: "+pid+"\nProduct Name: "+pName);
	}
}
