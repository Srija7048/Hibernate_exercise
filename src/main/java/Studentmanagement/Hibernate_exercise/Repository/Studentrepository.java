package Studentmanagement.Hibernate_exercise.Repository;

import Studentmanagement.Hibernate_exercise.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepository extends JpaRepository<Student,Integer> {
}
