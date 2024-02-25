package com.okta.developer.crud.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Education")
public class Education {

    @Id
    @GeneratedValue
    private Long education_id;
    private String school_name;
    private  String degree;
    private String field_of_study;
    private Date start_date;
    private Date end_date;
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users users;

    public Education(String school_name, String degree, String field_of_study, Date start_date, Date end_date, Users users) {
        this.school_name = school_name;
        this.degree = degree;
        this.field_of_study = field_of_study;
        this.start_date = start_date;
        this.end_date = end_date;
        this.users = users;
    }

    public Education() {

    }

    public Long getEducation_id() {
        return education_id;
    }

    public void setEducation_id(Long education_id) {
        this.education_id = education_id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getField_of_study() {
        return field_of_study;
    }

    public void setField_of_study(String field_of_study) {
        this.field_of_study = field_of_study;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Education{" +
                "education_id=" + education_id +
                ", school_name='" + school_name + '\'' +
                ", degree='" + degree + '\'' +
                ", field_of_study='" + field_of_study + '\'' +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", users=" + users +
                '}';
    }
}
