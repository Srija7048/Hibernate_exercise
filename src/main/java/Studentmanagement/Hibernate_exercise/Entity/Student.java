package Studentmanagement.Hibernate_exercise.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")

@Setter
@Getter

public class Student {


    @Column(name = "student_mobile")
    long student_mobile;

    @Column(name="student_name")
    String student_name;


   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "student_id")
    int student_id;


    @Column(name="student_address")
    String student_address;

    @Column(name = "student_dob")
    int student_dob;

    @Column(name = "student_door")
    String student_door;


    @OneToOne(cascade = CascadeType.ALL)
    Address address;



    @Override
    public String toString(){
        return "Student { "+"student id "+student_id+" student name "+student_name+" student dob "+student_dob+" }";

    }
}
