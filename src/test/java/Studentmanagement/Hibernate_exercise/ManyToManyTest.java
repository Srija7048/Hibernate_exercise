package Studentmanagement.Hibernate_exercise;

import Studentmanagement.Hibernate_exercise.Entity.Student1;
import Studentmanagement.Hibernate_exercise.Entity.Student_manytomany;
import Studentmanagement.Hibernate_exercise.Entity.Teacher;
import Studentmanagement.Hibernate_exercise.Repository.Studentrepository2;
import Studentmanagement.Hibernate_exercise.Service.Studentservice2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

@SpringBootTest
public class ManyToManyTest {
    @Autowired
    Studentservice2 studentservice2;


    @Test
    void saveTeacher() {
        Teacher t1=new Teacher(1,"java");
        Teacher t2=new Teacher(2,"python");
        Teacher t3=new Teacher(3,"science");
        Teacher t4=new Teacher(4,"social");


        Student_manytomany s1 = new Student_manytomany("divya","java");
        Student_manytomany s2 = new Student_manytomany("srija","python");
        Student_manytomany s3=new Student_manytomany("divya","science");
        Student_manytomany s4=new Student_manytomany("srija","social");

        studentservice2.save2(s1);
        studentservice2.save2(s2);
        studentservice2.save2(s3);
        studentservice2.save2(s4);

    }

    @Test
    public void findall(){
        List<Student_manytomany> sl=studentservice2.findall();
        System.out.println(sl);
    }




}
