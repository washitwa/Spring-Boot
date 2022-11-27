package in.placement.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cpr")
@Data
@ConfigurationProperties(prefix="my.app")
public class ChildProfileRunner implements CommandLineRunner{

	private String title;
	private String ver;
	private String driver;
	private String url;
	private String host;
	private Integer port;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);
	}

}
