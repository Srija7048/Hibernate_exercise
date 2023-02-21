package Studentmanagement.Hibernate_exercise.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "mobile")

public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int mobile_id;
    private long mobile_number;

    private int country_code;

    public Mobile(){}

    public Mobile(int country_code,long mobile_number){
        this.country_code=country_code;
        this.mobile_number=mobile_number;
        //this.student1_id=student1_id;
    }

    public int getCountry_code() {
        return country_code;
    }

    public void setCountry_code(int country_code) {
        this.country_code = country_code;
    }

    public long getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(long mobile_number) {
        this.mobile_number = mobile_number;
    }



    @Override
    public String toString() {
        return "Mobile {" +
                " mobile number is " + mobile_number  +
                '}';
    }


}
