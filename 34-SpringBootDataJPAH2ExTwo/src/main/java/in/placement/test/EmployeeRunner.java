package in.placement.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.placement.emp.EmployeeRepository;
import in.placement.model.Employee;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.setEmpid(101);
		emp.setEmpName("Washitwa");
		emp.setEmpSal(1500000.0);
		/*OR use 
		 * @NoArgsConstructor
		 * @AllArgsConstructor
		 * in Employee class to directly enter vales during instance creation as shown below
		 * Employee emp = new  Employee(101, "Washitwa", 1500000.0);
		 * i.e., in one line :)
		 * 
		 */
		repo.save(emp);
		repo.save(new Employee(102, "Redfrost", 1200000.0));
		
		System.out.println("Implementing class name: "+repo.getClass().getName());
	}

}
