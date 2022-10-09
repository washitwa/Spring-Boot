package in.placement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vob")
public class Vendor {

	@Value("5")
	private int vid;
	@Value("RA")
	private String vcode;
	@Autowired
	Contract cnt;
	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", vcode=" + vcode + ", cnt=" + cnt + "]";
	}
	
	
}
