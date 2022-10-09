package in.placement.runner;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("m")
@ConfigurationProperties(prefix="my.app")
public class MyDataRunner implements CommandLineRunner {
	
	private Map<String, Integer> exam;

	public Map<String, Integer> getExam() {
		return exam;
	}


	public void setExam(Map<String, Integer> exam) {
		this.exam = exam;
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "MyDataRunner [exam=" + exam + "]";
	}

}
