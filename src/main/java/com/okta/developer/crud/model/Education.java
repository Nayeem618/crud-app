package com.okta.developer.crud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Education")
public class Education {

    @Id
    @GeneratedValue
    private Long education_id;
    private Long user_id;
    private String school_name;
    private  String degree;
    private String field_of_study;
    private String start_date;
    private String end_date;

    @OneToOne
    private Users users;
}
