package com.okta.developer.crud.model;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Experience")
public class Experience {

    @Id
    @GeneratedValue
    private Long experience_id;
    private String company_name;
    private  String title;
    private  String location;
    private Date start_date;
    private  Date end_date;
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users users;

    public Experience() {
    }

    public Experience(String company_name, String title, String location, Date start_date, Date end_date, Users users) {
        this.company_name = company_name;
        this.title = title;
        this.location = location;
        this.start_date = start_date;
        this.end_date = end_date;
        this.users = users;
    }

    public Long getExperience_id() {
        return experience_id;
    }

    public void setExperience_id(Long experience_id) {
        this.experience_id = experience_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
        return "Experience{" +
                "experience_id=" + experience_id +
                ", company_name='" + company_name + '\'' +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", users=" + users +
                '}';
    }
}
