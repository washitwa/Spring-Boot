package in.placement.lom;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.placement.college.Student;

@Component("t")
public class TestLombok implements CommandLineRunner {

	
	@Override
	public void run(String... args) throws Exception {
		
		Student s1 = new Student();
		s1.setSid(100);
		
		Student s2 = new Student();
		s2.setSid(50);
		System.out.println("Executed");
		
		System.out.println(s1);
		System.out.println(s2);
		
		boolean a = s1.equals(s2);
		boolean b = s1==s2;
		
		System.out.println("equals: "+a);
		System.out.println("==: "+b);
		
	}

	
}
