package in.placement.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("m")
@ConfigurationProperties(prefix="my.project")
public class MyDataRunner implements CommandLineRunner {
	
	private int version;
	private String code;
	private int pin;
	
	
	
	public int getVersion() {
		return version;
	}



	public void setVersion(int version) {
		this.version = version;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public int getPin() {
		return pin;
	}



	public void setPin(int pin) {
		this.pin = pin;
	}



	@Override
	public void run(String... args) throws Exception {
		
		
	}



	@Override
	public String toString() {
		return "MyDataRunner [version=" + version + ", code=" + code + ", pin=" + pin + "]";
	}

	
}
