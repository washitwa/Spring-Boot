package in.placement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(Application.class, args);
		EmpExport e = con.getBean("eob", EmpExport.class);
		System.out.println(e);
	}

}
