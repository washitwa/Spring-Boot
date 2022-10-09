package in.placement;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public EmpExport eob() {
		EmpExport e = new EmpExport();
		e.setCode(500);
		e.setName("ABC");
		return e;
	}
}
