package in.placement.runner;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("m")
@ConfigurationProperties(prefix="my.app")
public class MyDataRunner implements CommandLineRunner {
	
	private List<String> colors;


	public List<String> getColors() {
		return colors;
	}


	public void setColors(List<String> colors) {
		this.colors = colors;
	}


	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Executed");
	}
	@Override
	public String toString() {
		return "MyDataRunner [colors=" + colors + "]";
	}
}
