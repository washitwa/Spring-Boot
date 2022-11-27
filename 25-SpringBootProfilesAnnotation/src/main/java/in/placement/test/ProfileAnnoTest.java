package in.placement.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.placement.prof.Service;

@Component("pat")
public class ProfileAnnoTest implements CommandLineRunner {

	@Autowired
	//@Qualifier("ea")
	private Service s;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		s.sendMessage();
	}

}
