package in.placement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.placement.runner.MyDataRunner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(Application.class, args);
		MyDataRunner mdr = con.getBean("m", MyDataRunner.class);
		System.out.println(mdr);
	}

}
