package in.placement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.placement.runner.MyPropsRunner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(Application.class, args);
		MyPropsRunner mpr = con.getBean("m", MyPropsRunner.class);
		System.out.println(mpr);
	}

}
