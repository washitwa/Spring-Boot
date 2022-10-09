package in.placement.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component("m")
public class MyPropsRunner implements CommandLineRunner {
	
	@Value("${app-id}")
	private int appid; 
	

	@Value("${title}")
	private String title; 
	
	@Value("${version}")
	private double version; 
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Executed");
	}
	@Override
	public String toString() {
		return "MyPropsRunner [appid=" + appid + ", title=" + title + ", version=" + version + "]";
	}

}
