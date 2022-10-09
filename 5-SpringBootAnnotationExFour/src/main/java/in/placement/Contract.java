package in.placement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cob")
public class Contract {
	@Value("55")
	private int cid;
	@Value("NIT")
	private String code;
	@Value("5000")
	private double amt;
	@Override
	public String toString() {
		return "Contract [cid=" + cid + ", code=" + code + ", amt=" + amt + "]";
	}
	
	
	
}
