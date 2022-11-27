package in.placement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.placement.stud.Student;

public interface StudRepo extends JpaRepository<Student, Integer> {

}
