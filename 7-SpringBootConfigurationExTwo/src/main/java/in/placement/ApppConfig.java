package in.placement;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApppConfig {

	@Bean
	public JsonJob js() {
		JsonJob j = new JsonJob();
		j.setSchedule("9AM");
		return j;
	}
}
