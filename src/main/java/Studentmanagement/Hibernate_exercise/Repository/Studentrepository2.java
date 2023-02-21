package Studentmanagement.Hibernate_exercise.Repository;

import Studentmanagement.Hibernate_exercise.Entity.Student_manytomany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepository2 extends JpaRepository<Student_manytomany,Integer> {
}
