package in.placement.scheduler;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("frs")
public class FixedRateScheduler {
	
	@Scheduled(fixedRate=5000)
	public void execute() {
		System.out.println("Hello! Time is: "+new Date());
	}
	
}
