package in.placement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aob")
public class Address {

	@Value("5-A")
	private String hno;
	
	@Value("HYD")
	private String loc;

	//to create the toString method directly
	//alt+shift+s
	//s again
	//then generate
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", loc=" + loc + "]";
	}
	
	
}
