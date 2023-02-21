package Studentmanagement.Hibernate_exercise.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student1")

public class Student1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mobile_id;
    @Column(name = "mobile_number")
    private long mobile_number;

    @Column(name="student1_name")
    private String student1_name;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    //@JoinColumn(name = "mobile_Number",referencedColumnName = "mobile_number")
    List<Mobile> mobile_numbers=new ArrayList<>();

    public Student1(String student1_name,long mobile_number){
        //this.student1_id=student1_id;
        //this.student1_id=student1_id;
        this.student1_name=student1_name;
        //this.student1_mobile=student1_mobile;
        this.mobile_number=mobile_number;
    }

    public int getMobile_id() {
        return mobile_id;
    }

    public void setMobile_id(int mobile_id) {
        this.mobile_id = mobile_id;
    }

    public long getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(long mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getStudent1_name() {
        return student1_name;
    }

    public void setStudent1_name(String student1_name) {
        this.student1_name = student1_name;
    }


    public List<Mobile> getMobile_numbers() {
        return mobile_numbers;
    }

    public void setMobile_numbers(List<Mobile> mobile_numbers) {
        this.mobile_numbers = mobile_numbers;
    }

    @Override
    public String toString(){
        return "Student { "+"student name "+student1_name+ "mobile number "+mobile_number+" }";

    }
}

