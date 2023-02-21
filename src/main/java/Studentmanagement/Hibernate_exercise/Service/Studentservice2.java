package Studentmanagement.Hibernate_exercise.Service;

import Studentmanagement.Hibernate_exercise.Entity.Student1;
import Studentmanagement.Hibernate_exercise.Entity.Student_manytomany;
import Studentmanagement.Hibernate_exercise.Repository.Studentrepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class Studentservice2 {
    @Autowired
    Studentrepository2 studentrepository2;

    public List<Student_manytomany> findall(){
        return studentrepository2.findAll();
    }

    public Student_manytomany findbyid(Integer student_id){
        return studentrepository2.findById(student_id).get();
    }
    public void save2(Student_manytomany s){
        studentrepository2.save(s);
    }


}
