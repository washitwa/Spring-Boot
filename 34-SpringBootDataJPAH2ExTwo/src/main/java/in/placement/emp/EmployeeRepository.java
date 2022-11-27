package in.placement.emp;

import org.springframework.data.repository.CrudRepository;

import in.placement.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
