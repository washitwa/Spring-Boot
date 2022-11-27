package in.placement.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Entity
@Table(name="empTab")
@Component("em")
public class Employee {
	
	@Id		//Primary Key
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	@Column(name="esal")
	private Double empSal;
}
