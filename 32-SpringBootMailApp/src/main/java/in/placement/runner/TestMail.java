package in.placement.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import in.placement.util.EmailUtil;

@Component
public class TestMail implements CommandLineRunner {
	
	@Autowired
	private EmailUtil obj;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		FileSystemResource file = new FileSystemResource("‪D\\COMIC ART\\A50.jpg");
		
		boolean flag = obj.send("jwashitwa@yahoo.com", null, null, "Batman Pic", "Sample", file);
		if(flag)
			System.out.println("Successful");
		else
			System.out.println("Failure");
	}

}
