package in.placement.runn;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import in.placement.repo.StudRepo;
import in.placement.stud.Student;

@Component
public class StudentRunner implements CommandLineRunner {

	@Autowired
	private StudRepo repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Connection Established");
		
		repo.saveAll(Arrays.asList(
				new Student(101, "A", "Core Java", 1.5),
				new Student(102, "B", "Adv. Java", 1.3),
				new Student(103, "C", "MySQL", 1.4),
				new Student(104, "D", "C Lang", 1.2),
				new Student(105, "E", "Node JS", 1.9),
				new Student(106, "F", "Angular", 1.6),
				new Student(107, "G", "AWS", 2.4),
				new Student(108, "H", "GCP", 2.1),
				new Student(109, "I", "Azure", 0.4),
				new Student(110, "J", "Flutter", 5.7),
				new Student(111, "K", "Neo4j", 1.9)
		));
		
		Sort sort = Sort.by(Direction.DESC, "fee");		//Direction is an enum
		repo.findAll(sort).forEach(System.out::println);
		
		Pageable input = PageRequest.of(0, 5);
		Page<Student> pg = repo.findAll(input);
		System.out.println("\n\n-----------------------This is the Page--------------------\n\n");
		List<Student> list = pg.getContent();
		list.forEach(System.out::println);
		
		
		//Additional Info
		System.out.println("Is First Page: "+pg.isFirst());
		System.out.println("Is Last Page: "+pg.isLast());
		System.out.println("Is Empty Page: "+pg.isEmpty());
		System.out.println("Has Next: "+pg.hasNext());
		System.out.println("Has Previous: "+pg.hasPrevious());
		System.out.println("Current Page Number: "+pg.getNumber());
		System.out.println("Total Rows: "+pg.getTotalElements());
		System.out.println("Total Pages: "+pg.getTotalPages());
		
	}

}
