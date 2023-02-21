package Studentmanagement.Hibernate_exercise.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "teacher")

public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Teacher_id;
    private String Teacher_subject;

    @ManyToMany(mappedBy = "teachers",cascade = {CascadeType.ALL})
    private Set<Student_manytomany> students=new HashSet<>();

    public Teacher(){
        super();
    }

    //Teacher(){}

    public Teacher(int Teacher_id,String Teacher_subject){
        this.Teacher_id=Teacher_id;
        //this.Teacher_name=Teacher_name;
        this.Teacher_subject=Teacher_subject;
    }

    public int getTeacher_id() {
        return Teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        Teacher_id = teacher_id;
    }

    public String getTeacher_subject() {
        return Teacher_subject;
    }

    public void setTeacher_subject(String teacher_subject) {
        Teacher_subject = teacher_subject;
    }

    public Set<Student_manytomany> getStudents() {
        return students;
    }

    public void setStudents(Set<Student_manytomany> students) {
        this.students = students;
    }
}
