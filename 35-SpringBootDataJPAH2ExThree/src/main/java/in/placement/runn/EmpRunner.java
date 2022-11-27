package in.placement.runn;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.placement.emp.Employee;
import in.placement.repo.EmpRepository;

@Component
public class EmpRunner implements CommandLineRunner {

	@Autowired
	private EmpRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//save method
		/*
		 * repo.save(new Employee("Washitwa",15.0)); 
		 * repo.save(new Employee("Redfrost",13.0));
		*/
		
		
		/*
		 * ArrayList<Employee> alist = new ArrayList<>(); alist.add(new
		 * Employee("Washitwa", 101.0)); alist.add(new Employee("Redfrost", 150.0));
		 * 
		 * repo.saveAll(alist);
		 */
		
		//Create A Table
		//saveAll method
		repo.saveAll(Arrays.asList(
				new Employee("Washitwa", 15.0),
				new Employee("Redfrost", 13.0)
				));
		
		//Read a value by Id
		//findBy method
		Optional<Employee> opt = repo.findById(1);
		if(opt.isPresent())
			System.out.println(opt.get());
		else
			System.out.println("Record not found");
		
		
		//existsById method
		Boolean b = repo.existsById(5);
		System.out.println(b);
		
		//findAll method
		Iterable<Employee> em = repo.findAll();
		Iterator<Employee> itr = em.iterator();
		
		while(itr.hasNext()) {
			Employee e = itr.next();
			System.out.println(e);
		}
		
		//System.exit(0);
	}

}
