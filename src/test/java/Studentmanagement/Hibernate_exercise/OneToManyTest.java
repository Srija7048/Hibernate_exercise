package Studentmanagement.Hibernate_exercise;

import Studentmanagement.Hibernate_exercise.Entity.*;
import Studentmanagement.Hibernate_exercise.Service.Student1service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class OneToManyTest {

    @Autowired
    Student1service student1service;

    @Test
    void savemobile() {
        Student1 sll = new Student1("divya",9876543210L);

        Mobile m1 = new Mobile(91,9876543210L);
        Mobile m2 = new Mobile(11,8765432109L);
        Mobile m3 = new Mobile(01,7695437890L);

        sll.getMobile_numbers().add(m1);
        sll.getMobile_numbers().add(m2);
        sll.getMobile_numbers().add(m3);


        student1service.save2(sll);

    }

    @Test
    public void findall(){
        List<Student1> sl=student1service.findall();
        System.out.println(sl);
    }

}
