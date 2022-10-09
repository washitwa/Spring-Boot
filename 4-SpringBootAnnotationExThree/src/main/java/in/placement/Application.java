package in.placement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(Application.class, args);
		Employee e = con.getBean("eob", Employee.class);
		System.out.println("emp object: "+e);
		System.out.println(e.toString());
	}

}
