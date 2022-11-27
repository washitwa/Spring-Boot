package in.placement.repo;

import org.springframework.data.repository.CrudRepository;

import in.placement.emp.Employee;

public interface EmpRepository extends CrudRepository<Employee, Integer> {

}
