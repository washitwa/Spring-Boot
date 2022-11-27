package in.placement.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component("str")
public class StopwatchTestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		StopWatch watch = new StopWatch();
		
		watch.start();
		
		for(int i=1;i<=10000000;i++) {
			double result = Math.pow(i+1, i) + Math.pow(3, i);
			
		}
		watch.stop();
		System.out.println("Total time taken is: "+watch.getTotalTimeMillis()+" milliseconds");
		System.out.println("Total time taken is: "+watch.getTotalTimeSeconds()+" seconds");
		
	}

}
