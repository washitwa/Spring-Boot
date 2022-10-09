package in.placement.reader;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:abc.properties")
@Component("dr")
public class DataReader implements CommandLineRunner{
	
	@Value("${cdef}")
	private Integer code;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Executed: "+code);
	}

}
