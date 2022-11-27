package in.placement.scheduling;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronScheduling {

	@Scheduled(cron = "5 * * * * *")
	public void service() {
		System.out.println("Hello: "+new Date());
	}
}
