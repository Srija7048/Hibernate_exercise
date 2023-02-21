package Studentmanagement.Hibernate_exercise.Service;

import Studentmanagement.Hibernate_exercise.Entity.Student;
import Studentmanagement.Hibernate_exercise.Entity.Student1;
import Studentmanagement.Hibernate_exercise.Repository.Student1repository;
import Studentmanagement.Hibernate_exercise.Repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

@Service
public class Student1service {

    @Autowired

    Student1repository student1repository;

    public List<Student1> findall(){
        return student1repository.findAll();
    }

    public Student1 findbyid(Integer mobile_id){
        return student1repository.findById(mobile_id).get();
    }
    public void save2(Student1 s){

        student1repository.save(s);
    }
}
