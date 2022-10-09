package in.placement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(Application.class, args);
		
		Customer c = con.getBean("cob", Customer.class);
		c.display();
	}

}
