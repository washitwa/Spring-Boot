package in.placement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public CommandLineRunner clra() {
		
		//lambda expression syntax
		/*
		CommandLineRunner cob =  (args) -> {
			System.out.println("FROM LAMBDA EXP!");
		};
		return cob;
		*/
		return inputs -> System.out.println("FROM LAMBDA EXP!");
	}
}
