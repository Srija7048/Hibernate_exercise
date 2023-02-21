package Studentmanagement.Hibernate_exercise.Service;

import Studentmanagement.Hibernate_exercise.Entity.Student;
import Studentmanagement.Hibernate_exercise.Repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studentservice {

    @Autowired
    Studentrepository studentrepository;

    public List<Student> findall(){
        return studentrepository.findAll();
    }

    public void save1(Student s){
        studentrepository.save(s);
    }
}
