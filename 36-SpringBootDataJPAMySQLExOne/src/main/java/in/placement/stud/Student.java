package in.placement.stud;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Student {
	
	@Id
	@Column(name="sid")
	private Integer studId;
	@Column(name="sname", length=30)
	private String studName;
	@Column(name="course", length=30, nullable=false, unique=true)
	private String course;
	@Column(name="fee")
	private Double fee;
}
