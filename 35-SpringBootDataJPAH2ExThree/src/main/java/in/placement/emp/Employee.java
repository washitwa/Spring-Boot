package in.placement.emp;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="empTab")
@Component
public class Employee {
	
	@Id
	@Column(name="eid")
	@GeneratedValue
	private Integer empId;
	
	@Column(name="ename")
	@NonNull
	private String empName;
	
	@Column(name="esal")
	@NonNull
	private Double empSal;
}
