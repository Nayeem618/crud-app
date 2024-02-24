package com.okta.developer.crud.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "Experience")
public class Experience {

    @Id
    @GeneratedValue
    private Long experience_id;
    private Long user_id;
    private String company_name;
    private  String title;
    private  String location;
    private Instant start_date;
    private  Instant end_date;

    @OneToOne
    private Users users;
}
