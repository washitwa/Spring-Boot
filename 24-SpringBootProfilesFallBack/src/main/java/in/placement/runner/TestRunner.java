package in.placement.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component("tr")
public class TestRunner implements CommandLineRunner {

	@Value("${app.db}")
	private String db;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Db is: "+db);
	}

}
