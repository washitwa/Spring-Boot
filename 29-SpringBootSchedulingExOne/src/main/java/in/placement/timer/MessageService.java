package in.placement.timer;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("ms")
public class MessageService {
	
	
	@Scheduled(fixedDelay=5000)			//5 seconds
	public void service() {
		System.out.println("Hello! Date is: "+new Date());
	}
	//The above method need not be explicitly called. It's run by the container due to the annotation. 
	
	public void service2() {
		System.out.println("This ain't gonna run");
	}
}
