package in.placement.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.placement.model.Product;

@Component("t")
public class TestRunner implements CommandLineRunner {
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Product p = new Product(10);
		
		
		
		System.out.println(p);

	}

}
