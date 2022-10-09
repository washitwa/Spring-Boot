package in.placement;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component("cm")
public class CacheManager implements ApplicationRunner {
	
	//No need to explicitly call the run method as it is executed as part of run() method inside main 
	@Override
	public void run(ApplicationArguments args) throws Exception {
		//logic to load data into cache
		System.out.println("Cache Manager");
	}

}
