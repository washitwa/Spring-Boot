package in.placement.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("drr")
@Data
@ConfigurationProperties(prefix="my.app")
public class DataReadRunner implements CommandLineRunner {

	private String driver;
	private String url;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);
	}

}
