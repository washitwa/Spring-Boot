package in.placement.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component("r")
public class RunnerTest implements CommandLineRunner {

	@Value("${title}")
	private String title;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Title is: "+title);
		System.out.println(Arrays.asList(args));
	}

}
