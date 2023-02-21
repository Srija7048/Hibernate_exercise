package Studentmanagement.Hibernate_exercise.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "student_manytomany")
public class Student_manytomany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int student_id;


    @Column(name = "subject")
    private String subject;

    @Column(name = "student_name")
    private String student_name;



    @ManyToMany(cascade={CascadeType.ALL})
    @JoinTable(
            name="Student To Teacher",
            joinColumns = {@JoinColumn(name = "subject")},
            inverseJoinColumns = {@JoinColumn(name = "Teacher_subject")}
    )
    Set<Teacher> teachers=new HashSet<>();

    public Student_manytomany(){
        super();
    }

    public Student_manytomany(String student_name,String subject){
        //this.student_id=student_id;
        this.student_name=student_name;
        this.subject=subject;
        //this.teachers=teachers;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Set<Teacher> getteachers(){
        return teachers;
    }
    public void setteachers(Set<Teacher> teachers){
        this.teachers=teachers;

    }
}
