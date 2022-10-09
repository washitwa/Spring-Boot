package in.placement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component("l")
public class LombokTest implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Product p = new Product(10);
		System.out.println(p);
	}


}
