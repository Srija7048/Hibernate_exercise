package Studentmanagement.Hibernate_exercise;

import Studentmanagement.Hibernate_exercise.Entity.Address;
import Studentmanagement.Hibernate_exercise.Entity.Student;
import Studentmanagement.Hibernate_exercise.Service.Studentservice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HibernateExerciseApplicationTests {

	@Autowired
	Studentservice studentservice;

	@Test
	void testContext() {
		System.out.println("Hello World");
	}

	@Test
	void testFindAll() {
		List<Student> students=studentservice.findall();
		System.out.println(students);
	}

	@Test
	void saveStudent(){
		System.out.println("line number 27");
		Student s=new Student();
		s.setStudent_mobile(9876543210L);
		s.setStudent_name("divya");
		s.setStudent_dob(10042002);
		s.setStudent_address("vijayawada,ap");
		//s.setStudent_id(10);
		Address address=new Address();
		address.setDoor("9-888");
		address.setCity("vijayawada");
		address.setState("ap");
		s.setAddress(address);
		studentservice.save1(s);

	}

}
