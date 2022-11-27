package in.placement.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component("pt")
public class ProfileTest implements CommandLineRunner {

	
	@Value("${dbname}")
	private String dbname;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DB Name: "+dbname);
	}

}
